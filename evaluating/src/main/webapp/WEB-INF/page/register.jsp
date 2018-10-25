<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>注册页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/frame/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/frame/static/css/style.css">
    <link rel="icon" href="${pageContext.request.contextPath}/frame/static/image/code.png">
</head>
<body>

<div class="login-main">
    <header class="layui-elip">人才评测系统注册页</header>
    <form class="layui-form" action="${pageContext.request.contextPath}/register" method="post">
        <div class="layui-input-inline">
        	<input type="text" name="uName" required  lay-verify="required" placeholder="用户名" autocomplete="off" class="layui-input">
            <br/>
            <input type="password" name="uPassword" required  lay-verify="required" placeholder="密码" autocomplete="off" class="layui-input">
            <br/>
            <input type="password" name="account" required  lay-verify="required" placeholder="确认密码" autocomplete="off" class="layui-input">
            <br/>
            <input type="text" name="uPhone" required  lay-verify="required" placeholder="手机" autocomplete="off" class="layui-input">
            <br/>
            <input type="text" name="uEmail" required  lay-verify="required" placeholder="邮箱" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-input-inline login-btn">
            <button type="submit" class="layui-btn">注册</button>
        </div>
        <hr/>
        <p><a href="${pageContext.request.contextPath}/toLogin" class="fl">已有账号？立即登录</a><a href="javascript:;" class="fr">忘记密码？</a></p>
    </form>
</div>


<script src="${pageContext.request.contextPath}/frame/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['form'], function () {
        var form    = layui.form
            ,$      = layui.jquery;

        // you code ...


    });
</script>
</body>
</html>