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
 * 使用Spring测试模块提供的测试请求功能，测试分页以及CRUD的正确性
 * Spring4测试的时候，需要servlet3.0
 * @author fulin.Yu
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class MvcTest {
	// 传入springMvc的Ioc容器
	@Autowired
	WebApplicationContext context;
	// mocMVC虚拟的MVC请求，获取到处理结果
	MockMvc mocMvc;

	// 每次使用之前都要初始化一下
	@Before
	public void initMocMvc() {
		mocMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void testPage() throws Exception {
		// perform模拟发送请求,并且拿到返回值
		MvcResult andReturn = mocMvc.perform(MockMvcRequestBuilders.get("/empList").param("pageNum", "2")).andReturn();
		// 请求成功之后，请求域中会有pageInfo,我们可以取出Pageinfo进行验证
		MockHttpServletRequest requst = andReturn.getRequest();
		PageInfo pi = (PageInfo) requst.getAttribute("pageInfo");
		System.out.println("当前页数：" + pi.getPageNum());
		System.out.println("总的页码：" + pi.getPages());
		System.out.println("总的记录数：" + pi.getTotal());
		System.out.println("在页面需要连续显示的页码");
		int[] nums = pi.getNavigatepageNums();
		for (int i : nums) {
			System.out.println(" " + i);
		}
		// 获取员工数据
		List<Employee> list = pi.getList();
		for (Employee employee : list) {
			System.out.println("ID:" + employee.getEmpId() + "+++++" + "姓名：" + employee.getEmpName());

		}
	}

}
