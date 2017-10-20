<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<style type="text/css">
    *{padding:0;margin:0;}
    body{background:url(img/grass.jpg) no-repeat 50% 0;font-size:12px;}
    img{border:0;height: 100%}
    .lg{width:468px;height:468px;margin:100px auto;background:url(img/login_bg.png) no-repeat;}
    .lg_top{ height:200px;width:468px;}
    .lg_main{width:400px;height:180px;margin:0 25px;}
    .lg_m_1{width:290px;height:100px;padding:60px 55px 20px 55px;}
    .ur{height:33px;line-height:37px;border:1px solid gainsboro;color:#666;width:236px;margin:4px 28px;padding-left:10px;font-size:12px;}
    .pw{height:33px;line-height:37px;border:1px solid gainsboro;color:#666;width:236px;margin:4px 28px;padding-left:10px;font-size:12px;}
    #input{height:33px;line-height:37px;border:1px solid gainsboro;color:#666;width:130px;margin:4px 28px;padding-left:10px;font-size:12px;}
    .bn{width:330px;height:72px;background:url(img/enter.png) no-repeat;border:0;display:block;font-size:18px;color:#FFF;}
    .lg_foot{height:80px;width:330px;padding: 6px 68px 0 68px;}
    #code {  font-family:Arial;  font-style:italic;  font-weight:bold;  border:0;  letter-spacing:2px;  color:blue; }
     a:link,a:visited{text-decoration:none; }
</style>
<script src="${pageContext.request.contextPath}/js/denglu.js"></script>
<body>
<div class="lg">
    <form action="${pageContext.request.contextPath }/login.action" method="POST">
        <div class="lg_top"></div>
        <div class="lg_main">
            <div class="lg_m_1">
                <input name="account" placeholder="账号" value="" class="ur" />
                <input name="password" placeholder="密码" type="password" value="" class="pw" />
                <input name="checkcode" type = "text" placeholder="验证码"  id = "input"/>
                <img alt="点击生成验证码"  onclick="getCode()" id="code">
            </div>
        </div>
        <div class="lg_foot">
			<input type="submit" value="登录" class="bn" />
		</div>
    </form>
</div>
</body>
<script type="text/javascript">
function getCode(){
	document.getElementById("code").src = "${pageContext.request.contextPath }/getCode.action?time="+new Date().getTime();
}
(getCode())();
</script>
</html>