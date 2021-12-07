package MiuMiuShop.Controller.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Service.User.TaiKhoanServiceImpl;

@Controller
public class TaiKhoanController extends BaseController{
	@Autowired
	private TaiKhoanServiceImpl taiKhoanService;
	
	@RequestMapping(value = {"/dang-ky"}, method = RequestMethod.GET)
	public ModelAndView Index()
	{
		_mvShare.setViewName("user/dangkydangnhap");
		_mvShare.addObject("taiKhoan", new TaiKhoan());
		return _mvShare;
	}
	
	@RequestMapping(value = {"/dang-ky"}, method = RequestMethod.POST)
	public ModelAndView ThemTaiKhoan(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan)
	{
		int count = taiKhoanService.ThemTaiKhoan(taiKhoan);
		if(count> 0)
		{
			_mvShare.addObject("status", "Tạo tài khoản thành công");	
		}
		else
		{
			_mvShare.addObject("status", "Tạo tài khoản thất bại");
		}
		_mvShare.setViewName("user/dangkydangnhap");
		return _mvShare;
	}
	
	
	@RequestMapping(value = {"/dang-nhap"}, method = RequestMethod.POST)
	public ModelAndView DangNhap(HttpSession session, @ModelAttribute("taiKhoan") TaiKhoan taiKhoan)
	{
		int check = taiKhoanService.KiemTraTaiKhoan(taiKhoan);
		if(check> 0)
		{
			_mvShare.setViewName("redirect:/trang-chu");
			session.setAttribute("thongTinNguoiDung", taiKhoan);	
		}
		else 
		{
			_mvShare.addObject("statusLogin", "Đăng nhập thất bại");
		}
		return _mvShare;
	}
	
	@RequestMapping(value = {"/dang-xuat"}, method = RequestMethod.GET)
	public ModelAndView DangXuat(HttpSession session)
	{
		session.removeAttribute("thongTinNguoiDung");
		return _mvShare;
	}
}
