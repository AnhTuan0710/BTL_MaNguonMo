package MiuMiuShop.Service.User;

import java.util.List;

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

	public List<TaiKhoan> GetDataTaiKhoan() {
		// TODO Auto-generated method stub
		return taiKhoanDao.GetDataTaiKhoan();
	}
	
	public int XoaTaiKhoan(int id) {
		// TODO Auto-generated method stub
		return taiKhoanDao.XoaTaiKhoan(id);
	}
	
	public int SuaTaiKhoan(int id, TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return taiKhoanDao.SuaTaiKhoan(id, taiKhoan);
	}

	public TaiKhoan GetDataTaiKhoanById(int id) {
		// TODO Auto-generated method stub
		return taiKhoanDao.GetDataTaiKhoanById(id);
	}

	public int KiemTraTaiKhoanAdmin(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return taiKhoanDao.KiemTraTaiKhoanAdmin(taiKhoan);
	}
}
