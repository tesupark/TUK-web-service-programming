<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>end page</title>
</head>
<body>
이름 : <%=request.getParameter("username") %><BR>
 전화번호: <%=request.getParameter("phone") %>
</body>
</html>