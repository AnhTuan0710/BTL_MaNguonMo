<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<header>
	<div class="header-top flex-container">
		<div class="left">
			<p style="color: white">Thiên đường ăn vặt</p>
		</div>
		<div class="right">
			<ul class="nav-list flex-container">
				<li class="item-nav"><a href="">Giới thiệu</a></li>
				<li class="item-nav"><a href="">Liên hệ</a></li>
				<li class="item-nav"><a href="">Tin tức</a></li>
                <li class="item-nav"><a href=""><i class="fab fa-facebook"></i></a></li>
                <li class="item-nav"><a href=""><i class="fab fa-twitter"></i></a></li>
                <li class="item-nav"><a href=""><i class="fab fa-pinterest-p"></i></a></li>
			</ul>
		</div>
	</div>

	<div class="header-mid flex-container">
		<div class="left">
			<img width="220" height="100"
				src="<c:url value='/assets/user/img/logo/logo.jpg'/>"
				class="header_logo header-logo" alt="Web Nguyên Liệu Nấu Ăn" />
		</div>
		<div class="mid">
			<input type="text" name="TextSearch" id="TextSearch"
				style="width: 70%;" />
			<div class="button button-search">Tìm kiếm</div>
		</div>
		<div class="right">
			<c:if test="${ empty thongTinNguoiDung }">
				<div class="button"">
					<a href="<c:url value='/dang-ky'/>">Đăng nhập / Đăng ký</a>
				</div>
				
			</c:if>
			<c:if test="${ not empty thongTinNguoiDung }">
				<div class="button"">
					<a href="<c:url value='/dang-xuat'/>">${thongTinNguoiDung.tenDangNhap }(Đăng
						xuất)</a>
				</div>
			</c:if>
		</div>
	</div>

	<div class="header-bottom flex-container">
		<div class="left nav-main" id="nav-main">
			<ul class="nav-list flex-container">
				<c:forEach var="item" items="${menu }" varStatus="index">
					<c:if test="${index.first }">
						<!-- <li class="item-nav active"> -->
						<li class="item-nav">
					</c:if>
					<c:if test="${not index.first }">
						<li class="item-nav">
					</c:if>
					<a href="<c:url value='/${item.link }'/>">${item.tenDanhMuc}</a>
					</li>
				</c:forEach>
			</ul>
		</div>
		<div class="right">
			<i class="fas fa-shopping-cart"></i>
			<div class="button" onclick="open_cart()">Giỏ hàng(					
					<c:if test="${ not empty TongSanPhamGioHang }">${TongSanPhamGioHang }</c:if>
					<c:if test="${ empty TongSanPhamGioHang }">0</c:if>
				)</div>
		</div>
	</div>

	<div class="cart" id="cart">
		<div class="close-cart" onclick="close_cart()">&times</div>
		<label for="cart" class="caption">Giỏ hàng</label>
		<div class="list-product">
			<c:forEach var="item" items="${GioHang }">
				<div class="item">
					<div class="product-name">${item.value.sanPham.tenSanPham }</div>
					<div class="quantity">${item.value.soLuong }</div>
					<div class="control-button">
						<a class="delete-cart button" href="<c:url value='/BotSanPham/${item.value.sanPham.maSanPham}'/>">-</a>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="pay">
			<%-- <c:if test="${ TongTienGioHang }">
				<label for="total-money">Tổng tiền: 0 VND</label>
			</c:if>
			<c:if test="${not empty TongTienGioHang }">
				<label for="total-money">Tổng tiền: ${TongTienGioHang }</label>
			</c:if> --%>
			<label for="total-money">Tổng tiền: 
					<c:if test="${ not empty TongTienGioHang }">${TongTienGioHang }</c:if>
					<c:if test="${ empty TongTienGioHang }">0</c:if> VND</label>
			<div class="pay-submit button">
				<a href="<c:url value='/dat-hang'/>">Đặt ngay</a>
			</div>
		</div>

	</div>
</header>