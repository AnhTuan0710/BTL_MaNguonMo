package MiuMiuShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.Slides;
import MiuMiuShop.Service.User.HomeServiceImpl;

@Controller
public class SlideController {
	
	@Autowired
	HomeServiceImpl homeService;
	
	@RequestMapping(value ="/admin/danh-sach-slide")
	public ModelAndView DanhSachSlide()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachSlide", homeService.GetDataSlide());
		mv.setViewName("admin/slide/danhsachslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/danh-sach-slide/them")
	public ModelAndView ThemSlide( @ModelAttribute("slide") Slides slide)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/slide/themslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/danh-sach-slide/them/luu", method = RequestMethod.POST)
	public ModelAndView TaoSlide( @ModelAttribute("slide") Slides slide)
	{
		ModelAndView mv = new ModelAndView();
		int check = homeService.TaoSlide(slide);
		mv.setViewName("redirect:/admin/danh-sach-slide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}")
	public ModelAndView ChiTietSlide(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("ThongTinSlide", homeService.GetDataSlideById(id));
		mv.setViewName("admin/slide/chitietslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}/chinh-sua")
	public ModelAndView ChinhSuaSlide(@PathVariable int id, @ModelAttribute("slide") Slides slide)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("ThongTinSlide", homeService.GetDataSlideById(id));
		mv.setViewName("admin/slide/chinhsuaslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}/chinh-sua/luu", method = RequestMethod.POST)
	public ModelAndView LuuSlide(@PathVariable int id,  @ModelAttribute("slide") Slides slide)
	{
		ModelAndView mv = new ModelAndView();
		int check = homeService.SuaSlide(id, slide);
		mv.addObject("ThongTinSlide", homeService.GetDataSlideById(id));
		mv.setViewName("redirect:/admin/chi-tiet-slide/" + id);
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}/xoa")
	public ModelAndView XoaSlide(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		int check = homeService.XoaSlide(id);
		mv.setViewName("redirect:/admin/danh-sach-slide");	
		return  mv;
	}
}
