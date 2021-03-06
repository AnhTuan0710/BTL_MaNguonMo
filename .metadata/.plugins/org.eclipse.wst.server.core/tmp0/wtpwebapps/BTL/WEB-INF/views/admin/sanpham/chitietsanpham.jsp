<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Chi tiết sản phẩm</div>

		<div>Mã sản phẩm: ${SanPham.maSanPham }</div>
		<div>Tên sản phẩm: ${SanPham.tenSanPham }</div>
		<div>Hình ảnh: ${SanPham.hinhAnh }</div>
		<div>Giá: ${SanPham.gia }</div>
		<div>Mô tả: ${SanPham.moTa }</div>
		<div>Ngày tạo: ${SanPham.ngayTao }</div>
		<div>Ngày cập nhật: ${SanPham.ngayCapNhat }</div>
		<div>Sản phẩm nổi bật: 
			<c:if test="${SanPham.noiBat == 'false'}">Không</c:if>
			<c:if test="${SanPham.noiBat == 'true'}">Có</c:if>
		</div>
		<div>Sản phẩm mới: 
			<c:if test="${SanPham.sanPhamMoi == 'false'}">Không</c:if>
			<c:if test="${SanPham.sanPhamMoi == 'true'}">Có</c:if></div>
		<div>Loại sản phẩm: ${SanPham.tenLoaiSanPham }</div>

		<a
			href="<c:url value='/admin/chi-tiet-san-pham/${ SanPham.maSanPham}/chinh-sua'/>">Chỉnh
			sửa</a> <a
			href="<c:url value='/admin/chi-tiet-san-pham/${ SanPham.maSanPham}/xoa'/>">Xóa</a>
	</div>
</body>