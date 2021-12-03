package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.Menu;
import MiuMiuShop.Entity.SanPham;
import MiuMiuShop.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	@Autowired
	public List<LoaiSanPham> GetDataLoaiSanPham();
	@Autowired
	public List<Menu> GetDataMenu();
	@Autowired
	public List<SanPham> GetDataSanPham();
	
	@Autowired
	public List<SanPhamDto> GetDataSanPhamDto();
	
}