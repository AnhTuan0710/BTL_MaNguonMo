package MiuMiuShop.Controller.User;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import MiuMiuShop.Entity.TaiKhoan;

@Controller
@RequestMapping("api/")
public class AjaxController {
	
	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	public String KiemTraDangNhap(HttpSession session, @ModelAttribute("taiKhoan") TaiKhoan taiKhoan)
	{
		return "jjjjjj";
	}
}
