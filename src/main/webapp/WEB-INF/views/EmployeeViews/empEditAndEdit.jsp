<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<title>员工列表页面</title>
</head>
<body>
	<div class="body-div">
		<div class="col-xs-12">
			<form>
				<div class="form-group">
					<label for="exampleInputEmail1">员工姓名：</label> <input type="text"
						class="form-control" id="" placeholder="请输入员工姓名">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">性别：</label> <input type="text"
						class="form-control" id="" placeholder="请输入员工性别">
				</div>
				<div class="form-group">
					<label for="exampleInputFile">邮箱：</label> <input type="email"
						class="form-control" id="" placeholder="请输入员工邮箱">
				</div>
				<div class="form-group">
					<label for="exampleInputFile">所属部门：</label> <select
						class="form-control">
						<option value=""></option>
					</select>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>

	</div>
	<script type="text/javascript">
		$(function() {
			//请求员工部门的数据的ajax
			$.ajax({
						type : "GET",
						url : "${ctx}/department/listJson?pageNum=1",
						success : function(data) {
							var depList = data.data.list, liString = "";
							for (var i = 0; i < depList.length; i++) {
								liString += "<li><a href='#' deptId='"+depList[i].deptId+"'>"
										+ depList[i].deptName + "</a></li>";
							}
							$("#deptDropMenu").html(liString);
						}

					})
		})
	</script>

</body>
</html>