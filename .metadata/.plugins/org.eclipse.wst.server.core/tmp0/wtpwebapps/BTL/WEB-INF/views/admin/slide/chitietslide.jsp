<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Chi tiết slide</div>

		<div>Mã slide: ${ThongTinSlide.maSlide }</div>
		<div>
			Trạng thái:
			<c:if test="${ThongTinSlide.trangThai == '0'}">Ẩn</c:if>
			<c:if test="${ThongTinSlide.trangThai == '1'}">Hiển thị</c:if>
		</div>
		<div>Tiêu đề: ${ThongTinSlide.tenSlide }</div>
		<div>Nội dung: ${ThongTinSlide.noiDung }</div>
		<div>Hình ảnh: ${ThongTinSlide.hinhAnh }</div>
		<div>Link: ${ThongTinSlide.link }</div>

		<a
			href="<c:url value='/admin/chi-tiet-slide/${ ThongTinSlide.maSlide}/chinh-sua'/>">Chỉnh
			sửa</a> <a
			href="<c:url value='/admin/chi-tiet-slide/${ ThongTinSlide.maSlide}/xoa'/>">Xóa</a>
	</div>
</body>