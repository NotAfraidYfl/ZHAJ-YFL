<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!---header--->
<div class="header-section">
	<div class="container">
		<div class="head-top">
			<div class="social-icon">
				<a href="#"><i class="icon"></i></a>
				<a href="#"><i class="icon1"></i></a>
				<a href="#"><i class="icon2"></i></a>
				<a href="#"><i class="icon3"></i></a>
				<a href="#"><i class="icon4"></i></a>
			</div>
			<div class="email">
				<ul>
					<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i>邮箱:
						<a href="mailto:info@example.com">info@example.com</a>
					</li>
					<li><i class="glyphicon glyphicon-log-in" aria-hidden="true"></i>
						<a href="#" data-toggle="modal" data-target="#myModal">登陆</a>
					</li>
					<li><i class="glyphicon glyphicon-lock" aria-hidden="true"></i>
						<a href="#" data-toggle="modal" data-target="#myModal1">注册</a>
					</li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
		<nav class="navbar navbar-default">
			<!---Brand and toggle get grouped for better mobile display--->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<div class="navbar-brand">
					<h1>
						<a href="index.html"><span>Real </span>Home</a>
					</h1>
				</div>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li onclick="navLocated(this,0)">
						<a href="${ctx}/home/index.do">首页 <span class="sr-only">(current)</span></a>
					</li>
					<li onclick="navLocated(this,1)" class="dropdown">
						<a href="${ctx}/department/departmentList.do" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">部门<span class="caret"></span></a>
						<ul class="dropdown-menu" id="deptDropMenu"></ul>
					</li>
					<li onclick="navLocated(this,2)">
						<a href="${ctx}/employee/empList.do">员工列表</a>
					</li>
					<li onclick="navLocated(this,3)" class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">仓库 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li>
								<a href="2columnsgallery.html">2 Columns Gallery</a>
							</li>
							<li>
								<a href="3columnsgallery.html">3 Columns Gallery</a>
							</li>
							<li>
								<a href="4columnsgallery.html">4 Columns Gallery</a>
							</li>
						</ul>
					</li>
					<li onclick="navLocated(this,4)">
						<a href="blog.html">空间</a>
					</li>
					<li onclick="navLocated(this,5)">
						<a href="codes.html">代码</a>
					</li>
					<li onclick="navLocated(this,6)">
						<a href="contact.html">联系我们</a>
					</li>
				</ul>
				<div class="house-config">
					<a onclick="changeLocalStorage()" style="text-decoration: none; color: #fff; font-family: cursive;" href="${ctx}/house/houList.do"><span><i class="glyphicon glyphicon-home" aria-hidden="true"></i>房源管理</span>
					</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</nav>
	</div>
</div>

<!--copy-->
<!-- login -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content modal-info">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body real-spa">
				<div class="login-grids">
					<div class="login">

						<div class="login-right">
							<form id="loginForm">
								<h3>登陆</h3>
								<input type="text" value="请输入您的用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入您的用户名';}" required=""> <input type="password" value=请输入你的密码 onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入您的密码';}" required="">
								<h4>
									<a href="#">Forgot password</a>
								</h4>
								<div class="single-bottom">
									<input type="checkbox" id="brand" value=""> <label for="brand"><span></span>Remember Me.</label>
								</div>
								<input type="submit" value="登陆">
							</form>
						</div>

					</div>
					<p>
						通过登录您同意我们的
						<a href="#">条款</a> 和
						<a href="#">隐私政策</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- //login -->
<!-- Register -->
<div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content modal-info">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body real-spa">
				<div class="login-grids">
					<div class="login">
						<div class="login-right">
							<form id="registerForm">
								<h3>注册</h3>
								<input type="text" name="userName" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
								<input type="text" name="userTel" value="Mobile number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Mobile number';}" required="">
								<input type="text" name="userEmail" value="Email id" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email id';}" required="">
								<input type="password" name="userPassword" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">
								<input type="submit" value="注册" onclick="registNow(this);return false;">
							</form>
						</div>
						<div class="clearfix"></div>
					</div>
					<p>
						通过登录您同意我们的
						<a href="#">条款</a> 和
						<a href="#">隐私政策</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</div>

<script>
	$(function() {
		// 请求员工部门的数据的ajax
		$.ajax({
			type: "GET",
			url: "${ctx}/department/listJson?pageNum=1",
			success: function(data) {
				var depList = data.data.list,
					liString = "";
				for(var i = 0; i < depList.length; i++) {
					liString += "<li><a href='#' deptId='" + depList[i].deptId +
						"'>" +
						depList[i].deptName + "</a></li>";
				}
				$("#deptDropMenu").html(liString);
			}

		});
		var index = localStorage.getItem('index');
		console.log(index);
		if(index) {
			$(".navbar-nav").children().eq(index).addClass("active");
		}
	})
	/*定位导航栏*/
	function navLocated(that, index) {
		$(that).addClass("active");
		localStorage.setItem('index', index);
	}
	/*导航栏切换*/
	function changeLocalStorage() {
		$(".navbar-nav").children().each(function() {
			if($(this).hasClass("active")) {
				$(this).removeClass("active");
				$(".navbar-nav").children().unbind();
				localStorage.removeItem('index');
			}
		});

	}
	/*注册提交*/
	var registNow = function(that) {
		$.ajax({
			type: "POST",
			url: "${ctx}/loginAndRegist/regeist.do",
			data: $("#registerForm").serialize(),
			async: true,
			success: function(res) {
				console.log(res);
				if(res.code==0){
					$("#myModal1").hide();
					$("#myModal2").show();	
				}else{
					alertMsg("注册失败");
				}
			}
		});
	}
	/*登陆提交*/
	var loginNow = function(that) {
		$.ajax({
			type: "POST",
			url: "${ctx}/",
			data: $("#loginForm").serialize(),
			async: true,
			success: function(result) {

			}
		});
	}
</script>