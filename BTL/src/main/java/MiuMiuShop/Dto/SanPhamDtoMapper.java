package MiuMiuShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SanPhamDtoMapper implements RowMapper<SanPhamDto> {

	public SanPhamDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPhamDto sanPhamDto = new SanPhamDto();
		sanPhamDto.setMaSanPham(rs.getInt("MaSanPham"));
		sanPhamDto.setTenSanPham(rs.getString("TenSanPham"));
		sanPhamDto.setHinhAnh(rs.getString("HinhAnh"));
		sanPhamDto.setGia(rs.getInt("Gia"));
		sanPhamDto.setGiaGiam(rs.getInt("GiaGiam"));
		sanPhamDto.setSoLuongCon(rs.getInt("SoLuongCon"));
		sanPhamDto.setMoTa(rs.getString("MoTa"));
		sanPhamDto.setNgayTao(rs.getDate("NgayTao"));
		sanPhamDto.setNgayCapNhat(rs.getDate("NgayCapNhat"));
		sanPhamDto.setSanPhamMoi(rs.getBoolean("SanPhamMoi"));
		sanPhamDto.setNoiBat(rs.getBoolean("NoiBat"));
		sanPhamDto.setMaLoaiSanPham(rs.getInt("MaLoaiSanPham"));
		sanPhamDto.setTenLoaiSanPham(rs.getString("TenLoaiSanPham"));
		return sanPhamDto;
	}
}
