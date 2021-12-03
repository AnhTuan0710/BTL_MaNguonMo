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
}
