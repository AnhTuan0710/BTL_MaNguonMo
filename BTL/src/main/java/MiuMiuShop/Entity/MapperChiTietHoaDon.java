package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import MiuMiuShop.Dto.SanPhamDto;


public class MapperChiTietHoaDon implements RowMapper<ChiTietHoaDon> {

	public ChiTietHoaDon mapRow(ResultSet rs, int rowNum) throws SQLException {
		ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
		chiTietHoaDon.setMaHoaDon(rs.getInt("MaHoaDon"));
		chiTietHoaDon.setSoLuong(rs.getInt("SoLuong"));
		SanPhamDto sanPham = new SanPhamDto();
		sanPham.setMaSanPham(rs.getInt("maSanPham"));
		chiTietHoaDon.setSanPham(sanPham);
		return chiTietHoaDon;
	}
}
