package com.zhaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaj.bean.Department;
import com.zhaj.service.DepartmentService;
import com.zhaj.utils.JsonModel;
import com.zhaj.utils.PageModel;

@Controller
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	// 部门页面跳转
	@RequestMapping("departmentList")
	public String getDepartmentList() {
		return "DepartmentViews/departmentList";
	}

	/**
	 * 请求员工列表返回json数据
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/listJson")
	@ResponseBody
	public JsonModel getDeptWithJson(PageModel pageModel) {
		JsonModel jsonModel = new JsonModel();
		// 当前查询不是一个分页查询 会查出所有的数据
		// 引入pagehelper分页插件
		// 在查询之前只需要调用,传入页码以及每页显示的条数
		PageHelper.startPage(pageModel);
		// startPage后面紧跟的查询就是一个分页的查询
		List<Department> depts = departmentService.getAll();
		// 查询完成之后使用pageInfo对数据进行包装,只需要将Pageinfo交给页面
		// pageInfo中就包含我了们需要的分页的信息，并且可以传入需要连续显示的页数
		PageInfo page = new PageInfo(depts);
		jsonModel.setData(page);
		jsonModel.setTotal((int) page.getTotal());
		jsonModel.setPage(page.getPageNum());
		System.out.println(depts.toString());
		return jsonModel;
	}

}
