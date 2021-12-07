package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.LoaiSanPhamDao;
import MiuMiuShop.Dao.MenuDao;
import MiuMiuShop.Dao.SanPhamDao;
import MiuMiuShop.Dao.SlidesDao;
import MiuMiuShop.Dao.ThongTinLienHeShopDao;
import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.Menu;
import MiuMiuShop.Entity.SanPham;
import MiuMiuShop.Entity.Slides;
import MiuMiuShop.Entity.ThongTinLienHeShop;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private LoaiSanPhamDao loaiSanPhamDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private SanPhamDao sanPhamDao;
	@Autowired
	private SanPhamDao sanPhamDto;
	@Autowired
	private ThongTinLienHeShopDao thongTinLienHeShopDao;

	public List<Slides> GetDataSlide() {

		return slidesDao.GetDataSlide();
	}
	public List<Slides> GetDataSlideHienThi()
	{
		return slidesDao.GetDataSlideHienThi();
	}
	
	public Slides GetDataSlideById(int id) {
		return slidesDao.GetDataSlideById(id);
	}
	
	public int SuaSlide(int id, Slides slide) {
		return slidesDao.SuaSlide(id, slide);
	}
	
	public int XoaSlide(int id) {
		return slidesDao.XoaSlide(id);
	}
	
	public int TaoSlide(Slides slide) {
		return slidesDao.TaoSlide(slide);
	}


	public List<LoaiSanPham> GetDataLoaiSanPham() {

		return loaiSanPhamDao.GetDataLoaiSanPham();
	}

	public List<Menu> GetDataMenu() {

		return menuDao.GetDataMenu();
	}

	public List<SanPham> GetDataSanPham() {

		return sanPhamDao.GetDataSanPham();
	}

	public List<SanPhamDto> GetDataSanPhamDto() {
		List<SanPhamDto> listSanPhamDto = sanPhamDto.GetDataSanPhamDto();
		return listSanPhamDto;
	}
	
	public ThongTinLienHeShop GetDataThongTinLienHeShop() {

		return thongTinLienHeShopDao.GetDataThongTinLienHeShop();
	}
	public List<SanPham> GetDataSanPhamNoiBat() {
		// TODO Auto-generated method stub
		return sanPhamDao.GetDataSanPhamNoiBat();
	}
	public List<SanPham> GetDataSanPhamMoi() {
		// TODO Auto-generated method stub
		return sanPhamDao.GetDataSanPhamMoi();
	}
	public int SuaThongTinLienHeShop(ThongTinLienHeShop thongTinLienHeShop) {
		// TODO Auto-generated method stub
		return thongTinLienHeShopDao.SuaThongTinLienHeShop(thongTinLienHeShop);
	}
}
