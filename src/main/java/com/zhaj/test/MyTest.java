package com.zhaj.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhaj.bean.Employee;
import com.zhaj.dao.DepartmentMapper;
import com.zhaj.dao.EmployeeMapper;
import com.zhaj.service.EmployeeService;

public class MyTest {
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	static EmployeeService employeeService;
	// 注入一个批量的sqlsession
	@Autowired
	static SqlSession sqlSession;

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getTel());
		}
	}

	/**
	 * 返回手机号码
	 */
	private static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153,180,177"
			.split(",");

	private static String getTel() {
		int i = (int) (Math.random() * 20);
		int index1 = (int) (Math.random() * 9000) + 1000;
		int index2 = (int) (Math.random() * 9000) + 1000;
		String first = telFirst[i];
		String second = String.valueOf(index1);
		String thrid = String.valueOf(index2);
		return first + second + thrid;
	}

}
