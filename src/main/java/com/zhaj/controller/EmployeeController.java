package com.zhaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaj.bean.Employee;
import com.zhaj.service.EmployeeService;
import com.zhaj.utils.JsonModel;
import com.zhaj.utils.PageModel;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/**
	 * 员工列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping("empList")
	public String getEmps() {
		return "EmployeeViews/employeesList";
	}

	/**
	 * 请求员工列表返回json数据
	 * 
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/listJson")
	@ResponseBody
	public JsonModel getEmpWithJson(PageModel pageModel) {
		JsonModel jsonModel = new JsonModel();
		// 当前查询不是一个分页查询 会查出所有的数据
		// 引入pagehelper分页插件
		// 在查询之前只需要调用,传入页码以及每页显示的条数
		PageHelper.startPage(pageModel);
		// startPage后面紧跟的查询就是一个分页的查询
		List<Employee> emps = employeeService.getAll();
		// 查询完成之后使用pageInfo对数据进行包装,只需要将Pageinfo交给页面
		// pageInfo中就包含我了们需要的分页的信息，并且可以传入需要连续显示的页数
		PageInfo page = new PageInfo(emps);
		jsonModel.setData(page);
		jsonModel.setTotal((int) page.getTotal());
		jsonModel.setPage(page.getPageNum());
		return jsonModel;
	}

	/**
	 * 删除单个员工的方法
	 */
	@RequestMapping("/delet")
	@ResponseBody
	public JsonModel deletEmp(@RequestParam String empId) {
		JsonModel jsonModel = new JsonModel();
		if (empId.isEmpty() || empId == null) {
			jsonModel.setCode(-1);
			jsonModel.setInfo("员工ID不能为空！！");
		} else {
			try {
				employeeService.deletEmp(empId);
				jsonModel.setCode(0);
			} catch (Exception e) {
				jsonModel.setCode(-1);
				jsonModel.setInfo("出现异常，请检查代码！！");
			}
		}
		return jsonModel;
	}
	/**
	 * 新增单个员工
	 * @param emp
	 * @return
	 */
	@RequestMapping("createEempView")
	public String createEmpView(){
		return "EmployeeViews/empEditAndEdit";
	}
	public JsonModel createEmp(Employee emp){
		JsonModel jsonModel=new JsonModel();
		if (StringUtils.isEmpty(emp)) {
			jsonModel.setCode(-1);
			jsonModel.setInfo("员工对象不能为空！");
		} else {
			try {
				employeeService.insertEmp(emp);
				jsonModel.setInfo("新增成功！");
				jsonModel.setCode(0);
			} catch (Exception e) {
				jsonModel.setCode(-1);
				jsonModel.setInfo("出现异常，请检查代码！！");
			}
		}
		return jsonModel;
	}
	
	/**
	 * 修改单个员工数据
	 * @param emp
	 * @return
	 */
	@RequestMapping("editEempView")
	public String editEmp(Employee emp){
		String empId= emp.getdId();
		
		
		return "EmployeeViews/empEditAndEdit";
	}
	
	/**
	 * 查看单个员工数据
	 * @param empId
	 * @return
	 */
	public String viewOfEmp(String empId){
		
		
		return "EmployeeViews/empEditAndEdit";
	}
	
	
	

}
