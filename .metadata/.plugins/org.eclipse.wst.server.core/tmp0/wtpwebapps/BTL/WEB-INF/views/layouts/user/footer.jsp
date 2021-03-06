<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<footer class="flex-container">
	<div class="info">
		<div class="caption">Thông tin liên hệ</div>
		<div class="info-content">
			<ul>
				<li>${thongTinLienHeShop.tenShop }</li>
				<li>Số điện thoại: ${thongTinLienHeShop.soDienThoai }</li>
				<li>Địa chỉ: ${thongTinLienHeShop.diaChi }</li>
			</ul>
		</div>
	</div>
	<div class="chinhsach">
		<div class="caption">Chính sách</div>
		<div class="info-content">
			<ul>
				<li>Chính sách bảo mật</li>
				<li>Chính sách giao hàng</li>
				<li>Chính sách đổi trả</li>
			</ul>
		</div>
	</div>
	<div class="map">
		<div class="caption">Kết nối mạng xã hội</div>
		<div class="info-content">
			<div>
				<a href=""><i class="fab fa-facebook-square"></i></i>
					www.facebook.com/miumiuquan</a>
			</div>
			<div>
				<a href=""><i class="fab fa-twitter-square"></i>
					www.twitter.com/miumiuquan</a>
			</div>
			<div>
				<a href=""><i class="fab fa-pinterest-square">
						</i> www.pinterest.com/miumiuquan</a>
			</div>
		</div>
	</div>

	<script type="text/javascript"
		src="<c:url value="/assets/user/js/script_slides.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/assets/user/js/script_cart.js"/>"></script>
	<%-- <script type="text/javascript" src="<c:url value="/assets/user/js/custom.js"/>"></script> --%>

</footer>