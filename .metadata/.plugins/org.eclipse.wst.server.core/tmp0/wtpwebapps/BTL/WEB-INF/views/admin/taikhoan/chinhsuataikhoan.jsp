<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form:form action="chinh-sua/luu" modelAttribute="taiKhoan"
			method="POST">
			<div style="text-align: center;" class="caption-table">Chỉnh sửa tài khoản</div>
			<table>
				<tr>
					<td>ID:</td>
					<td>${TaiKhoan.id }</td>
				</tr>
				<tr>
					<td>Tên đăng nhập:</td>
					<td><form:input path="tenDangNhap"
							value="${TaiKhoan.tenDangNhap }" /></td>
				</tr>
				<tr>
					<td>Mật khẩu:</td>
					<td><form:input path="matKhau" value="${TaiKhoan.matKhau}" /></td>
				</tr>
				<tr>
					<td>Loại tài khoản:</td>
					<td>${TaiKhoan.loaiTaiKhoan }</td>
				</tr>
			</table>
			<button type="submit" class="">Lưu</button>
		</form:form>
	</div>
</body>