package com.zhaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaj.bean.Employee;
import com.zhaj.bean.EmployeeExample;
import com.zhaj.dao.EmployeeMapper;

@Service
public class EmployeeService {

	// ����serviceҪע��Dao
	@Autowired
	EmployeeMapper employeeMapper;
	/**
	 * ��ѯ����Ա�� ����������service��
	 * 
	 * @return
	 */
	public List<Employee> getAll(EmployeeExample employeeExample) {
		// ��ѯ�����ŵ���Ϣ ��ѯ����(��������)
		return employeeMapper.selectByExampleWithDept(employeeExample);
	}
	
	/*public List<Employee> getAll(Employee emp){
		return employeeMapper.selectByExampleWithDept(emp);
	}*/

	/**
	 * ɾ������Ա��
	 * 
	 * @param id
	 */
	public void deletEmp(String empId) {
		employeeMapper.deleteByPrimaryKey(empId);
	}

	/**
	 * ��������Ա��
	 */
	public void insertEmp(Employee employee) {
		employeeMapper.insertSelective(employee);
	}
	

	/**
	 * �鿴����Ա��
	 * @param empId
	 * @return
	 */
	public Employee selectOneEmp(String empId) {
		return employeeMapper.selectByPrimaryKey(empId);
	}

	/**
	 * �޸ĵ���Ա��
	 * @param emp
	 */
	public void updateOne(Employee emp) {
		employeeMapper.updateByPrimaryKeySelective(emp);
	}

}
