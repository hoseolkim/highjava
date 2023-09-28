<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>뭐야 이거 무서워..</title>
<tiles:insertAttribute name="preScript"/>
</head>
<body data-context-path="${pageContext.request.contextPath }">
<main>
	<tiles:insertAttribute name="content"/>
</main>
<tiles:insertAttribute  name="postScript"/>
</body>
</html>