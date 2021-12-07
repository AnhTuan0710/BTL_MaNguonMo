<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;">Chỉnh sửa slide</div>
		<form:form action="chinh-sua/luu" modelAttribute="slide">
			<table>
				<tr>
					<td>Mã slide:</td>
					<td>${ThongTinSlide.maSlide }</td>
				</tr>
				<tr>
					<td>Trạng thái:</td>
					<td><form:select path="trangThai">
							<form:option value="1">Hiển thị</form:option>
							<form:option value="0">Ẩn</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td>Tiêu đề:</td>
					<td><form:input value="${ThongTinSlide.tenSlide }"
							path="tenSlide" /></td>
				</tr>
				<tr>
					<td>Nội dung:</td>
					<td><form:input value="${ThongTinSlide.noiDung }"
							path="noiDung" /></td>
				</tr>
				<tr>
					<td>Hình ảnh:</td>
					<td><form:input value="${ThongTinSlide.hinhAnh }"
							path="hinhAnh" /></td>
				</tr>
				<tr>
					<td>Link:</td>
					<td><form:input value="${ThongTinSlide.link }" path="link" /></td>
				</tr>

			</table>
			<form:button type="submit">Lưu</form:button>
		</form:form>
	</div>
</body>