package MiuMiuShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	
	@RequestMapping(value = {"/", "trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index()
	{
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("loaiSanPham", _homeService.GetDataLoaiSanPham());
		_mvShare.addObject("sanPham", _homeService.GetDataSanPham());
		_mvShare.addObject("sanPham_loaiSanPham", _homeService.GetDataSanPhamDto());
		
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
}
