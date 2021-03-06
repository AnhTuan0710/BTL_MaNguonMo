package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Dto.MapperSanPhamDto;
import MiuMiuShop.Entity.MapperSanPham;
import MiuMiuShop.Entity.SanPham;

@Repository
public class SanPhamDao extends BaseDao {

	public List<SanPham> GetDataSanPham() {
		List<SanPham> list = new ArrayList<SanPham>();
		String sql = "SELECT * FROM SanPham";
		list = _jdbcTemplate.query(sql, new MapperSanPham());
		return list;
	}

	public List<SanPhamDto> GetDataSanPhamDto() {
		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		String sql = "SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, "
				+ "NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham "
				+ "FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham";
		list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	public List<SanPhamDto> GetDataAllSanPhamByID(int id) {
		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		String sql = "SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, "
				+ "NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham "
				+ "FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham "
				+ "WHERE SanPham.MaLoaiSanPham = " + id;
		list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	public List<SanPhamDto> GetDataSanPhamPaginate(int start, int end) {
		String sqlGetDataByID = "SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, "
				+ "NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham "
				+ "FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham ";
		List<SanPhamDto> listDataByID = _jdbcTemplate.query(sqlGetDataByID, new MapperSanPhamDto());

		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		if (listDataByID.size() > 0) {
			String sql = ";WITH Results_CTE AS " + "("
					+ "    SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, ROW_NUMBER() OVER (ORDER BY MaSanPham, LoaiSanPham.MaLoaiSanPham) AS RowNum "
					+ "    FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham "
					+ ")" + "SELECT *" + "FROM Results_CTE " + "WHERE RowNum >= " + start + " " + "AND RowNum <= "
					+ end;
			list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		}

		return list;
	}

	public List<SanPhamDto> GetDataSanPhamPaginateById(int id, int start, int end) {
		String sqlGetDataByID = "SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, "
				+ "NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham "
				+ "FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham "
				+ "WHERE SanPham.MaLoaiSanPham = " + id;
		List<SanPhamDto> listDataByID = _jdbcTemplate.query(sqlGetDataByID, new MapperSanPhamDto());

		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		if (listDataByID.size() > 0) {
			String sql = ";WITH Results_CTE AS " + "("
					+ "    SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, ROW_NUMBER() OVER (ORDER BY MaSanPham, LoaiSanPham.MaLoaiSanPham) AS RowNum "
					+ "    FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham "
					+ " 	 WHERE LoaiSanPham.MaLoaiSanPham = " + id + " " + ")" + "SELECT *" + "FROM Results_CTE "
					+ "WHERE RowNum >= " + start + " " + "AND RowNum <= " + end;
			list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		}

		return list;
	}

	public List<SanPhamDto> GetSanPhamByID(int id) {

		List<SanPhamDto> list = new ArrayList<SanPhamDto>();
		String sql = "SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, "
				+ "NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham "
				+ "FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham "
				+ "WHERE SanPham.MaSanPham = " + id;
		list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	public SanPhamDto Find1SanPhamByID(int id) {

		SanPhamDto sanPham = new SanPhamDto();
		String sql = "SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, "
				+ "NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham "
				+ "FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham "
				+ "WHERE SanPham.MaSanPham = " + id;
		sanPham = _jdbcTemplate.queryForObject(sql, new MapperSanPhamDto());
		return sanPham;
	}

	public List<SanPham> GetDataSanPhamNoiBat() {
		List<SanPham> list = new ArrayList<SanPham>();
		String sql = "SELECT TOP 3 * FROM SanPham WHERE NoiBat = 1 order by newid()";
		list = _jdbcTemplate.query(sql, new MapperSanPham());
		return list;
	}

	public List<SanPham> GetDataSanPhamMoi() {
		List<SanPham> list = new ArrayList<SanPham>();
		String sql = "SELECT TOP 3 * FROM SanPham WHERE SanPhamMoi = 1 order by newid()";
		list = _jdbcTemplate.query(sql, new MapperSanPham());
		return list;
	}

	public int XoaSanPham(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM SanPham " + "WHERE MaSanPham = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}

	public int SuaSanPham(int id, SanPhamDto sanPhamDto) {
		// TODO Auto-generated method stub
		int sanPhamMoi = sanPhamDto.isSanPhamMoi() ? 1 : 0;
		int noiBat = sanPhamDto.isNoiBat() ? 1 : 0;
		
		String sql = "UPDATE SanPham " 
					+"SET TenSanPham = N'"+ sanPhamDto.getTenSanPham() +"', HinhAnh = '" + sanPhamDto.getHinhAnh()
					+"', Gia = " + sanPhamDto.getGia() + ", MoTa = N'" + sanPhamDto.getMoTa() 
					+"', NgayCapNhat = GETDATE(), SanPhamMoi = "
					+ sanPhamMoi + ", NoiBat = "+ noiBat+", MaLoaiSanPham = " + sanPhamDto.getMaLoaiSanPham()
					+"WHERE MaSanPham = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
}
