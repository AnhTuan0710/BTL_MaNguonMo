<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<footer class="flex-container">
	<div class="info">
		<div class="caption">Thông tin liên hệ</div>
		<div class="info-content">
			<div>${thongTinLienHeShop.tenShop }</div>
			<div>${thongTinLienHeShop.soDienThoai }</div>
			<div>${thongTinLienHeShop.diaChi }</div>
		</div>
	</div>
	<div class="chinhsach">
		<div class="caption">Chính sách</div>
		<div class="info-content">bbbbbb</div>
	</div>
	<div class="map">
		<div class="caption">Địa chỉ</div>
		<div class="info-content">cccc</div>
	</div>
	
	<script type="text/javascript" src="<c:url value="/assets/user/js/script_slides.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/assets/user/js/script_cart.js"/>"></script>
	<%-- <script type="text/javascript" src="<c:url value="/assets/user/js/custom.js"/>"></script> --%>
	
</footer>