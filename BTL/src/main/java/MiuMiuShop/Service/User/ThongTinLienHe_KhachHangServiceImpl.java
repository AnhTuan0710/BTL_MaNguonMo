package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.ThongTinLienHe_KhachHangDao;
import MiuMiuShop.Entity.ThongTinLienHe_KhachHang;

@Service
public class ThongTinLienHe_KhachHangServiceImpl implements IThongTinLienHe_KhachHangService{

	@Autowired
	ThongTinLienHe_KhachHangDao thongTinLienHe_KhachHangDao = new ThongTinLienHe_KhachHangDao();
	public List<ThongTinLienHe_KhachHang> GetDataThongTinLienHe_KhachHang() {
		// TODO Auto-generated method stub
		return thongTinLienHe_KhachHangDao.GetDataThongTinLienHe_KhachHang();
	}

	public int TaoDataThongTinLienHe_KhachHang(ThongTinLienHe_KhachHang thongTinLienHe_KhachHang) {
		// TODO Auto-generated method stub
		return thongTinLienHe_KhachHangDao.TaoDataThongTinLienHe_KhachHang(thongTinLienHe_KhachHang);
	}

}
