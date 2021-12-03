package MiuMiuShop.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.HoaDonDao;
import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.ThongTinLienHe_KhachHang;

@Service
public class HoaDonServiceImpl implements IHoaDonService{

	@Autowired
	private HoaDonDao hoaDonDao; 
	public int TaoHoaDon(int Id, HashMap<Integer, ChiTietHoaDon> hoaDon_DanhSachSanPham, 
			int maThongTinLienHe_KhachHang) {
		// TODO Auto-generated method stub
		return hoaDonDao.TaoHoaDon(Id, hoaDon_DanhSachSanPham, maThongTinLienHe_KhachHang);
	}

}
