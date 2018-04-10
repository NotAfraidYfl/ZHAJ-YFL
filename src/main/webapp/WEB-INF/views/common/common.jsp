<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="taglib.jsp"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="renderer" content="webkit" />
<!-- 引入layerCSS -->
<link href="${ctx}/static/layer/layui-v2.2.5/layui/css/layui.css"
	rel="stylesheet" />
<!-- 引入bootstrapCSS -->
<link
	href="${ctx}/static/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="${ctx}/static/cssFramework/style.css" rel='stylesheet'
	type='text/css' />
<link
	href="${ctx}/static/bootstrap/bootstrap-3.3.7-dist/fonts/font-awesome.min.css"
	rel='stylesheet' type='text/css'>
<link href="${ctx}/static/commonCss/commonStyle.css" rel='stylesheet'
	type='text/css' />
<script type="text/javascript">
	var basePath = "${ctx}";
	var ctx = "${ctx}";
</script>
<!-- 引入jQuery -->
<script type="text/javascript"
	src="${ctx}/static/jsFramework/jquery-1.11.1.min.js"></script>
<!-- 引入layer.Js -->
<script type="text/javascript"
	src="${ctx}/static/layer/layui-v2.2.5/layui/layui.all.js"></script>
<!-- 引入bootstrap.js -->
<script type="text/javascript"
	src="${ctx}/static/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<!-- 引入通用js -->
<script type="text/javascript" src="${ctx}/static/commonJs/common.js"></script>
<link rel="stylesheet" href="${ctx}/static/cssFramework/swipebox.css">
<script src="${ctx}/static/jsFramework/jquery.swipebox.min.js"></script>
<!-- 引入myLayer.js -->
<script type="text/javascript" src="${ctx}/static/commonJs/mylayer.js"></script>
