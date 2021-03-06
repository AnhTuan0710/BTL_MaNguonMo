package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperTaiKhoan implements RowMapper<TaiKhoan> {

	public TaiKhoan mapRow(ResultSet rs, int rowNum) throws SQLException {
		TaiKhoan taiKhoan = new TaiKhoan();
		taiKhoan.setId(rs.getInt("ID"));
		taiKhoan.setTenDangNhap(rs.getString("TenDangNhap"));
		taiKhoan.setMatKhau(rs.getString("MatKhau"));
		taiKhoan.setLoaiTaiKhoan(rs.getString("LoaiTaiKhoan"));
		return taiKhoan;
	}
	
}