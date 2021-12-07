package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.Menu;
import MiuMiuShop.Entity.SanPham;
import MiuMiuShop.Entity.Slides;
import MiuMiuShop.Entity.ThongTinLienHeShop;

@Service
public interface IHomeService {
	public List<Slides> GetDataSlide();
	public Slides GetDataSlideById(int id);
	public List<LoaiSanPham> GetDataLoaiSanPham();
	public List<SanPham> GetDataSanPhamNoiBat();
	public List<SanPham> GetDataSanPhamMoi();
	public List<Menu> GetDataMenu();
	public List<SanPham> GetDataSanPham();
	public List<SanPhamDto> GetDataSanPhamDto();
	public int SuaSlide(int id, Slides slide);
	public int XoaSlide(int id);
	public int TaoSlide(Slides slide);
	public List<Slides> GetDataSlideHienThi();
	
	public ThongTinLienHeShop GetDataThongTinLienHeShop();
	public int SuaThongTinLienHeShop(ThongTinLienHeShop thongTinLienHeShop);
}