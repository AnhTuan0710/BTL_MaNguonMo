<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<header>
        <div class="caption">
            Adminitator
            <c:if test="${not empty Admin }"><a href="<c:url value='/admin/dang-xuat'/>">(Đăng xuất)</a></c:if>
        </div>
    </header>
</body>