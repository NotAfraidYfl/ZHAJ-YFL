package com.zhaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaj.bean.Employee;
import com.zhaj.bean.House;
import com.zhaj.service.HouseService;
import com.zhaj.utils.JsonModel;
import com.zhaj.utils.PageModel;

@Controller
@RequestMapping("house")
public class HouseController {
	@Autowired
	HouseService houseService;

	/**
	 * �����б���ת
	 * @return
	 */
	@RequestMapping("/houList")
	public String goToHouseManage() {
		return "HouseViews/houseList";
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
		List<House> emps = houseService.getAll();
		// ��ѯ���֮��ʹ��pageInfo�����ݽ��а�װ,ֻ��Ҫ��Pageinfo����ҳ��
		// pageInfo�оͰ�����������Ҫ�ķ�ҳ����Ϣ�����ҿ��Դ�����Ҫ������ʾ��ҳ��
		PageInfo page = new PageInfo(emps);
		jsonModel.setData(page);
		jsonModel.setTotal((int) page.getTotal());
		jsonModel.setPage(page.getPageNum());
		return jsonModel;
	}
	
	/**
	 * ������Դ
	 * @param emp
	 * @return
	 */
	@RequestMapping("createHouseView")
	public String createEmpView() {
		return "HouseViews/houseEditAndAdd";
	}

	public JsonModel createEmp(Employee emp) {
		JsonModel jsonModel = new JsonModel();
		if (StringUtils.isEmpty(emp)) {
			jsonModel.setCode(-1);
			jsonModel.setInfo("Ա��������Ϊ�գ�");
		} else {
			try {
				jsonModel.setInfo("�����ɹ���");
				jsonModel.setCode(0);
			} catch (Exception e) {
				jsonModel.setCode(-1);
				jsonModel.setInfo("�����쳣��������룡��");
			}
		}
		return jsonModel;
	}
	
	

}
