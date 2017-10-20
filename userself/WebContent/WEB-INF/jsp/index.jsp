<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="yannuo"></div>
<input type="button" onclick="getJson(${id})"/>
</body>
<script src="${pageContext.request.contextPath }/js/jquery-1.11.2.min.js "></script>
<script type="text/javascript">
function getJson(id) {
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath}/getUser.action",
		data:{"id":id},
		success:function(data) {
			document.getElementById("yannuo").innerText = data.intro.user_name;
		},
	});
}
</script>
</html>