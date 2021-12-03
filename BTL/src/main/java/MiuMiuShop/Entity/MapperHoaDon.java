package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperHoaDon implements RowMapper<HoaDon> {

	public HoaDon mapRow(ResultSet rs, int rowNum) throws SQLException {
		HoaDon hoaDon = new HoaDon();
		hoaDon.setMaHoaDon(rs.getInt("MaHoaDon"));
		hoaDon.setTongTien(rs.getInt("TongTien"));
		hoaDon.setNgayLapHoaDon(rs.getDate("NgayLapHoaDon"));
		hoaDon.setTrangThai(rs.getString("TrangThai"));
		hoaDon.setMaLienHe_KhachHang(rs.getInt("MaLienHe_KhachHang"));
		hoaDon.setId(rs.getInt("ID"));
		return hoaDon;
	}
}
