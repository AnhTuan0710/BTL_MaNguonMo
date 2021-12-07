package MiuMiuShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.MapperThongTinLienHe_KhachHang;
import MiuMiuShop.Entity.ThongTinLienHe_KhachHang;

@Repository
public class ThongTinLienHe_KhachHangDao extends BaseDao{
	public List<ThongTinLienHe_KhachHang> GetDataThongTinLienHe_KhachHang()
	{
		List<ThongTinLienHe_KhachHang> list = new ArrayList<ThongTinLienHe_KhachHang>();
		String sql = "SELECT * FROM ThongTinLienHe_KhachHang";
		list = _jdbcTemplate.query(sql, new MapperThongTinLienHe_KhachHang());
		return list;
	}
	
	public int TaoDataThongTinLienHe_KhachHang(ThongTinLienHe_KhachHang thongTinLienHe_KhachHang)
	{
		final String insertIntoSql = "INSERT INTO ThongTinLienHe_KhachHang (HoTen, DiaChi, SoDienThoai) "
				+ "VALUES('"+ thongTinLienHe_KhachHang.getHoTen() +"', '"
				+ thongTinLienHe_KhachHang.getDiaChi()+ "', '"
				+ thongTinLienHe_KhachHang.getSoDienThoai() +"')";
		KeyHolder keyHolder = new GeneratedKeyHolder();

		_jdbcTemplate.update(
		  new PreparedStatementCreator() {
		    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		      return connection.prepareStatement(insertIntoSql, new String[] {"id"});
		    }
		  }, keyHolder);

		return keyHolder.getKey().intValue();
	}
}
