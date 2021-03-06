package MiuMiuShop.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Entity.ThongTinLienHe_KhachHang;
import MiuMiuShop.Service.User.HoaDonServiceImpl;
import MiuMiuShop.Service.User.TaiKhoanServiceImpl;
import MiuMiuShop.Service.User.ThongTinLienHe_KhachHangServiceImpl;

@Controller
public class HoaDonController extends BaseController{
	@Autowired
	private HoaDonServiceImpl hoaDonService = new HoaDonServiceImpl();
	@Autowired
	private TaiKhoanServiceImpl TaiKhoanService = new TaiKhoanServiceImpl();
	@Autowired
	ThongTinLienHe_KhachHangServiceImpl thongTinLienHe_KhachHangService = new ThongTinLienHe_KhachHangServiceImpl();
	
	@RequestMapping(value = {"/dat-hang"}, method = RequestMethod.GET)
	public ModelAndView Index(HttpSession session)
	{
		HashMap<Integer, ChiTietHoaDon> hoaDon 
		= (HashMap<Integer, ChiTietHoaDon>)session.getAttribute("GioHang");
		
		TaiKhoan nguoiDung = (TaiKhoan)session.getAttribute("thongTinNguoiDung");
		
		if(hoaDon == null)
		{
			_mvShare.setViewName("user/index");
			return _mvShare;
		}
		
		if(nguoiDung == null)
		{
			_mvShare.setViewName("user/dangkydangnhap");
			return _mvShare;
		}
		
		int idNguoiDung = TaiKhoanService.GetIdTaiKhoanByTenDangNhap(nguoiDung);
		nguoiDung.setId(idNguoiDung);
		session.setAttribute("thongTinNguoiDung", nguoiDung);	
		_mvShare.addObject("thongTinLienHe_KhachHang", new ThongTinLienHe_KhachHang());
		_mvShare.setViewName("user/dathang");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/dat-hang/xac-nhan"}, method = RequestMethod.POST)
	public ModelAndView XacNhanDatHang(HttpSession session, @ModelAttribute("thongTinLienHe_KhachHang") ThongTinLienHe_KhachHang thongTinLienHe_KhachHang)
	{
		TaiKhoan nguoiDung = (TaiKhoan)session.getAttribute("thongTinNguoiDung");
		
		HashMap<Integer, ChiTietHoaDon> hoaDon 
		= (HashMap<Integer, ChiTietHoaDon>)session.getAttribute("GioHang");
		
		int maThongTinLienHe_KhachHang = thongTinLienHe_KhachHangService.TaoDataThongTinLienHe_KhachHang(thongTinLienHe_KhachHang);
		
		hoaDonService.TaoHoaDon(nguoiDung.getId(), hoaDon, maThongTinLienHe_KhachHang);
		
		session.removeAttribute("GioHang");
		session.removeAttribute("TongSanPhamGioHang");
		session.removeAttribute("TongTienGioHang");
		
		_mvShare.setViewName("redirect:/trang-chu");
		return _mvShare;
	}
}
