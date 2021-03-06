<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Tạo slide</div>
		<form:form action="them/luu" modelAttribute="slide">
			<table>
				<tr>
					<td>Trạng thái:</td>
					<td><form:select path="trangThai">
							<form:option value="1">Hiển thị</form:option>
							<form:option value="0">Ẩn</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td>Tiêu đề:</td>
					<td><form:input value="" path="tenSlide" /></td>
				</tr>
				<tr>
					<td>Nội dung:</td>
					<td><form:input value="" path="noiDung" /></td>
				</tr>
				<tr>
					<td>Hình ảnh:</td>
					<td><form:input value="" path="hinhAnh" /></td>
				</tr>
				<tr>
					<td>Link:</td>
					<td><form:input value="" path="link" /></td>
				</tr>

			</table>
			<form:button type="submit">Lưu</form:button>
		</form:form>
	</div>
</body>