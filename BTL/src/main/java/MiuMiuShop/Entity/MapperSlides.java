package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlides implements RowMapper<Slides> {

	public Slides mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slides slides = new Slides();
		slides.setMaSlide(rs.getInt("MaSlide"));
		slides.setTenSlide(rs.getString("TenSlide"));
		slides.setHinhAnh(rs.getString("HinhAnh"));
		slides.setNoiDung(rs.getString("NoiDung"));
		slides.setLink(rs.getString("Link"));
		slides.setTrangThai(rs.getString("TrangThai"));
		return slides;
	}
	
}
