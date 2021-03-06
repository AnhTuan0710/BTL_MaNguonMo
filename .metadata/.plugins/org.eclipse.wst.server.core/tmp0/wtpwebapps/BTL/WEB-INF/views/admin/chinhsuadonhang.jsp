<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form:form action="chinh-sua/luu" modelAttribute="hoaDon"
			method="POST">
			<div style="text-align: center;" class="caption-table">Chi tiết đơn hàng</div>
			<table>
				<tr>
					<td>Mã đơn hàng:</td>
					<td>${ThongTinHoaDon.maHoaDon }</td>
				</tr>
				<tr>
					<td>Tên khách hàng:</td>
					<td><form:input path="hoTen" value="${ThongTinHoaDon.hoTen }" /></td>
				</tr>
				<tr>
					<td>Số điện thoại:</td>
					<td><form:input path="soDienThoai"
							value="${ThongTinHoaDon.soDienThoai }" /></td>
				</tr>
				<tr>
					<td>Ngày đặt:</td>
					<td><form:input path="ngayLapHoaDon"
							value="${ThongTinHoaDon.ngayLapHoaDon }" /></td>
				</tr>
				<tr>
					<td>Trạng thái:</td>
					<td>${ThongTinHoaDon.trangThai }</td>
				</tr>
				<tr>
					<td>Địa chỉ giao:</td>
					<td><form:input path="diaChi"
							value="${ThongTinHoaDon.diaChi }" /></td>
				</tr>
			</table>
			<br />
			<br />
			<div>Danh sách sản phẩm:</div>
			<table width="100%" style="margin-top: 30px" border="1"
				cellpadding="0" cellspacing="0">
				<tr>
					<th>Mã sản phẩm</th>
					<th>Tên sản phẩm</th>
					<th>Số lượng</th>
					<th>Đơn giá</th>
					<th>Thành tiền</th>
				</tr>
				<c:forEach var="item" items="${DanhSachSanPhamHoaDon }">
					<tr>
						<td>${item.maSanPham }</td>
						<td>${item.tenSanPham }</td>
						<td>${item.soLuong } <%-- <form:input path="soLuong" value="${ThongTinHoaDon.ngayLapHoaDon }"/> --%>
						</td>
						<td>${item.gia }</td>
						<td>${item.soLuong*item.gia }</td>
					</tr>
				</c:forEach>
			</table>

			<div>Tổng tiền: ${ThongTinHoaDon.tongTien } VND</div>

			<button type="submit" class="">Lưu</button>
		</form:form>
	</div>
</body>