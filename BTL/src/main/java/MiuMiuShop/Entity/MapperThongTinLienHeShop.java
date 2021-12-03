package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperThongTinLienHeShop implements RowMapper<ThongTinLienHeShop> {

	public ThongTinLienHeShop mapRow(ResultSet rs, int rowNum) throws SQLException {
		ThongTinLienHeShop thongTinLienHeShop = new ThongTinLienHeShop();
		thongTinLienHeShop.setMaLienheShop(rs.getInt("MaLienHeShop"));
		thongTinLienHeShop.setDiaChi(rs.getString("DiaChi"));
		thongTinLienHeShop.setSoDienThoai(rs.getString("SoDienThoai"));
		thongTinLienHeShop.setTenShop(rs.getString("TenShop"));
		return thongTinLienHeShop;
	}
}
