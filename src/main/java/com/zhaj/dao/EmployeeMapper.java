package com.zhaj.dao;

import com.zhaj.bean.Employee;
import com.zhaj.bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
	long countByExample(EmployeeExample example);

	int deleteByExample(EmployeeExample example);

	int deleteByPrimaryKey(String empId);

	int insert(Employee record);

	int insertSelective(Employee record);

	List<Employee> selectByExample(EmployeeExample example);

	Employee selectByPrimaryKey(String empId);

	// 带部门的条件查询
	List<Employee> selectByExampleWithDept(EmployeeExample example);

	// 条件查询
	List<Employee> selectEmpByFields(Employee record);

	Employee selectByPrimaryKeyWithDept(String empId);

	int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

	int updateByPrimaryKeySelective(Employee record);

	int updateByPrimaryKey(Employee record);

}