<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<link href="${ctx}/static/distpicker-master/src" rel="stylesheet" />
<script type="text/javascript"
	src="${ctx}/static/distpicker-master/dist/distpicker.common.js"></script>
<script type="text/javascript"
	src="${ctx}/static/distpicker-master/dist/distpicker.js"></script>
<title>新增/修改房源页面</title>
</head>
// 省 private String houProvince; // 市 private String houCity; // 区
private String houDistrict; // 详细地址 private String houDetail; // 房屋描述
private String houDescription; // 房东邮箱 private String owenerEmail; //
图片路径 private String houPhotos; // 租赁或者出售价格 private Float houPrice; //
发布时间 private Date putDate; // 房屋所在楼层 private Integer houFloor; // 房屋总楼层
private Integer totalFloors; // 房型 1.一室 2.两室 3.三室 private Integer
houType; // 房屋类型 0 --二手房 1 --出租房 private Integer houCatg; // 负责员工Id
private String empId; // 房屋状态 private Integer houStatus;

<body>
	<div class="body-div">
		<div class="col-xs-12">
			<form action="${ctx}/employee/updateOne" id="singleEmp">
				<div class="form-group">
					<label for="">房东姓名：</label> <input type="text" class="form-control"
						id="" name="houOwner" placeholder="请输入房东姓名" value="">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">房东电话：</label> <input type="text"
						class="form-control" id="" name="ownerTel" placeholder="请输入员工姓名"
						value="${emp.empTel}">
				</div>
				<div class="form-group">
					<div data-toggle="distpicker">
						<select></select> <select></select> <select></select>
					</div>
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
		})
	</script>

</body>
</html>