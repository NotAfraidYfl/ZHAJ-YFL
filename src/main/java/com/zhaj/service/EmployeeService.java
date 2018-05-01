package com.zhaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaj.bean.Employee;
import com.zhaj.bean.EmployeeExample;
import com.zhaj.dao.EmployeeMapper;

@Service
public class EmployeeService {

	// 调用service要注入Dao
	@Autowired
	EmployeeMapper employeeMapper;
	/**
	 * 查询所有员工 控制器调用service层
	 * 
	 * @return
	 */
	public List<Employee> getAll(EmployeeExample employeeExample) {
		// 查询带部门的信息 查询所有(不带条件)
		return employeeMapper.selectByExampleWithDept(employeeExample);
	}
	
	/*public List<Employee> getAll(Employee emp){
		return employeeMapper.selectByExampleWithDept(emp);
	}*/

	/**
	 * 删除单个员工
	 * 
	 * @param id
	 */
	public void deletEmp(String empId) {
		employeeMapper.deleteByPrimaryKey(empId);
	}

	/**
	 * 新增单个员工
	 */
	public void insertEmp(Employee employee) {
		employeeMapper.insertSelective(employee);
	}
	

	/**
	 * 查看单个员工
	 * @param empId
	 * @return
	 */
	public Employee selectOneEmp(String empId) {
		return employeeMapper.selectByPrimaryKey(empId);
	}

	/**
	 * 修改单个员工
	 * @param emp
	 */
	public void updateOne(Employee emp) {
		employeeMapper.updateByPrimaryKeySelective(emp);
	}

}
