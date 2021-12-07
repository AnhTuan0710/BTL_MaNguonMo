<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<div class="content">
		<div class="login-admin">
			<form:form action="dang-nhap" modelAttribute="taiKhoan" method="POST">
				<table>
					<tr>
						<th colspan="2">Đăng nhập</th>
					</tr>
					<div>${statusLogin }</div>
					<tr>
						<td><label for="Username">Tài khoản:</label></td>
						<td><form:input type="text" name="Username" id="Username"
								path="tenDangNhap" /></td>
					</tr>
					<tr>
						<td><label for="Password">Mật khẩu:</label></td>
						<td><form:input type="text" name="Password" id="Password"
								path="matKhau" /></td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="submit" class="button-login">Đăng nhập</button>
						</td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>