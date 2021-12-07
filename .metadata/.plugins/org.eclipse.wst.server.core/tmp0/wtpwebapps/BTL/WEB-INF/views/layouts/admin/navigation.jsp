<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<nav>
		<ul>
			<c:if test="${not empty Admin }">
				<li><a href="<c:url value='/admin/danh-sach-tai-khoan'/>">Quản
						lý người dùng</a></li>
				<li><a href="<c:url value='/admin/danh-sach-hoa-don'/>">Quản
						lý đơn hàng</a></li>
				<li><a href="<c:url value='/admin/danh-sach-slide'/>">Quản
						lý slide-banner</a></li>
				<li><a href="<c:url value='/admin/danh-sach-san-pham'/>">Quản
						lý sản phẩm</a></li>
				<li><a href="<c:url value='/admin/thong-tin-shop'/>">Thông
						tin shop</a></li>
			</c:if>
			<c:if test="${empty Admin }">
				<li><a href="">Quản lý người dùng</a></li>
				<li><a href="">Quản lý đơn hàng</a></li>
				<li><a href="">Quản lý slide-banner</a></li>
				<li><a href="">Quản lý sản phẩm</a></li>
				<li><a href="">Thông tin shop</a></li>
			</c:if>
		</ul>
	</nav>
</body>
