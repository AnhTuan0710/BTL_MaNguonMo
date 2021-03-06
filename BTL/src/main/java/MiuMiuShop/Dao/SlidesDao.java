package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.MapperSlides;
import MiuMiuShop.Entity.Slides;

@Repository
public class SlidesDao extends BaseDao{
	
	public List<Slides> GetDataSlide()
	{
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM Slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
	
	public List<Slides> GetDataSlideHienThi()
	{
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM Slides "
				+ "WHERE TrangThai = '1'"; //Trang thai 0 la an 1 la hien thi
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
	
	public Slides GetDataSlideById(int id)
	{
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM Slides WHERE MaSlide = " + id;
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list.get(0);
	}

	public int SuaSlide(int id, Slides slide) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Slides SET TenSlide = N'" +slide.getTenSlide()+ "', HinhAnh = '" +slide.getHinhAnh()
				+ "', NoiDung = N'" +slide.getNoiDung()+ "', Link = '" +slide.getLink()+"', TrangThai = N'"+slide.getTrangThai()+"' "
				+ "WHERE MaSlide = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int XoaSlide(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Slides "
					+ "WHERE MaSlide = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}

	public int TaoSlide(Slides slide) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Slides VALUES(N'"+slide.getTenSlide()+"', '"
						+slide.getHinhAnh()+"', N'"+slide.getNoiDung()+"', '"
						+slide.getLink()+"', N'"+slide.getTrangThai()+"')";
		int check = _jdbcTemplate.update(sql);
		return check;
	}
}
