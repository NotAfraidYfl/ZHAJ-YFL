package com.zhaj.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.zhaj.bean.Employee;

/**
 * ʹ��Spring����ģ���ṩ�Ĳ��������ܣ����Է�ҳ�Լ�CRUD����ȷ��
 * Spring4���Ե�ʱ����Ҫservlet3.0
 * @author fulin.Yu
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class MvcTest {
	// ����springMvc��Ioc����
	@Autowired
	WebApplicationContext context;
	// mocMVC�����MVC���󣬻�ȡ��������
	MockMvc mocMvc;

	// ÿ��ʹ��֮ǰ��Ҫ��ʼ��һ��
	@Before
	public void initMocMvc() {
		mocMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void testPage() throws Exception {
		// performģ�ⷢ������,�����õ�����ֵ
		MvcResult andReturn = mocMvc.perform(MockMvcRequestBuilders.get("/empList").param("pageNum", "2")).andReturn();
		// ����ɹ�֮���������л���pageInfo,���ǿ���ȡ��Pageinfo������֤
		MockHttpServletRequest requst = andReturn.getRequest();
		PageInfo pi = (PageInfo) requst.getAttribute("pageInfo");
		System.out.println("��ǰҳ����" + pi.getPageNum());
		System.out.println("�ܵ�ҳ�룺" + pi.getPages());
		System.out.println("�ܵļ�¼����" + pi.getTotal());
		System.out.println("��ҳ����Ҫ������ʾ��ҳ��");
		int[] nums = pi.getNavigatepageNums();
		for (int i : nums) {
			System.out.println(" " + i);
		}
		// ��ȡԱ������
		List<Employee> list = pi.getList();
		for (Employee employee : list) {
			System.out.println("ID:" + employee.getEmpId() + "+++++" + "������" + employee.getEmpName());

		}
	}

}
