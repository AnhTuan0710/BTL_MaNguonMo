package MiuMiuShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.ThongTinLienHeShop;
import MiuMiuShop.Service.User.HomeServiceImpl;

@Controller
public class ThongTinLienHeShopController {
	@Autowired
	HomeServiceImpl homeService;
	@RequestMapping(value ="/admin/thong-tin-shop")
	public ModelAndView GetDataThongTinLienHeShop(@ModelAttribute("thongTinLienHeShop") ThongTinLienHeShop thongTinLienHeShop)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("ThongTinShop", homeService.GetDataThongTinLienHeShop());
		mv.setViewName("admin/thongtinlienheshop/thongtinlienheshop");	
		return  mv;
	}
	
	
	@RequestMapping(value ="/admin/thong-tin-shop/luu", method = RequestMethod.POST)
	public ModelAndView LuuThongTinLienHeShop(@ModelAttribute("thongTinLienHeShop") ThongTinLienHeShop thongTinLienHeShop)
	{
		ModelAndView mv = new ModelAndView();
		int check = homeService.SuaThongTinLienHeShop(thongTinLienHeShop);
		mv.setViewName("admin/thongtinlienheshop/thongtinlienheshop");	
		return  mv;
	}
}
