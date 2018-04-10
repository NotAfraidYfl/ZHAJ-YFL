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
							<label class="text-right">所属部门：</label> <input name="name"
								type="text" class=" form-control" placeholder="请输入公司名称"
								value="${company.name}">
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
		function formatOneRow(i, row) {
			return "<tr><td class='text-center'>" + i + "</td>"
					+ "<td class='text-center'>" + row.empName + "</td>"
					+ "<td class='text-center'>" + formatGender(row.empGender)
					+ "</td>" + "<td class='text-center'>" + row.empEmail
					+ "</td>" + "<td class='text-center'>" + row.deptName
					+ "</td>" + "<td class='text-center'><a empId=" + row.empId
					+ " onclick='deletEmp(this)'>删除</a>" + "</td>" + "</tr>"

		}
		//格式化性别的方法
		function formatGender(gender) {
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
		function renderTable(r) {
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
		function createEmp() {
			open("新增员工", "#", [ '900px', '600px' ], function(index, layero) {

			});
		}
		//删除员工
		function deletEmp(that) {
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
	</script>

</body>
</html>