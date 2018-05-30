<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<!-- 引入地址三级联动选择 -->
<script type="text/javascript"
	src="${ctx}/static/jsFramework/distpicker.data.js"></script>
<script type="text/javascript"
	src="${ctx}/static/jsFramework/distpicker.js"></script>
<!-- 引入下拉多选可搜索 -->
<link rel="stylesheet" type="text/css"
	href="${ctx}/static/cssFramework/bootstrap-select.css" />
<script type="text/jscript"
	src="${ctx}/static/jsFramework/bootstrap-select.js"></script>
<!-- 引入Layer时间选择器 -->
<style>
.dropdown-menu>li>a {
	display: block;
	padding: 3px 20px;
	clear: both;
	font-weight: 400;
	line-height: 1.42857143;
	color: #333;
	white-space: nowrap;
}
</style>
<title>新增/修改房源页面</title>
</head>
<body>
	<div class="body-div">
		<div class="col-xs-12">
			<form action="${ctx}/employee/updateOne" class="form-inline"
				id="singleHouse">
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房东姓名：</label> <input type="text"
						class="form-control input-width-200" id="" name="houOwner"
						placeholder="请输入房东姓名" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房东电话：</label> <input type="text"
						class="form-control input-width-200" name="ownerTel"
						placeholder="请输入房东电话" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房东邮箱：</label> <input type="text"
						class="form-control input-width-200" name="owenerEmail"
						placeholder="请输入房东电话" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">发布时间：</label> <input type="text"
						class="form-control input-width-200" id="putDateSelect"
						name="putDate" placeholder="请输入发布时间" value="">
				</div>
				<div class="form-group valid_cow col-xs-12">
					<label class="col-xs-2">房源地址：</label>
					<div id="distpicker">
						<select class="form-control input-width-200" name="houProvince"></select>
						<select class="form-control input-width-200" name="houCity"></select>
						<select class="form-control input-width-200" name="houDistrict"></select>
					</div>
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">详细地址：</label> <input type="text"
						class="form-control input-width-200" name="houDetail">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源描述：</label> <input type="text"
						class="form-control input-width-200" id="" name="houDescription"
						placeholder="eg:有空调，近地铁" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源价格：</label> <input type="text"
						class="form-control input-width-200" name="houPrice"
						placeholder="￥" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">图片路径：</label> <input type="text"
						class="form-control input-width-200" name="houPhotos" id="houseImgUrl"
						placeholder="请输入发布时间" value=""><button type="button" id="imgUpload" onclick="openImgSelect()" class="btn btn-default">上传</button>
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">所在楼层：</label> <input type="text"
						class="form-control input-width-200" name="houFloor"
						placeholder="请输入发布时间" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源总楼层：</label> <input type="text"
						class="form-control input-width-200" name="totalFloors"
						placeholder="请输入发布时间" value="">
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源类型：</label> <select
						class="form-control input-width-200" name="houCatg">
						<option value="1">出租房</option>
						<option value="0">二手房</option>
					</select>
				</div>
				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源户型：</label> <select
						class="form-control input-width-200" name="houType">
						<option value="1">单间</option>
						<option value="2">套一</option>
						<option value="3">套二</option>
						<option value="4">套三</option>
						<option value="5">套四</option>
					</select>
				</div>

				<div class="form-group valid_cow col-xs-6">
					<label class="col-xs-4">房源状态：</label> <select
						class="form-control input-width-200" name="houStatus">
						<option value="0">待租/待售</option>
						<option value="1">已租/已售</option>
					</select>
				</div>
				<c:if test="${sessionScope.loginUser.userRole==1}">
					<div class="form-group col-xs-6">
						<label class="col-xs-4">房源所有者：</label> 
						<input type="text"	class="form-control input-width-200" name="houseOwnerId"
						placeholder="" value="$sessionScope.loginUser.userId}">
					</div> 
				</c:if>
				<c:if test="${sessionScope.loginUser.userRole==0}">
					<div class="form-group col-xs-6">
						<label class="col-xs-4">房源所有者：</label> 
						<select
							class="selectpicker form-control input-width-200" name="houseOwnerId"
							data-live-search="true">
							<c:forEach items="${owners}" var="owners">
								<option value="${owners.userId}">${owners.userName}</option>
							</c:forEach>
						</select>
					</div> 
				</c:if>
		</div>
		</form>
	</div>

	</div>
	<script type="text/javascript">
		$(function() {
			/* 初始化下拉多选可搜索 */
			$('.selectpicker').selectpicker({
				'selectedText' : 'cat'
			});
			/* 初始化地址三级联动选择 */
			$('#distpicker').distpicker({
				autoSelect : false,
			});
			/* 初始化时间选择器 */
			layui.use('laydate', function() {
				var laydate = layui.laydate;
				//执行一个laydate实例
				laydate.render({
					elem : '#putDateSelect' //指定元素
				});
			});

		})
		
		var openImgSelect=function(){
			open("房源图片", "${ctx}/house/houImgUploadView.do",
					[ '900px', '600px' ], function(index, layero) {
						//这里面写点击确定后的回调方法
						var body = top.layer.getChildFrame('body', index);
						var iframeWin = top[layero.find('iframe')[0]['name']];
						var imgUrl=body.find("#hideHouseImgUrl").val();
						$("#houseImgUrl").val(imgUrl);
						alert("111");
						console.log("操作成功");
					});
			
		}
	</script>

</body>
</html>