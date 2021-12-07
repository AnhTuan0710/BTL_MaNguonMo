package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.TaiKhoan;

@Service
public interface ITaiKhoanService {
	public int ThemTaiKhoan(TaiKhoan taiKhoan);
	public int KiemTraTaiKhoan(TaiKhoan taiKhoan);
	public int GetIdTaiKhoanByTenDangNhap(TaiKhoan taiKhoan);
	
	public List<TaiKhoan> GetDataTaiKhoan();
	public int XoaTaiKhoan(int id);
	public int SuaTaiKhoan(int id, TaiKhoan taiKhoan);
	public TaiKhoan GetDataTaiKhoanById(int id);
}