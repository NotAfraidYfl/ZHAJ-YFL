package com.zhaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaj.bean.Department;
import com.zhaj.service.DepartmentService;
import com.zhaj.utils.JsonModel;
import com.zhaj.utils.PageModel;

@Controller
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	// ����ҳ����ת
	@RequestMapping("departmentList")
	public String getDepartmentList() {
		return "DepartmentViews/departmentList";
	}

	/**
	 * ����Ա���б���json����
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/listJson")
	@ResponseBody
	public JsonModel getDeptWithJson(PageModel pageModel) {
		JsonModel jsonModel = new JsonModel();
		// ��ǰ��ѯ����һ����ҳ��ѯ �������е�����
		// ����pagehelper��ҳ���
		// �ڲ�ѯ֮ǰֻ��Ҫ����,����ҳ���Լ�ÿҳ��ʾ������
		PageHelper.startPage(pageModel);
		// startPage��������Ĳ�ѯ����һ����ҳ�Ĳ�ѯ
		List<Department> depts = departmentService.getAll();
		// ��ѯ���֮��ʹ��pageInfo�����ݽ��а�װ,ֻ��Ҫ��Pageinfo����ҳ��
		// pageInfo�оͰ�����������Ҫ�ķ�ҳ����Ϣ�����ҿ��Դ�����Ҫ������ʾ��ҳ��
		PageInfo page = new PageInfo(depts);
		jsonModel.setData(page);
		jsonModel.setTotal((int) page.getTotal());
		jsonModel.setPage(page.getPageNum());
		System.out.println(depts.toString());
		return jsonModel;
	}

}
