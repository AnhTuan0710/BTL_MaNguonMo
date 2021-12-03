package MiuMiuShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.ThongTinLienHe_KhachHang;

@Service
public interface IHoaDonService {
	public int TaoHoaDon(int Id, HashMap<Integer, ChiTietHoaDon> hoaDon_DanhSachSanPham, 
			int maThongTinLienHe_KhachHang);
	
}