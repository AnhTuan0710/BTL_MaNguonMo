<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="main">
		<div class="content flex-container">
			<div class="main-content">
				<div class="category">
					<div class="container-product flex-container">
						<c:forEach var="item" items="${tatCaSanPhamCungLoaiTrong1Trang }">
								<div class="item-product">
									<a href="<c:url value='/chi-tiet-san-pham/${item.maSanPham }'/>" class="product-image-a" ><img class="product-image" src="<c:url value='/assets/user/img/sanpham/${item.hinhAnh }'/>" alt=""></a>
									<div class="product-info">
										<div class="product-name">${item.tenSanPham }</div>
								  		 <div class="product-price"><fmt:formatNumber type="number" groupingUsed="true" value="${item.gia}" /> VND</div>
									</div>
									<a class="add-cart button" href="<c:url value='/ThemSanPham/${item.maSanPham }'/>">+</a>
								</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="pagination">
		<a href="#">&laquo;</a>
		<c:forEach var="item" begin="1" end="${paginateInfo.totalPage }" varStatus="loop">
			<c:if test="${loop.index == paginateInfo.currentPage }">
				<a class="active" href="<c:url value='/tat-ca-san-pham/${loop.index }'/>">${loop.index }</a>
			</c:if>
			<c:if test="${loop.index != paginateInfo.currentPage }">
				<a href="<c:url value='/tat-ca-san-pham/${loop.index }'/>">${loop.index }</a>
			</c:if>
		</c:forEach>
		<a href="#">&raquo;</a>
	</div>
</body>
