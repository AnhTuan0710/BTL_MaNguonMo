package MiuMiuShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.ChiTietHoaDon;

@Service
public interface IChiTietHoaDonService {
	public HashMap<Integer, ChiTietHoaDon> ThemVaoDongHoaDon(int maSanPham, HashMap<Integer, ChiTietHoaDon> hoaDon);
	public HashMap<Integer, ChiTietHoaDon> SuaDongHoaDon(int maSanPham,int soLuong, HashMap<Integer, ChiTietHoaDon> hoaDon);
	public HashMap<Integer, ChiTietHoaDon> XoaDongHoaDon(int maSanPham, HashMap<Integer, ChiTietHoaDon> hoaDon);
	public int TongSoSanPham(HashMap<Integer, ChiTietHoaDon> hoaDon);
	public int TongTienCacSanPham(HashMap<Integer, ChiTietHoaDon> hoaDon);
}
