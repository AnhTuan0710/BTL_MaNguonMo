package MiuMiuShop.Controller.Admin;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Dto.HoaDonDto;
import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Service.User.HoaDonServiceImpl;
import MiuMiuShop.Service.User.TaiKhoanServiceImpl;

@Controller
public class AdminController {
	@Autowired
	HoaDonServiceImpl hoaDonService;

	@Autowired
	TaiKhoanServiceImpl taiKhoanService;

//	@RequestMapping(value = { "/admin/home" }, method = RequestMethod.GET)
//	public ModelAndView Index(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan) {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("admin/dangnhap");
//		return mv;
//	}

	@RequestMapping(value = "/admin/home")
	public ModelAndView Index(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/dangnhap");
		return mv;
	}
	
	@RequestMapping(value = "/admin/dang-nhap")
	public ModelAndView CheckDangNhap(HttpSession session, @ModelAttribute("taiKhoan") TaiKhoan taiKhoan) {
		ModelAndView mv = new ModelAndView();
		int check = taiKhoanService.KiemTraTaiKhoanAdmin(taiKhoan);
		if(check> 0)
		{
			mv.setViewName("redirect:/admin/danh-sach-hoa-don");
			session.setAttribute("Admin", taiKhoan);	
			session.removeAttribute("statusLogin");
		}
		else 
		{
			mv.addObject("statusLogin", "Kiểm tra lại tài khoản và mật khẩu");
			mv.setViewName("admin/dangnhap");
		}
		
		return mv;
	}
	
	@RequestMapping(value = "/admin/dang-xuat")
	public ModelAndView DangXuat(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		session.removeAttribute("Admin");
		mv.setViewName("redirect:/admin/home");
		return mv;
	}

	@RequestMapping(value = "/admin/danh-sach-hoa-don")
	public ModelAndView DanhSachHoaDon() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachHoaDon", hoaDonService.GetDataHoaDon());
		mv.setViewName("admin/danhsachhoadon");
		return mv;
	}

	@RequestMapping(value = "/admin/chi-tiet-hoa-don/{id}")
	public ModelAndView ChiTietHoaDon(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		List<HoaDonDto> hoaDonDto = hoaDonService.GetHoaDonByID(id);
		HoaDonDto hoaDon = hoaDonDto.get(0);
		mv.addObject("ThongTinHoaDon", hoaDon);
		mv.addObject("DanhSachSanPhamHoaDon", hoaDonDto);
		mv.setViewName("admin/chitiethoadon");
		return mv;
	}

	@RequestMapping(value = "/admin/chi-tiet-hoa-don/{id}/xac-nhan")
	public ModelAndView XacNhanDonHang(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		int check = hoaDonService.XacNhanDon(id);
		List<HoaDonDto> hoaDonDto = hoaDonService.GetHoaDonByID(id);

		HoaDonDto hoaDon = hoaDonDto.get(0);
		mv.addObject("ThongTinHoaDon", hoaDon);
		mv.addObject("DanhSachSanPhamHoaDon", hoaDonDto);
		mv.setViewName("admin/chitiethoadon");
		return mv;
	}

	@RequestMapping(value = "/admin/chi-tiet-hoa-don/{id}/huy")
	public ModelAndView HuyDonHang(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		int check = hoaDonService.Huy(id);
		List<HoaDonDto> hoaDonDto = hoaDonService.GetHoaDonByID(id);
		HoaDonDto hoaDon = hoaDonDto.get(0);
		mv.addObject("ThongTinHoaDon", hoaDon);
		mv.addObject("DanhSachSanPhamHoaDon", hoaDonDto);
		mv.setViewName("admin/chitiethoadon");
		return mv;
	}

	@RequestMapping(value = "/admin/chi-tiet-hoa-don/{id}/chinh-sua")
	public ModelAndView ChinhSuaDonHang(@PathVariable int id, @ModelAttribute("hoaDon") HoaDonDto HoaDonDto) {
		ModelAndView mv = new ModelAndView();
		List<HoaDonDto> hoaDonDto = hoaDonService.GetHoaDonByID(id);
		HoaDonDto hoaDon = hoaDonDto.get(0);
		mv.addObject("ThongTinHoaDon", hoaDon);
		mv.addObject("DanhSachSanPhamHoaDon", hoaDonDto);
		mv.setViewName("admin/chinhsuadonhang");
		return mv;
	}

	@RequestMapping(value = "/admin/chi-tiet-hoa-don/{id}/chinh-sua/luu", method = RequestMethod.POST)
	public ModelAndView LuuDonHang(@PathVariable int id, @ModelAttribute("hoaDon") HoaDonDto hoaDon_) {
		ModelAndView mv = new ModelAndView();

		List<HoaDonDto> hoaDonDto = hoaDonService.GetHoaDonByID(id);
		HoaDonDto hoaDon = hoaDonDto.get(0);

		hoaDon_.setMaThongTinLienHe_KhachHang(hoaDon.getMaThongTinLienHe_KhachHang());
		int check = hoaDonService.ChinhSuaDonHang(id, hoaDon_);

		hoaDonDto = hoaDonService.GetHoaDonByID(id);
		hoaDon = hoaDonDto.get(0);

		mv.addObject("ThongTinHoaDon", hoaDon);
		mv.addObject("DanhSachSanPhamHoaDon", hoaDonDto);
		mv.setViewName("redirect:/admin/chi-tiet-hoa-don/" + id);
		return mv;
	}
}
