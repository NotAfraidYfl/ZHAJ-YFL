<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Department</title>
<%@include file="/WEB-INF/views/common/common.jsp"%>
</head>
<body>
	<div class="header-section">
		<div class="container">
			<div class="head-top">
				<div class="social-icon">
					<a href="#"><i class="icon"></i></a> <a href="#"><i
						class="icon1"></i></a> <a href="#"><i class="icon2"></i></a> <a
						href="#"><i class="icon3"></i></a> <a href="#"><i
						class="icon4"></i></a>
				</div>
				<div class="email">
					<ul>
						<li><i class="glyphicon glyphicon-envelope"
							aria-hidden="true"></i>邮箱: <a href="mailto:info@example.com">info@example.com</a>
						</li>
						<li><i class="glyphicon glyphicon-log-in" aria-hidden="true"></i><a
							href="#" data-toggle="modal" data-target="#myModal">登陆</a></li>
						<li><i class="glyphicon glyphicon-lock" aria-hidden="true"></i><a
							href="#" data-toggle="modal" data-target="#myModal1">注册</a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<nav class="navbar navbar-default"> <!---Brand and toggle get grouped for better mobile display--->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<div class="navbar-brand">
					<h1>
						<a href="index.html"><span>Real </span>Space</a>
					</h1>
				</div>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="${ctx}/home/index.do">首页 <span
							class="sr-only">(current)</span></a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">部门<span class="caret"></span></a>
						<ul class="dropdown-menu" id="deptDropMenu"></ul></li>
					<li><a href="${ctx}/employee/empList.do">员工列表<span
							class="caret"></span></a></li>
					<li class="dropdown active"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown" role="button"
						aria-haspopup="true" aria-expanded="false">仓库 <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="2columnsgallery.html">2 Columns Gallery</a></li>
							<li><a href="3columnsgallery.html">3 Columns Gallery</a></li>
							<li><a href="4columnsgallery.html">4 Columns Gallery</a></li>
						</ul></li>
					<li><a href="blog.html">空间</a></li>
					<li><a href="codes.html">代码</a></li>
					<li><a href="contact.html">联系我们</a></li>
				</ul>
				<div class="phone">
					<span><i class="glyphicon glyphicon-phone"
						aria-hidden="true"></i>1-999-4563-555</span>
				</div>
				<div class="clearfix"></div>
			</div>
			</nav>
		</div>
	</div>




	<script type="text/javascript">
		$(function() {
			//请求员工列表的数据的ajx
			$.ajax({
				type : "GET",
				url : "${ctx}/department/listJson?pageNum=1",
				success : function(data) {
					console.log(data.data.list);
				}

			})

		})
	</script>
</body>
</html>