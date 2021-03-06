package MiuMiuShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Service.User.SanPhamServiceImpl;

@Controller
public class SanPhamController extends BaseController {
	
	@Autowired
	private SanPhamServiceImpl sanPhamService;
	
	@RequestMapping(value = {"chi-tiet-san-pham/{id}", "loai-san-pham/chi-tiet-san-pham/{id}"})
	public ModelAndView Index(@PathVariable int id)
	{
		_mvShare.setViewName("user/sanpham/chitietsanpham");
		_mvShare.addObject("sanPham", sanPhamService.GetSanPhamByID(id));
		return _mvShare;
	}
}