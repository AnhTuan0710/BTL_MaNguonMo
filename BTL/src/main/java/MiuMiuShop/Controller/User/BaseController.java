package MiuMiuShop.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Service.User.HomeServiceImpl;

@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	public ModelAndView _mvShare = new ModelAndView("user/index");
	
	@PostConstruct //giup chay ham Init() truoc khi chay HomeController
	public ModelAndView Init() {
		_mvShare.addObject("menu", _homeService.GetDataMenu());
		_mvShare.addObject("thongTinLienHeShop", _homeService.GetDataThongTinLienHeShop());
		return _mvShare;
	}
}
