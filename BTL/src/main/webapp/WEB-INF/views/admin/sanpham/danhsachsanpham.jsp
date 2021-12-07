<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<div class="content">
		<div style="text-align: center;">Danh sách slide-banner</div>
		<table width="100%" style="margin-top: 30px" border="1"
			cellpadding="0" cellspacing="0">
			<tr>
				<th>Mã sản phẩm</th>
				<th>Tên sản phẩm</th>
				<th>Giá</th>
				<th>Hình ảnh</th>
				<th>Chi tiết</th>
			</tr>
			<c:forEach var="item" items="${DanhSachSanPham }">
				<tr>
					<td>${item.maSanPham }</td>
					<td>${item.tenSanPham }</td>
					<td>${item.gia }</td>
					<td></td>
					<td><a href="<c:url value='chi-tiet-san-pham/${item.maSanPham }'/>">chi
							tiết</a></td>
				</tr>
			</c:forEach>
		</table>

		<a href="<c:url value='/admin/danh-sach-san-pham/them'/>">Thêm</a>
	</div>
</body>
