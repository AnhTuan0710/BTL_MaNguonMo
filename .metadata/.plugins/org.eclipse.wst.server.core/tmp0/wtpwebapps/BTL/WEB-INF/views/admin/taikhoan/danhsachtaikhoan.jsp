<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Danh sách tài khoản</div>
		<table width="100%" style="margin-top: 30px" border="1"
			cellpadding="0" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>Tên đăng nhập</th>
				<th>Loại tài khoản</th>
				<th>Chi tiết</th>
			</tr>
			<c:forEach var="item" items="${DanhSachTaiKhoan }">
				<tr>
					<td>${item.id }</td>
					<td>${item.tenDangNhap }</td>
					<td>${item.loaiTaiKhoan }</td>
					<td><a href="<c:url value='chi-tiet-tai-khoan/${item.id }'/>">chi
							tiết</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>