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
 * ����dao��Ĺ���
 * @author yufulin 2018-3-8
 * �Ƽ�spring����Ŀʹ��spring�ĵ�Ԫ���ԣ�����ע��������Ҫ�����
 */

/**
 * 1.����SpringTestģ�� 2.@ContextConfigurationָ��spring�����ļ���λ�ã������Ǵ���IOC����
 * 3.ֱ��autowiredҪʹ�õ����
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {
	/*
	 * ���Բ�ѯ������Ϣ
	 */
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	// ע��һ��������sqlsession
	@Autowired
	SqlSession sqlSession;

	/*
	 * @Test public void testCrud() {
	 * 
	 * ԭ����spring��Ԫ���� // 1.����IOC���� ApplicationContext ioc = new
	 * ClassPathXmlApplicationContext("applicationContext.xml"); //
	 * 2.�������л�ȡmapper DepartmentMapper bean =
	 * ioc.getBean(DepartmentMapper.class);
	 * 
	 * System.out.println(departmentMapper); // 1.���� ���뼸������
	 * 
	 * departmentMapper.insertSelective(new Department(Utils.uuid(),"������"));
	 * departmentMapper.insertSelective(new Department(Utils.uuid(),"������"));
	 * 
	 * 
	 * // 2.���Բ���Ա�� // employeeMapper.insertSelective(new Employee(Utils.uuid(),
	 * "Jerry", 0, // "jerry@163.com", "4d524e7d70")); //
	 * 3.����������Ա����������ʹ�ÿ������������sqlsession EmployeeMapper mapper =
	 * sqlSession.getMapper(EmployeeMapper.class); for (int i = 0; i < 500; i++)
	 * { String uName = UUID.randomUUID().toString().substring(0, 5) + i;
	 * mapper.insertSelective( new Employee(Utils.uuid(), uName,
	 * Utils.oneOrZero(), uName + "@163.com", "4d524e7d70")); }
	 * System.out.println("�����������"); System.out.println("����git"); }
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
