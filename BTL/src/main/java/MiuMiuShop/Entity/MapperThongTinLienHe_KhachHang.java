package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperThongTinLienHe_KhachHang implements RowMapper<ThongTinLienHe_KhachHang> {

	public ThongTinLienHe_KhachHang mapRow(ResultSet rs, int rowNum) throws SQLException {
		ThongTinLienHe_KhachHang thongTinLienHe_KhachHang = new ThongTinLienHe_KhachHang();
		thongTinLienHe_KhachHang.setMaThongTinLienHe_KhachHang(rs.getInt("MaThongTinLienHe_KhachHang"));
		thongTinLienHe_KhachHang.setHoTen(rs.getString("HoTen"));
		thongTinLienHe_KhachHang.setDiaChi(rs.getString("DiaChi"));
		thongTinLienHe_KhachHang.setSoDienThoai(rs.getString("SoDienThoai"));
		return thongTinLienHe_KhachHang;
	}
	
}