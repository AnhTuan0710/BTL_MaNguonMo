<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Thông tin shop</div>
		<form:form action="thong-tin-shop/luu" modelAttribute="thongTinLienHeShop" mothed="POST">
			<table>
				<tr>
					<th>Tên shop:</th>
					<td><form:input value="${ThongTinShop.tenShop }"
							path="tenShop" /></td>
				</tr>
				<tr>
					<th>Địa chỉ:</th>
					<td><form:input value="${ThongTinShop.diaChi }" path="diaChi" /></td>
				</tr>
				<tr>
					<th>Số điện thoại:</th>
					<td><form:input value="${ThongTinShop.soDienThoai }"
							path="soDienThoai" /></td>
				</tr>
			</table>
			<form:button type="submit">Lưu</form:button>
		</form:form>
	</div>
</body>