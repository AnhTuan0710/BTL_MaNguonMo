package MiuMiuShop.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.TaiKhoanDao;
import MiuMiuShop.Entity.TaiKhoan;

@Service
public class TaiKhoanServiceImpl implements ITaiKhoanService{

	@Autowired
	private TaiKhoanDao taiKhoanDao; 
	
	public int ThemTaiKhoan(TaiKhoan taiKhoan) {
		return taiKhoanDao.ThemTaiKhoan(taiKhoan);
	}
	
	public int KiemTraTaiKhoan(TaiKhoan taiKhoan) {
		return taiKhoanDao.GetTaiKhoan(taiKhoan);
		
	}
	
	public int GetIdTaiKhoanByTenDangNhap(TaiKhoan taiKhoan) {
		return taiKhoanDao.GetIdTaiKhoanByTenDangNhap(taiKhoan);
	}
}