package com.zhaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaj.bean.House;
import com.zhaj.bean.LoginUser;
import com.zhaj.service.HouseService;
import com.zhaj.service.LoginAndRegistService;
import com.zhaj.utils.JsonModel;
import com.zhaj.utils.PageModel;
import com.zhaj.utils.Utils;

@Controller
@RequestMapping("house")
public class HouseController {
	@Autowired
	HouseService houseService;
	@Autowired
	LoginAndRegistService lrService;

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
	public JsonModel getHouseWithJson(PageModel pageModel,House hou) {
		JsonModel jsonModel = new JsonModel();
		// ��ǰ��ѯ����һ����ҳ��ѯ �������е�����
		// ����pagehelper��ҳ���
		// �ڲ�ѯ֮ǰֻ��Ҫ����,����ҳ���Լ�ÿҳ��ʾ������
		PageHelper.startPage(pageModel);
		// startPage��������Ĳ�ѯ����һ����ҳ�Ĳ�ѯ
		List<House> houses = houseService.getAll(hou);
		// ��ѯ���֮��ʹ��pageInfo�����ݽ��а�װ,ֻ��Ҫ��Pageinfo����ҳ��
		// pageInfo�оͰ�����������Ҫ�ķ�ҳ����Ϣ�����ҿ��Դ�����Ҫ������ʾ��ҳ��
		PageInfo page = new PageInfo(houses);
		jsonModel.setData(page);
		jsonModel.setTotal((int) page.getTotal());
		jsonModel.setPage(page.getPageNum());
		return jsonModel;
	}

	/**
	 * ������Դ
	 * 
	 * @param emp
	 * @return
	 */
	@RequestMapping("/createHouseView")
	public String createEmpView(Model model) {
		try {
			List<LoginUser> loginUser =lrService.getAll();
			model.addAttribute("owners",loginUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "HouseViews/houseEditAndAdd";
	}

	@RequestMapping("/createHouse")
	@ResponseBody
	public JsonModel createEmp(House hou) {
		JsonModel jsonModel = new JsonModel();
		if (StringUtils.isEmpty(hou)) {
			jsonModel.setCode(-1);
			jsonModel.setInfo("��Դ��Ϣ����Ϊ�գ�");
		} else {
			try {
				hou.setHousesId(Utils.uuid());
				houseService.insertOneHouse(hou);
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
