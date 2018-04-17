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
	<%@include file="/WEB-INF/views/header/header.jsp"%>
	<div class="body-div">
		<div id="formDiv">
			<form id="searchForm">
				<div class="col-xs-12">
					<div id="container" class="form-inline">
						<div class="form-inline col-xs-3">
							<label class="text-right">员工姓名：</label> <input name="name"
								type="text" class=" form-control" placeholder="请输入公司名称"
								value="${company.name}">
						</div>
						<div class="form-inline col-xs-3">
							<label for="exampleInputFile">所属部门：</label> <select
								class="form-control" name="d_id">
								<option value=""></option>
							</select>
						</div>
						<div class="form-inline col-xs-3">
							<label for="exampleInputFile">性别</label> <select
								class="form-control">
								<option value="0">女</option>
								<option value="1">男</option>
							</select>
						</div>
						<div class="form-inline col-xs-3">
							<label class="text-right">员工ID：</label> <input name="name"
								type="text" class=" form-control" placeholder="请输入公司名称"
								value="${company.name}">
						</div>
						<div class="btn-group folat-right">
							<button class="btn btn-default" type="button"
								onclick="createEmp();">
								<i class="glyphicon glyphicon-plus"></i>创 建
							</button>
						</div>
					</div>
				</div>
			</form>

		</div>

		<div id="page-body">
			<div class="div-table">
				<table class="table table-hove table-bordered" id="empTable">
					<colgroup>
						<col width="150">
						<col width="200">
						<col>
					</colgroup>
					<thead>
						<tr>
							<th class="text-center">序号</th>
							<th class="text-center">姓名</th>
							<th class="text-center">电话</th>
							<th class="text-center">性别</th>
							<th class="text-center">邮箱</th>
							<th class="text-center">部门</th>
							<th class="text-center">操作</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
				<tag:page page="${page}"></tag:page>
			</div>
		</div>
	</div>
	<%@include file="/WEB-INF/views/footer/footer.jsp"%>
	<script>
		$(function() {
			//Ajax局部渲染
			$("#searchForm").submit(function(e) {
				e.preventDefault();
				$.post("listjson", $("#searchForm").serialize(), function(r) {
					if (r.code == null) {
						window.top.location.reload(); //Session失效
					} else if (r.code < 0) {
						alertMsg(r.info);
					} else {
						renderTable(r);
					}
				});
			});

			//请求员工列表的数据的ajax
			$.ajax({
				type : "GET",
				url : "${ctx}/employee/listJson?pageNum=1",
				success : function(result) {
					renderTable(result.data);
					console.log(result.data.list);
				}

			})

		});
		//处理表格的方法,格式化一行
		var formatOneRow = function(i, row) {
			return "<tr><td class='text-center'>" + i + "</td>"
					+ "<td class='text-center'><a emp-id=" + row.empId
					+ " onclick='detail(this)'>" + row.empName + "</a></td>"
					+ "<td class='text-center'>" + row.empTel + "</td>"
					+ "<td class='text-center'>" + formatGender(row.empGender)
					+ "</td>" + "<td class='text-center'>" + row.empEmail
					+ "</td>" + "<td class='text-center'>"
					+ row.department.deptName + "</td>"
					+ "<td class='text-center'><a empId=" + row.empId
					+ " onclick='deletEmp(this)'>删除</a>" + "</td>" + "</tr>"

		}
		//格式化性别的方法
		var formatGender = function(gender) {
			switch (gender) {
			case 0:
				return "女";
				break;
			case 1:
				return "男";
				break;
			default:
				return "";
			}
		}
		//渲染表格和分页控件
		//need r.page, r.total, r.data
		var renderTable = function(r) {
			//renderPage(r);
			//var pageSize = $('#pageSize').val();
			//var offset = pageSize * (r.page - 1) + 1;
			var tbody = $("#empTable tbody");
			tbody.html("");
			for (var i = 0; i < r.list.length; i++) {
				tbody.append(formatOneRow(i, r.list[i]));
			}
		}
		//新增员工
		var createEmp = function() {
			open("新增员工", "${ctx}/employee/createEempView.do", [ '900px',
					'600px' ], function(index, layero) {

			});
		}
		//删除员工
		var deletEmp = function(that) {
			var empId = $(that).attr("empId");
			$.ajax({
				type : "GET",
				url : "${ctx}/employee/delet?empId=" + empId,
				success : function(result) {
					if (result.code == 0) {
						alert("删除成功！！");
					} else {
						alert(result.info);
					}
				}
			})
		}
		//查看员工
		var detail = function(that) {
			var empId=$(that).attr("emp-id");
			open("查看员工", 
					"${ctx}/employee/detail.do?empId="+empId, 
					[ '900px','600px' ], 
					function(index, layero) {
						//这里面写点击确定后的回调方法
						var body = top.layer.getChildFrame('body', index);
						var iframeWin = top[layero.find('iframe')[0]['name']];
						$.ajax({
							type:"POST",
							url:"${ctx}/employee/updateOne",
							data:body.find("#singleEmp").serialize(),
							success:function(result){
								alert("修改员工信息成功");
							}
							
						});
						
					});
		}
	</script>

</body>
</html>