package MiuMiuShop.Controller.Admin;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Service.User.LoaiSanPhamServiceImpl;
import MiuMiuShop.Service.User.SanPhamServiceImpl;

@Controller
public class SanPhamController_ {
	@Autowired
	SanPhamServiceImpl sanPhamService;
	
	@Autowired
	LoaiSanPhamServiceImpl loaiSanPhamService;
	@RequestMapping(value = {"/admin/danh-sach-san-pham"})
	public ModelAndView DanhSachSanPham()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachSanPham", sanPhamService.GetDataSanPham());
		mv.setViewName("admin/sanpham/danhsachsanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}"})
	public ModelAndView ChiTietSanPham(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("SanPham", sanPhamService.GetSanPhamByID(id));
		mv.setViewName("admin/sanpham/chitietsanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}/xoa"})
	public ModelAndView XoaSanPham(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		int check = sanPhamService.XoaSanPham(id);
		mv.setViewName("redirect:/admin/danh-sach-san-pham");	
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}/chinh-sua"})
	public ModelAndView ChinhSuaSanPham(@PathVariable int id, @ModelAttribute("sanPham") SanPhamDto sanPhamDto)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("SanPham", sanPhamService.GetSanPhamByID(id));
		mv.addObject("DanhSachLoaiSanPham", loaiSanPhamService.GetDataLoaiSanPham());
		mv.setViewName("admin/sanpham/chinhsuasanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}/chinh-sua/luu"}, method = RequestMethod.POST)
	public ModelAndView LuuSanPham(@PathVariable int id, @ModelAttribute("sanPham") SanPhamDto sanPhamDto)
	{
		ModelAndView mv = new ModelAndView();
		int check = sanPhamService.SuaSanPham(id, sanPhamDto);
		mv.setViewName("redirect:/admin/chi-tiet-san-pham/" + id);
		return mv;
	}
}
