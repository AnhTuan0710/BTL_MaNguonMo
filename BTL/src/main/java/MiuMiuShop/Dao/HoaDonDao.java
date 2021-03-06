package MiuMiuShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import MiuMiuShop.Dto.HoaDonDto;
import MiuMiuShop.Dto.MapperHoaDonDto;
import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.HoaDon;
import MiuMiuShop.Entity.MapperHoaDon;

@Repository
public class HoaDonDao extends BaseDao{
	public List<HoaDon> GetDataHoaDon()
	{
		List<HoaDon> list = new ArrayList<HoaDon>();
		String sql = "SELECT * FROM HoaDon";
		list = _jdbcTemplate.query(sql, new MapperHoaDon());
		return list;
	}

	public int TaoHoaDon(int Id, HashMap<Integer, ChiTietHoaDon> hoaDon_DanhSachSanPham, int maThongTinLienHe_KhachHang) {
		int tongTien = 0;
		for(Map.Entry<Integer, ChiTietHoaDon> dongHoaDon : hoaDon_DanhSachSanPham.entrySet())
		{
			tongTien += dongHoaDon.getValue().getSoLuong()
					*dongHoaDon.getValue().getSanPham().getGia();
		}
		
		String trangThai = "Chờ xác nhận";
		String sql = "INSERT INTO HoaDon(TongTien, NgayLapHoaDon, TrangThai, MaThongTinLienHe_KhachHang, ID) VALUES "
				+ "("+ tongTien + ", GETDATE(), N'"+ trangThai + "', " 
				+ maThongTinLienHe_KhachHang + ", "+ Id + ")";
		
		
		int maHoaDon = GetIDLastest(sql);
		
		for(Map.Entry<Integer, ChiTietHoaDon> dongHoaDon : hoaDon_DanhSachSanPham.entrySet())
		{
			sql = "INSERT INTO ChiTietHoaDon VALUES ("+ maHoaDon +", "
					+ dongHoaDon.getValue().getSanPham().getMaSanPham() +", "+ dongHoaDon.getValue().getSoLuong() +")";
			_jdbcTemplate.update(sql);
		}
		return 1;
	}
	
	
	public int GetIDLastest(final String sql_)
	{
		KeyHolder keyHolder = new GeneratedKeyHolder();

		_jdbcTemplate.update(
		  new PreparedStatementCreator() {
		    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		      return connection.prepareStatement(sql_, new String[] {"id"});
		    }
		  }, keyHolder);

		return keyHolder.getKey().intValue();
	}
	
	public List<HoaDonDto> GetHoaDonByID(int id)
	{
		List<HoaDonDto> list = new ArrayList<HoaDonDto>();
		String sql = "SELECT HoaDon.MaHoaDon, HoaDon.TongTien, HoaDon.NgayLapHoaDon, HoaDon.TrangThai, " + 
				"	SanPham.MaSanPham, SanPham.TenSanPham, SanPham.Gia, ThongTinLienHe_KhachHang.HoTen, " + 
				"	ThongTinLienHe_KhachHang.MaThongTinLienHe_KhachHang, ThongTinLienHe_KhachHang.DiaChi, ThongTinLienHe_KhachHang.SoDienThoai, ChiTietHoaDon.SoLuong " + 
				"FROM HoaDon INNER JOIN ThongTinLienHe_KhachHang ON HoaDon.MaThongTinLienHe_KhachHang = ThongTinLienHe_KhachHang.MaThongTinLienHe_KhachHang " + 
				"INNER JOIN ChiTietHoaDon ON HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon " + 
				"INNER JOIN SanPham ON SanPham.MaSanPham = ChiTietHoaDon.MaSanPham "
				+"WHERE HoaDon.MaHoaDon = " + id;
		list = _jdbcTemplate.query(sql, new MapperHoaDonDto());
		return list;
	}
	
	public int XacNhanDon(int id)
	{
		String sql = "UPDATE HoaDon SET HoaDon.TrangThai = N'Xác nhận' WHERE HoaDon.MaHoaDon = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int HuyDon(int id)
	{
		String sql = "UPDATE HoaDon SET HoaDon.TrangThai = N'Hủy' WHERE HoaDon.MaHoaDon = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int ChinhSuaDonHang(int id, HoaDonDto hoaDon)
	{
		String sql = "UPDATE ThongTinLienHe_KhachHang SET HoTen = '"+ hoaDon.getHoTen()+"', DiaChi ='"+ hoaDon.getDiaChi()
					+"', SoDienThoai = '"+hoaDon.getSoDienThoai()+"' "
					+ "WHERE MaThongTinLienHe_KhachHang = " + hoaDon.getMaThongTinLienHe_KhachHang();
		String sql_ = "UPDATE HoaDon SET HoaDon.NgayLapHoaDon = '"+hoaDon.getNgayLapHoaDon()+"' WHERE HoaDon.MaHoaDon = " + id;
		int check = _jdbcTemplate.update(sql);
		check = _jdbcTemplate.update(sql_);
		return check;
	}
}
