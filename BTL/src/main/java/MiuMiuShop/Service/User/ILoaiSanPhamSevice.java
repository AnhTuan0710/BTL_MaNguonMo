package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.SanPhamDto;
@Service
public interface ILoaiSanPhamSevice {
	public List<SanPhamDto> GetDataSanPhamByID(int id);
	public List<SanPhamDto> GetDataSanPhamPaginate(int start, int end);
	public List<SanPhamDto> GetDataSanPhamPaginateById(int id, int start, int end);
}
