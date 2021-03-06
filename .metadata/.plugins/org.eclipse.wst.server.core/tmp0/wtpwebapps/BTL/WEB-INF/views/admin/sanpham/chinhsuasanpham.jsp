<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Chỉnh sửa sản phẩm</div>
		<form:form action="chinh-sua/luu" modelAttribute="sanPham" method="POST">
			<table>
				<tr>
					<td>Mã sản phẩm:</td>
					<td>${SanPham.maSanPham }</td>
				</tr>
				<tr>
					<td>Tên sản phẩm:</td>
					<td><form:input value=" ${SanPham.tenSanPham }"
							path="tenSanPham" /></td>
				</tr>
				<tr>
					<td>Hình ảnh:</td>
					<td><form:input value="${SanPham.hinhAnh }"
							path="hinhAnh" /></td>
				</tr>
				<tr>
					<td>Giá:</td>
					<td><form:input value="${SanPham.gia }"
							path="gia" /></td>
				</tr>
				<tr>
					<td>Mô tả:</td>
					<td><form:input value="${SanPham.moTa }"
							path="moTa" /></td>
				</tr>
				<tr>
					<td>Ngày tạo:</td>
					<td>${SanPham.ngayTao }</td>
				</tr>
				<tr>
					<td>Ngày cập nhật: </td>
					<td>${SanPham.ngayCapNhat }</td>
				</tr>
				
				<tr>
					<td>Sản phẩm nổi bật:</td>
					<td>
						<form:select path="noiBat">
							<form:option value="1">Có</form:option>
							<form:option value="0">Không</form:option>
						</form:select>
					</td>
				</tr>
				
				<tr>
					<td>Sản phẩm mới: </td>
					<td>
						<form:select path="sanPhamMoi">
							<form:option value="1">Có</form:option>
							<form:option value="0">Không</form:option>
						</form:select>
					</td>
				</tr>
				
				<tr>
					<td>Loại sản phẩm: </td>
					<td>
						<form:select path="maLoaiSanPham">
							<c:forEach var="item" items="${DanhSachLoaiSanPham }">
								<form:option value="${item.maLoaiSanPham }">${item.tenLoaiSanPham }</form:option>
							</c:forEach>
						</form:select>
					</td>
				</tr>

			</table>
			<form:button type="submit">Lưu</form:button>
		</form:form>
	</div>
</body>