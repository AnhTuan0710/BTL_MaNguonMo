package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.MapperTaiKhoan;
import MiuMiuShop.Entity.TaiKhoan;

@Repository
public class TaiKhoanDao extends BaseDao{
	public int GetTaiKhoan(TaiKhoan taiKhoan)
	{
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan "
				+ "WHERE TenDangNhap = '" + taiKhoan.getTenDangNhap() +"' "
				+ "AND MatKhau = '" + taiKhoan.getMatKhau() + "'";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if(result.size() <= 0 )
		{
			return 0;
		}
		return 1;
	}

	public int ThemTaiKhoan(TaiKhoan taiKhoan) {
		String sql = "INSERT INTO TaiKhoan (TenDangNhap, MatKhau) "
				+ "VALUES('"+ taiKhoan.getTenDangNhap()+ "', '"+ taiKhoan.getMatKhau() +"')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}
	
	public int GetIdTaiKhoanByTenDangNhap(TaiKhoan taiKhoan)
	{
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT TOP 1 * FROM TaiKhoan " 
				+ "WHERE TenDangNhap = '" + taiKhoan.getTenDangNhap() +"'";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if(result.size() <= 0 )
		{
			return -1;
		}
		return result.get(0).getId();
	}

	public List<TaiKhoan> GetDataTaiKhoan() {
		// TODO Auto-generated method stub
		List<TaiKhoan> list = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan ";
		list = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		return list;
	}
	
	
	public int XoaTaiKhoan(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM TaiKhoan "
				+ "WHERE Id = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int SuaTaiKhoan(int id, TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		String sql = "UPDATE TaiKhoan SET TenDangNhap = '" + taiKhoan.getTenDangNhap()+"', MatKhau = '" + taiKhoan.getMatKhau() +"' "
				+ "WHERE Id = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}

	public TaiKhoan GetDataTaiKhoanById(int id) {
		// TODO Auto-generated method stub
		List<TaiKhoan> list = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan "
				+ "WHERE Id = " + id;
		list = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		return list.get(0);
	}

	public int KiemTraTaiKhoanAdmin(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan "
				+ "WHERE LoaiTaiKhoan = 'Admin'"
				+ "AND TenDangNhap = '" + taiKhoan.getTenDangNhap() +"' "
				+ "AND MatKhau = '" + taiKhoan.getMatKhau() + "'";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if(result.size() <= 0 )
		{
			return 0;
		}
		return 1;
	}
}
