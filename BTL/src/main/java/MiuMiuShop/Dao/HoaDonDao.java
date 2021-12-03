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

import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.HoaDon;
import MiuMiuShop.Entity.MapperHoaDon;
import MiuMiuShop.Entity.ThongTinLienHe_KhachHang;

@Repository
public class HoaDonDao extends BaseDao{
	public List<HoaDon> GetDataMenu()
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
		/*
		 * String sql = "INSERT INTO ThongTinLienHe_KhachHang (DiaChi, SoDienThoai) " +
		 * "VALUES('"+ thongTinLienHe_KhachHang.getDiaChi()+ "', '"+
		 * thongTinLienHe_KhachHang.getSoDienThoai() +"')"; thongTinLienHe_KhachHang =
		 * _jdbcTemplate.update(sql, new MapperThongTinLienHe_KhachHang());
		 * 
		 * return thongTinLienHe_KhachHang;
		 */
		KeyHolder keyHolder = new GeneratedKeyHolder();

		_jdbcTemplate.update(
		  new PreparedStatementCreator() {
		    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		      return connection.prepareStatement(sql_, new String[] {"id"});
		    }
		  }, keyHolder);

		return keyHolder.getKey().intValue();
	}
}
