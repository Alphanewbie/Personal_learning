<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2><%= request.getParameter("gname") %>님은 D등급입니다... 꾸준히 노력하세요.</h2>
<a href="<%=request.getHeader("referer") %>">성적 입력 화면으로</a>

</body>
</html>