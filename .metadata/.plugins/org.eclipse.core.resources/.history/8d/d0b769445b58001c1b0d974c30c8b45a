<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<div class="content">
		<div style="text-align: center;">Danh sách slide-banner</div>
		<table width="100%" style="margin-top: 30px" border="1"
			cellpadding="0" cellspacing="0">
			<tr>
				<th>Mã slide</th>
				<th>Tiêu đề</th>
				<th>Link</th>
				<th>Trạng thái</th>
				<th>Chi tiết</th>
			</tr>
			<c:forEach var="item" items="${DanhSachSlide }">
				<tr>
					<td>${item.maSlide }</td>
					<td>${item.tenSlide }</td>
					<td>${item.link }</td>
					<td><c:if test="${item.trangThai == '0'}">Ẩn</c:if> <c:if
							test="${item.trangThai == '1'}">Hiển thị</c:if></td>
					<td><a href="<c:url value='chi-tiet-slide/${item.maSlide }'/>">chi
							tiết</a></td>
				</tr>
			</c:forEach>
		</table>

		<a href="<c:url value='/admin/danh-sach-slide/them'/>">Thêm</a>
	</div>
</body>