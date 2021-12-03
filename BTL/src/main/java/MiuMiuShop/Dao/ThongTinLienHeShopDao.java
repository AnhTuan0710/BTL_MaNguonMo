package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.MapperThongTinLienHeShop;
import MiuMiuShop.Entity.ThongTinLienHeShop;

@Repository
public class ThongTinLienHeShopDao extends BaseDao{

	public ThongTinLienHeShop GetDataThongTinLienHeShop()
	{
		List<ThongTinLienHeShop> list = new ArrayList<ThongTinLienHeShop>();
		String sql = "SELECT * FROM ThongTinLienHeShop";
		list = _jdbcTemplate.query(sql, new MapperThongTinLienHeShop());
		return list.get(0);
	}
}
