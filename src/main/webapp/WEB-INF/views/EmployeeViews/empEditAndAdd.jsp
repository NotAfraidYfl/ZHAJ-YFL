<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<title>查看员工列表页面</title>
</head>
<body>
	<div class="body-div">
		<div class="col-xs-12">
			<form action="${ctx}/employee/updateOne" id="singleEmp">
				<div class="form-group">
					<label for="exampleInputEmail1">员工姓名：</label> <input type="text"
						class="form-control" id="" name="empName" placeholder="请输入员工姓名"
						value="${emp.empName}">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">员工手机：</label> <input type="text"
						class="form-control" id="" name="empTel" placeholder="请输入员工姓名"
						value="${emp.empTel}">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">性别：</label> <select
						class="form-control" id="" name="empGender">
							<option value="1" ${emp.empGender==1?"selected":"" }>男</option>
							<option value="0" ${emp.empGender==0?"selected":"" }>女</option>
						</select>
				</div>
				<div class="form-group">
					<label for="exampleInputFile">邮箱：</label> <input type="email"
						class="form-control" id="" name="empEmail" placeholder="请输入员工邮箱"
						value="${emp.empEmail}">
				</div>
				<div class="form-group">
					<label for="exampleInputFile">所属部门：</label> <select
						class="form-control" name="dId" id="depSelect">
						<option></option>
					</select>
				</div>
				<input type="hidden" name="empId" value="${emp.empId}"> <input
					type="hidden" id="dId" disabled value="${emp.dId}">

				<button type="submit" id="" class="btn btn-default hide">Submit</button>
			</form>
		</div>

	</div>
	<script type="text/javascript">
		$(function() {
			//请求员工部门的数据的ajax
			$
					.ajax({
						type : "GET",
						url : "${ctx}/department/listJson?pageNum=1",
						success : function(data) {
							var depList = data.data.list, options = "";
							for (var i = 0; i < depList.length; i++) {
								options += "<option value='"+depList[i].deptId+"'>"
										+ depList[i].deptName + "</option>";
							}
							$("#depSelect").html(options);
							var dId = $("#dId").val();
							for (var i = 0; i < $("#depSelect").find("option").length; i++) {
								if (dId == $("#depSelect").find("option").eq(i)
										.val()) {
									$("#depSelect").find("option").eq(i).attr(
											"selected", true);
								}
							}

						}

					})
		})
	</script>

</body>
</html>