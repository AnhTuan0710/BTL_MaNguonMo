package MiuMiuShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.ThongTinLienHe_KhachHang;

@Service
public interface IThongTinLienHe_KhachHangService {
	public List<ThongTinLienHe_KhachHang> GetDataThongTinLienHe_KhachHang();
	public int TaoDataThongTinLienHe_KhachHang(ThongTinLienHe_KhachHang thongTinLienHe_KhachHang);
}
