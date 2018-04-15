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
	 * Ա���б�ҳ����ת
	 * 
	 * @return
	 */
	@RequestMapping("empList")
	public String getEmps() {
		return "EmployeeViews/employeesList";
	}

	/**
	 * ����Ա���б���json����
	 * 
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/listJson")
	@ResponseBody
	public JsonModel getEmpWithJson(PageModel pageModel) {
		JsonModel jsonModel = new JsonModel();
		// ��ǰ��ѯ����һ����ҳ��ѯ �������е�����
		// ����pagehelper��ҳ���
		// �ڲ�ѯ֮ǰֻ��Ҫ����,����ҳ���Լ�ÿҳ��ʾ������
		PageHelper.startPage(pageModel);
		// startPage��������Ĳ�ѯ����һ����ҳ�Ĳ�ѯ
		List<Employee> emps = employeeService.getAll();
		// ��ѯ���֮��ʹ��pageInfo�����ݽ��а�װ,ֻ��Ҫ��Pageinfo����ҳ��
		// pageInfo�оͰ�����������Ҫ�ķ�ҳ����Ϣ�����ҿ��Դ�����Ҫ������ʾ��ҳ��
		PageInfo page = new PageInfo(emps);
		jsonModel.setData(page);
		jsonModel.setTotal((int) page.getTotal());
		jsonModel.setPage(page.getPageNum());
		return jsonModel;
	}

	/**
	 * ɾ������Ա���ķ���
	 */
	@RequestMapping("/delet")
	@ResponseBody
	public JsonModel deletEmp(@RequestParam String empId) {
		JsonModel jsonModel = new JsonModel();
		if (empId.isEmpty() || empId == null) {
			jsonModel.setCode(-1);
			jsonModel.setInfo("Ա��ID����Ϊ�գ���");
		} else {
			try {
				employeeService.deletEmp(empId);
				jsonModel.setCode(0);
			} catch (Exception e) {
				jsonModel.setCode(-1);
				jsonModel.setInfo("�����쳣��������룡��");
			}
		}
		return jsonModel;
	}
	/**
	 * ��������Ա��
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
			jsonModel.setInfo("Ա��������Ϊ�գ�");
		} else {
			try {
				employeeService.insertEmp(emp);
				jsonModel.setInfo("�����ɹ���");
				jsonModel.setCode(0);
			} catch (Exception e) {
				jsonModel.setCode(-1);
				jsonModel.setInfo("�����쳣��������룡��");
			}
		}
		return jsonModel;
	}
	
	/**
	 * �޸ĵ���Ա������
	 * @param emp
	 * @return
	 */
	@RequestMapping("editEempView")
	public String editEmp(Employee emp){
		String empId= emp.getdId();
		
		
		return "EmployeeViews/empEditAndEdit";
	}
	
	/**
	 * �鿴����Ա������
	 * @param empId
	 * @return
	 */
	public String viewOfEmp(String empId){
		
		
		return "EmployeeViews/empEditAndEdit";
	}
	
	
	

}
