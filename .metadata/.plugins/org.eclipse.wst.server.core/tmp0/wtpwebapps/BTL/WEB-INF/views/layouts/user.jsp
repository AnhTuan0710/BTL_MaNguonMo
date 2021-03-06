<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value='/assets/user/css/style.css'/>" type="text/css" >
    <link href="<c:url value='/assets/font/fontawesome-free-5.15.4-web/css/all.min.css'/>" rel="stylesheet">
	<decorator:head></decorator:head>
</head>

<body>
    <%@ include file="/WEB-INF/views/layouts/user/header.jsp" %>
    
   <div class="set-height-min">
    	<decorator:body></decorator:body>
   </div>
    
    <%@ include file="/WEB-INF/views/layouts/user/footer.jsp" %>
</body>

</html>
