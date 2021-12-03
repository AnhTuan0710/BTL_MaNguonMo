package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.SanPhamDao;
import MiuMiuShop.Dto.SanPhamDto;
@Service
public class LoaiSanPhamServiceImpl implements ILoaiSanPhamSevice{
	@Autowired
	private SanPhamDao sanPhamDao; 
	public List<SanPhamDto> GetDataSanPham() {
		return sanPhamDao.GetDataSanPhamDto();
	}
	
	public List<SanPhamDto> GetDataSanPhamByID(int id) {
		return sanPhamDao.GetDataAllSanPhamByID(id);
	}
	
	public List<SanPhamDto> GetDataSanPhamPaginate(int start, int end)
	{
		return sanPhamDao.GetDataSanPhamPaginate(start, end);
	}
	
	public List<SanPhamDto> GetDataSanPhamPaginateById(int id, int start, int end)
	{
		return sanPhamDao.GetDataSanPhamPaginateById(id, start, end);
	}

	
}
