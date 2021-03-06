<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Danh sách đơn hàng</div>
		<table width="100%" style="margin-top: 30px" border="1"
			cellpadding="0" cellspacing="0">
			<tr>
				<th>Mã đơn hàng</th>
				<th>Ngày đặt</th>
				<th>Trạng thái</th>
				<th>Chi tiết</th>
			</tr>
			<c:forEach var="item" items="${DanhSachHoaDon }">
				<tr>
					<td>${item.maHoaDon }</td>
					<td>${item.ngayLapHoaDon }</td>
					<td>${item.trangThai }</td>
					<td><a
						href="<c:url value='chi-tiet-hoa-don/${item.maHoaDon }'/>">chi
							tiết</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>