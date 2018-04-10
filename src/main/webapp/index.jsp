<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<%@include file="/WEB-INF/views/common/common.jsp"%>
</head>
<body>
	<div id="NavigationBar">
		<ul class="nav nav-tabs">
			<li role="presentation" class="active"><a href="${ctx}/index.do">首页</a></li>
			<li role="presentation"><a href="#">公司信息</a></li>
			<li role="presentation"><a href="#">部门列表</a></li>
			<li role="presentation"><a href="${ctx}/employee/empList.do">员工列表</a></li>
			<li role="presentation"><a href="#">租房管理</a></li>
			<li role="presentation"><a href="#">二手房源</a></li>
		</ul>
	</div>
	<button class="layui-btn layui-btn-warm">一个标准的按钮</button>
	<a href="http://www.layui.com" class="layui-btn">一个可跳转的钮</a>
</body>
</html>
