package com.zhaj.test;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaj.bean.Department;
import com.zhaj.bean.Employee;
import com.zhaj.dao.DepartmentMapper;
import com.zhaj.dao.EmployeeMapper;
import com.zhaj.utils.Utils;

/**
 * 测试dao层的工作
 * @author yufulin 2018-3-8
 * 推荐spring的项目使用spring的单元测试，可以注入我们需要的组件
 */

/**
 * 1.导入SpringTest模块 2.@ContextConfiguration指定spring配置文件的位置，帮我们创建IOC容器
 * 3.直接autowired要使用的组件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {
	/*
	 * 测试查询部门信息
	 */
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	// 注入一个批量的sqlsession
	@Autowired
	SqlSession sqlSession;

	/*
	 * @Test public void testCrud() {
	 * 
	 * 原生的spring单元测试 // 1.创建IOC容器 ApplicationContext ioc = new
	 * ClassPathXmlApplicationContext("applicationContext.xml"); //
	 * 2.从容器中获取mapper DepartmentMapper bean =
	 * ioc.getBean(DepartmentMapper.class);
	 * 
	 * System.out.println(departmentMapper); // 1.测试 插入几个部门
	 * 
	 * departmentMapper.insertSelective(new Department(Utils.uuid(),"技术部"));
	 * departmentMapper.insertSelective(new Department(Utils.uuid(),"宣传部"));
	 * 
	 * 
	 * // 2.测试插入员工 // employeeMapper.insertSelective(new Employee(Utils.uuid(),
	 * "Jerry", 0, // "jerry@163.com", "4d524e7d70")); //
	 * 3.批量插入多个员工。批量，使用可以批量插入的sqlsession EmployeeMapper mapper =
	 * sqlSession.getMapper(EmployeeMapper.class); for (int i = 0; i < 500; i++)
	 * { String uName = UUID.randomUUID().toString().substring(0, 5) + i;
	 * mapper.insertSelective( new Employee(Utils.uuid(), uName,
	 * Utils.oneOrZero(), uName + "@163.com", "4d524e7d70")); }
	 * System.out.println("批量插入完成"); System.out.println("测试git"); }
	 */
	@Test
	public void testUpdate() {
		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		List<Employee> emp = mapper.selectByExample(null);
		Employee empList = new Employee();
		for (Employee employee : emp) {
			empList.setEmpId(employee.getEmpId());
			//empList.setEmpTel(Utils.getTel());
			empList.setEmpGender(Utils.oneOrZero());
			System.out.println("ID:" + empList.getEmpId());
			try {
				mapper.updateByPrimaryKeySelective(empList);
			} catch (Exception e) {
				
			}
		}
		

	}
}
