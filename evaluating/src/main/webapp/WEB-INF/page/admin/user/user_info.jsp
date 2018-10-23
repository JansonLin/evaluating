<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>用户信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/frame/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/frame/static/css/style.css">
    <link rel="icon" href="${pageContext.request.contextPath}/frame/static/image/code.png">
</head>
<body class="body">


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>用户详细信息</legend>
</fieldset>

<form class="layui-form" action="">

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">姓名：</label>
            <div class="layui-input-inline">
                <input type="tel" name="phone" lay-verify="phone" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">性别：</label>
            <div class="layui-input-inline">
                <select name="modules" lay-verify="required" lay-search="">
                    <option value="">选择性别</option>
                    <option value="1">男</option>
                    <option value="0">女</option>
                </select>
            </div>
        </div>
    </div>
	<div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">邮箱：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">手机号：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">出生年月：</label>
            <div class="layui-input-inline">
                <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">民族：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
	<div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">学历：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">学位：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">毕业学校：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">专业：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">政治面貌：</label>
            <div class="layui-input-inline">
                <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">籍贯:</label>
        <div class="layui-input-block">
            <input type="text" name="identity" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">户口地址：</label>
        <div class="layui-input-block">
            <input type="text" name="identity" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <button class="layui-btn" lay-submit="" lay-filter="demo2">保存</button>
    </div>
</form>

<script src="${pageContext.request.contextPath}/frame/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
                ,layer = layui.layer
                ,layedit = layui.layedit
                ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });
            return false;
        });


    });
</script>
</body>
</html>