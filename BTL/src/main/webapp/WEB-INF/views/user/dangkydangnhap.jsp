<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Đăng ký đăng nhập</title>
</head>
<body>
	<!-- Login Signup -->
	<div class="login-signup-background" id="login-signup-background">
		<div class="signup">
			<form:form action="dang-ky" modelAttribute="taiKhoan" method="POST">
				<table>
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
							<button type="submit" class="button-signup">Đăng ký</button>
						</td>
					</tr>
				</table>
			</form:form>
		</div>
		<div class="login">
			<form:form action="dang-nhap" modelAttribute="taiKhoan" method="POST">
				<table>
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
							<button type="submit" class="button-signup">Đăng nhập</button>
							<span id="btnDangNhap">Đang nappafiad</span>
						</td>
					</tr>
				</table>
			</form:form>
		</div>
		<h1>${statusLogin }</h1>
	</div>
</body>