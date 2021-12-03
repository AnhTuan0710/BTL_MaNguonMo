package MiuMiuShop.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.SanPhamDao;
import MiuMiuShop.Dto.SanPhamDto;

@Service
public class SanPhamServiceImpl implements ISanPhamService {

	@Autowired
	SanPhamDao sanPhamDao = new SanPhamDao();
	
	public SanPhamDto GetSanPhamByID(int id) {
		return sanPhamDao.GetSanPhamByID(id).get(0);
	}

}
