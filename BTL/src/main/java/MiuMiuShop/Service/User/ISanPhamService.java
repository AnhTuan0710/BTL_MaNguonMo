package MiuMiuShop.Service.User;

import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.SanPhamDto;

@Service
public interface ISanPhamService  {
	public SanPhamDto GetSanPhamByID(int id);
}

