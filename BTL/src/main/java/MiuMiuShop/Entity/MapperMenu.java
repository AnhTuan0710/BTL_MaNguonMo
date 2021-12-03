package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperMenu implements RowMapper<Menu> {

	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		Menu menu = new Menu();
		menu.setMaDanhMuc(rs.getInt("madanhmuc"));
		menu.setTenDanhMuc(rs.getString("tendanhmuc"));
		menu.setLink(rs.getString("link"));
		return menu;
	}
}
