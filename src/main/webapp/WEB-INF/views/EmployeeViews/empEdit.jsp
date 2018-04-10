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
	<div class="main-container" id="main-container">
		<div class="main-container-inner">
			<div class="main-content">
				<div class="page-content">
					<div class="row noScroll">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<form id="createLetter" class="" action="${ctx}/notice/save.do">
								<div class="row form-content">
									<!-- 传类别category 1函件 2公告 -->
									<input type="hidden" name="category" value="1">
									<div class="space-4"></div>
									<div class="form-group col-xs-12">
										<label class="col-sm-2 control-label text-right" for=""><span
											class="">*</span><span>函件标题：</span></label>
										<div class="col-sm-10 valid_cow">
											<span class="col-xs-11 block input-icon input-icon-right"
												style="width: 96.7%;"> <input type="text" id=""
												name="title" value="" class="form-control">
											</span>
										</div>
									</div>
									<div class="space-4"></div>
									<div class="space-4"></div>
									<div class="form-group col-xs-6">
										<label class="col-sm-4 control-label text-right" for=""><span
											class="">*</span><span>所属项目：</span></label>
										<div class="col-sm-8 valid_cow">
											<span class="col-xs-11 block input-icon input-icon-right">
												<select class="form-control" name="projectName">
													<option value="${project.proName}" id="projectName">${project.proName}</option>
											</select> <input type="hidden" name="projectId" value="${project.id}"
												id="projectId" />
											</span>
										</div>
									</div>
									<div class="form-group col-xs-6">
										<label class="col-sm-4 control-label text-right" for=""><span
											class="">*</span><span>函件类型：</span></label>
										<div class="col-sm-8 valid_cow">
											<span class="col-xs-11 block input-icon input-icon-right">
												<select class="form-control" name="type" id="typeSelect">
													<c:forEach var="item" items="${letterTypes}">
														<option value="${item.codeName}" typeId="${item.tableKey}">${item.codeName}</option>
													</c:forEach>
											</select> <input type="hidden" name="typeId" value="" id="typeId" />
											</span>
										</div>
									</div>
									<div class="space-4"></div>
									<div class="form-group col-xs-6">
										<label class="col-sm-4 control-label text-right"><span
											class="">*</span><span>发起单位：</span></label>
										<div class="col-sm-8 valid_cow">
											<span class="col-xs-11 block input-icon input-icon-right">
												<select class="form-control" name="wbCompanyName">
													<option value="${sessionScope.companyName}">${sessionScope.companyName}</option>
											</select> <input type="hidden" name="wbCompanyId"
												value="${sessionScope.companyid}" />
											</span>
										</div>
									</div>
									<div class="space-4"></div>
									<div class="form-group col-xs-6">
										<label class="col-sm-4 control-label text-right" for=""><span
											class="">*</span><span>发起人：</span></label>
										<div class="col-sm-8 valid_cow">
											<span class="col-xs-11 block input-icon input-icon-right">
												<input type="text" id="sponsorId" name="sponsorName"
												value="${sessionScope.user.userKname}" autocomplete="off"
												class="form-control"> <!-- 发起人ID --> <input
												type="hidden" name="sponsorId"
												value="${sessionScope.user.staffId}" />
											</span>
										</div>
									</div>
									<div class="space-4 "></div>
									<div class="form-group col-xs-6">
										<label class="col-sm-4 control-label text-right" for=""><span
											class="">*</span><span>发送单位：</span></label>
										<div class="col-sm-8 valid_cow">
											<span class="col-xs-11 block input-icon input-icon-right">
												<select class="form-control" name="receiveCompanyName">
													<option value="${receiveCompany.name}">${receiveCompany.name}</option>
											</select> <input type="hidden" name="receiveCompanyId"
												value="${receiveCompany.id}" />
											</span>
										</div>
									</div>
									<div class="space-4 "></div>
									<div class="form-group col-xs-6">
										<label class="col-sm-4 control-label text-right"><span
											class="">*</span><span>收函人:</span></label>
										<div class="col-sm-8 valid_cow">
											<span class="col-xs-11 block input-icon input-icon-right">
												<input type="text" readonly="readonly" id="reciver"
												name="reciver" value="" autocomplete="off"
												class="form-control"> <input type="hidden"
												name="receiversStr" id="reciverHide" value="" /> <span
												class="col-xs-11 block input-icon input-icon-right"
												style="position: absolute; top: 10px; right: -200px;">
													<a class="icon-append col col-2" id="selectOrg"
													href="javascript:void(0)" onclick="$('#reciver').click();"><i
														class="fa fa-sitemap" style="color: #1AA094"></i></a>
											</span>
											</span>
										</div>
									</div>
									<div class="space-4 "></div>
									<div class="form-group col-xs-12">
										<label class="col-sm-2 control-label text-right"><span
											class=""></span><span>函件内容：</span></label>
										<div class="col-sm-10">
											<div id="editor" style="width: 95.3%;">
												<div id='edit'></div>
											</div>
											<!-- 存函件内容的隐藏输入框 -->
											<input type="hidden" name="content" id="content" value="" />
										</div>
									</div>
									<div class="space-4 "></div>
									<div class="form-group col-xs-6 btn-group"
										style="margin-top: 10px; margin-bottom: 10px;">
										<label class="col-sm-4 control-label text-right"><span
											class="">*</span><span>添加附件：</span></label>
										<div class="col-sm-8 ">
											<div class="col-xs-11">
												<ul id="ulUPfile">
												</ul>
											</div>
										</div>
										<div class="col-sm-4"></div>
										<div class="col-sm-8">
											<button type="button" class="btn" id="upimgBtn"
												onclick="upimg()">上传</button>
										</div>

									</div>

								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
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
		});
	</script>

</body>
</html>