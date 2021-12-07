package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.SanPham;

@Service
public interface ISanPhamService  {
	public SanPhamDto GetSanPhamByID(int id);
	
	public List<SanPham> GetDataSanPham(); 
}

