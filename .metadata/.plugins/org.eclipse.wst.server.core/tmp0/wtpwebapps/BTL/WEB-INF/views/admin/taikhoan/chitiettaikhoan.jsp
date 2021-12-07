<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;">Chi tiết tài khoản</div>

		<div>ID: ${TaiKhoan.id }</div>
		<div>Tên đăng nhập: ${TaiKhoan.tenDangNhap }</div>
		<div>Mật khẩu: ${TaiKhoan.matKhau }</div>
		<div>Loại tài khoản: ${TaiKhoan.loaiTaiKhoan }</div>

		<a
			href="<c:url value='/admin/chi-tiet-tai-khoan/${ TaiKhoan.id}/chinh-sua'/>">Chỉnh
			sửa</a> <a
			href="<c:url value='/admin/chi-tiet-tai-khoan/${ TaiKhoan.id}/xoa'/>">Xóa</a>
	</div>
</body>