package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.SanPhamDao;
import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.SanPham;

@Service
public class SanPhamServiceImpl implements ISanPhamService {

	@Autowired
	SanPhamDao sanPhamDao = new SanPhamDao();
	
	public SanPhamDto GetSanPhamByID(int id) {
		return sanPhamDao.GetSanPhamByID(id).get(0);
	}

	public List<SanPham> GetDataSanPham() {
		// TODO Auto-generated method stub
		return sanPhamDao.GetDataSanPham();
	}

	public int XoaSanPham(int id) {
		// TODO Auto-generated method stub
		return sanPhamDao.XoaSanPham(id);
	}

	public int SuaSanPham(int id, SanPhamDto sanPhamDto) {
		// TODO Auto-generated method stub
		return sanPhamDao.SuaSanPham(id, sanPhamDto);
	}

}
