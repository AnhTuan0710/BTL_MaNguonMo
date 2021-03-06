package MiuMiuShop.Service.User;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.HoaDonDao;
import MiuMiuShop.Dto.HoaDonDto;
import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.HoaDon;

@Service
public class HoaDonServiceImpl implements IHoaDonService{

	@Autowired
	private HoaDonDao hoaDonDao; 
	public int TaoHoaDon(int Id, HashMap<Integer, ChiTietHoaDon> hoaDon_DanhSachSanPham, 
			int maThongTinLienHe_KhachHang) {
		// TODO Auto-generated method stub
		return hoaDonDao.TaoHoaDon(Id, hoaDon_DanhSachSanPham, maThongTinLienHe_KhachHang);
	}
	public List<HoaDon> GetDataHoaDon() {
		// TODO Auto-generated method stub
		return hoaDonDao.GetDataHoaDon();
	}
	public List<HoaDonDto> GetHoaDonByID(int id) {
		// TODO Auto-generated method stub
		return hoaDonDao.GetHoaDonByID(id);
	}
	public int XacNhanDon(int id) {
		// TODO Auto-generated method stub
		return hoaDonDao.XacNhanDon(id);
	}
	public int Huy(int id) {
		// TODO Auto-generated method stub
		return hoaDonDao.HuyDon(id);
	}
	public int ChinhSuaDonHang(int id, HoaDonDto hoaDon_) {
		// TODO Auto-generated method stub
		return hoaDonDao.ChinhSuaDonHang(id, hoaDon_);
	}


}
