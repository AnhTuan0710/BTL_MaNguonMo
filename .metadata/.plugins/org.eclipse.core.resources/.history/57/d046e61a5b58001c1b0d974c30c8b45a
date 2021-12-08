<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;">Chi tiết đơn hàng</div>

		<div>Mã đơn hàng: ${ThongTinHoaDon.maHoaDon }</div>
		<div>Tên khách hàng: ${ThongTinHoaDon.hoTen }</div>
		<div>Số điện thoại: ${ThongTinHoaDon.soDienThoai }</div>
		<div>Ngày đặt: ${ThongTinHoaDon.ngayLapHoaDon }</div>
		<div>Trạng thái: ${ThongTinHoaDon.trangThai }</div>
		<div>Địa chỉ giao: ${ThongTinHoaDon.diaChi }</div>
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
					<td>${item.soLuong }</td>
					<td>${item.gia }</td>
					<td>${item.soLuong*item.gia }</td>
				</tr>
			</c:forEach>
		</table>

		<div>Tổng tiền: ${ThongTinHoaDon.tongTien } VND</div>

		<a
			href="<c:url value='/admin/chi-tiet-hoa-don/${ ThongTinHoaDon.maHoaDon}/xac-nhan'/>">Xác
			nhận</a> <a
			href="<c:url value='/admin/chi-tiet-hoa-don/${ ThongTinHoaDon.maHoaDon}/huy'/>">Hủy</a>
		<a
			href="<c:url value='/admin/chi-tiet-hoa-don/${ ThongTinHoaDon.maHoaDon}/chinh-sua'/>">Sửa</a>
	</div>

</body>