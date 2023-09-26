<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Memo</title>
<tiles:insertAttribute name="preScript"/>
</head>
<body data-context-Path="${pageContext.request.contextPath }">
<main>
	<tiles:insertAttribute name="content"/>
</main>
<tiles:insertAttribute name="postScript"/>
</body>
</html>