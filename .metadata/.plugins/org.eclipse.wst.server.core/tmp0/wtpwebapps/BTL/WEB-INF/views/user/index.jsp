<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="main">
        <div class="slide-banner">
            <div class="container-display-slides">
            	<c:forEach var="item" items="${slides }" varStatus="index">
            		<c:if test="${index.first }">
            			<a class="item-slide active" href="google.com">
            		</c:if>
            		<c:if test="${not index.first }" >
            			<a class="item-slide" href="google.com">
            		</c:if>
            				<div class="content">${item.tenSlide} <br/> ${item.noiDung}</div>
            				<img src="<c:url value='/assets/user/img/slides/${item.hinhAnh }'/>">
            			</a>
            	</c:forEach>

            </div>
            <div class="control-button">
                <button class="button-prev" onclick="plusDivs(-1)">&#10094;</button>
                <button class="button-next" onclick="plusDivs(1)">&#10095;</button>
            </div>
        </div>
        <div class="content flex-container">
            <div class="nav-left">
                <div class="danh-muc-san-pham">
                    <div class="caption">Danh mục sản phẩm</div>
                    <div class="container-loaisanpham">
                    	<c:forEach  var="item" items="${loaiSanPham}">
                    		<div class="item-loai-san-pham">
                    			<a href="<c:url value='/loai-san-pham/${item.maLoaiSanPham}'/>">${item.tenLoaiSanPham}</a>
                    		</div>
                    	</c:forEach>
                    </div>
                </div>
                <div class="san-pham-noi-bat">
                    <div class="caption">Sản phẩm nổi bật</div>
                    <div class="container-loaisanpham">
                    	<c:forEach var="item" items="${sanPhamNoiBat }">
                    		 <div class="item-loai-san-pham"><a href="<c:url value='chi-tiet-san-pham/${item.maSanPham }'/>">${item.tenSanPham }</a></div>
                    	</c:forEach>
                    </div>
                </div>
                <div class="san-pham-moi">
                    <div class="caption">Sản phẩm mới</div>
                    <div class="container-loaisanpham">
                    	<c:forEach var="item" items="${sanPhamMoi }">
                    		 <div class="item-loai-san-pham"><a href="<c:url value='chi-tiet-san-pham/${item.maSanPham }'/>">${item.tenSanPham }</a></div>
                    	</c:forEach>
                    </div>
                </div>
            </div>
            <div class="main-content">
            	<div class="category">
	            	<c:forEach var="loaiSanPham" items="${loaiSanPham }">
	            		<c:set var="dem" scope = "session" value = "${1}"></c:set>
	            		<div class="caption">
	                        <div class="text">${loaiSanPham.tenLoaiSanPham }</div>
	                        <a class="button view-more" href="<c:url value='loai-san-pham/${loaiSanPham.maLoaiSanPham }'/>">Xem tất cả</a>
                    	</div>
	                    <div class="container-product flex-container">
	                    	<c:forEach var="item" items="${sanPham }">
	                    		<c:if test="${item.maLoaiSanPham == loaiSanPham.maLoaiSanPham  && dem <=6}">
	                    			<div class="item-product">
										<a href="<c:url value='/chi-tiet-san-pham/${item.maSanPham }'/>" class="product-image-a" ><img class="product-image" src="<c:url value='/assets/user/img/sanpham/${item.hinhAnh }'/>" alt=""></a>
										<div class="product-info">
											<div class="product-name">${item.tenSanPham }</div>
									  		 <div class="product-price"><fmt:formatNumber type="number" groupingUsed="true" value="${item.gia}" /> VND</div>
										</div>
										<a class="add-cart button" href="<c:url value='/ThemSanPham/${item.maSanPham }'/>">+</a>
									</div>
									<c:set var="dem" scope = "session" value = "${dem + 1}"></c:set>
	                    		</c:if>
	                    	</c:forEach>
	                    </div>
					</c:forEach>
                </div>
            </div>
        </div>
    </div>
	
	
	
</body>