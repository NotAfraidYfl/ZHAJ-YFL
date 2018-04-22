<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<script type="text/javascript"
	src="${ctx}/static/jsFramework/distpicker.data.js"></script>
<script type="text/javascript"
	src="${ctx}/static/jsFramework/distpicker.js"></script>
<title>新增/修改房源页面</title>
</head>
<body>
	<div class="body-div">
		<div class="col-xs-12">
			<form action="${ctx}/employee/updateOne" class="form-inline"
				id="singleHouse">
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房东姓名：</label> <input type="text" class="form-control input-width-200"
						id="" name="houOwner" placeholder="请输入房东姓名" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房东电话：</label> <input type="text"
						class="form-control input-width-200" name="ownerTel" placeholder="请输入房东电话"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房东邮箱：</label> <input type="text"
						class="form-control input-width-200" name="owenerEmail" placeholder="请输入房东电话"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-12">
					<label class="col-xs-2">房源地址：</label>
					<div id="distpicker">
						<select class="form-control input-width-200" name="houProvince"></select> 
						<select	class="form-control input-width-200" name="houCity"></select> 
						<select	class="form-control input-width-200" name="houDistrict"></select>
					</div>
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">详细地址：</label>
					<input type="text" class="form-control input-width-200" name="houDetail">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源描述：</label> 
					<input type="text"	class="form-control input-width-200" id="" name="houDescription" placeholder="eg:有空调，近地铁"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源价格：</label> 
					<input type="text"	class="form-control input-width-200" name="houPrice" placeholder="￥"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">发布时间：</label> 
					<input type="text"	class="form-control input-width-200" name="putDate" placeholder="请输入发布时间"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">图片路径：</label> 
					<input type="text"	class="form-control input-width-200" name="houPhotos" placeholder="请输入发布时间"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">所在楼层：</label> 
					<input type="text"	class="form-control input-width-200" name="houFloor" placeholder="请输入发布时间"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源总楼层：</label> 
					<input type="text"	class="form-control input-width-200" name="totalFloors" placeholder="请输入发布时间"
						value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源类型：</label> 
					<select class="form-control input-width-200" name="houCatg">
						<option value="1">出租房</option>
						<option value="0">二手房</option>
					</select>
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源户型：</label> 
					<select class="form-control input-width-200" name="houType">
						<option value="1">单间</option>
						<option value="2">套一</option>
						<option value="3">套二</option>
						<option value="4">套三</option>
						<option value="5">套四</option>
					</select>
				</div>
				
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源状态：</label> 
					<select class="form-control input-width-200" name="houStatus">
						<option value="0">待租/待售</option>
						<option value="1">已租/已售</option>
					</select>
				</div>
				
				</div>
			</form>
		</div>

	</div>
	<script type="text/javascript">
		$(function() {
			$('#distpicker').distpicker({
				autoSelect : false,
			});
		})
	</script>

</body>
</html>