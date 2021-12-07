<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Admin</title>
<link rel="stylesheet" href="<c:url value='/assets/admin/css/style.css'/>" type="text/css">
</head>
<body>
	<%@include file="/WEB-INF/views/layouts/admin/header.jsp" %>
	<main>
		<%@include file="/WEB-INF/views/layouts/admin/navigation.jsp" %>
		<decorator:body/>
	</main>
</body>
</html>