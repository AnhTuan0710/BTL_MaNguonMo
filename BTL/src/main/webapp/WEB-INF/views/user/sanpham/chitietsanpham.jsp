<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
</head>
<body>
	<div class="product-detail flex-container">
		<div class="top flex-container">
			<div class="left">
				<img src="<c:url value='/assets/user/img/sanpham/${sanPham.hinhAnh }'/>" alt="">
			</div>
			<div class="right">
				<div class="product-name">Tên sản phẩm: ${sanPham.tenSanPham }</div>
				<br/>
				<div class="product-price">Giá: ${sanPham.gia }</div>
				<!-- <input type="number" name="quantity" id="quantity" min="1"
					, value="1"> -->
				
				<br/>
				<a class="button-add-to-cart button" href="<c:url value='/ThemSanPham/${sanPham.maSanPham }'/>">Thêm vào giỏ hàng</a>
			</div>
		</div>
		<div class="bottom">
			<div class="product-detail">${sanPham.moTa }</div>
		</div>
	</div>
</body>