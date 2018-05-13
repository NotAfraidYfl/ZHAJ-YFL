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
	 * 房屋列表跳转
	 * @return
	 */
	@RequestMapping("/houList")
	public String goToHouseManage() {
		return "HouseViews/houseList";
	}

	/**
	 * 请求员工列表返回json数据
	 * 
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/listJson")
	@ResponseBody
	public JsonModel getHouseWithJson(PageModel pageModel,House hou) {
		JsonModel jsonModel = new JsonModel();
		// 当前查询不是一个分页查询 会查出所有的数据
		// 引入pagehelper分页插件
		// 在查询之前只需要调用,传入页码以及每页显示的条数
		PageHelper.startPage(pageModel);
		// startPage后面紧跟的查询就是一个分页的查询
		List<House> houses = houseService.getAll(hou);
		// 查询完成之后使用pageInfo对数据进行包装,只需要将Pageinfo交给页面
		// pageInfo中就包含我了们需要的分页的信息，并且可以传入需要连续显示的页数
		PageInfo page = new PageInfo(houses);
		jsonModel.setData(page);
		jsonModel.setTotal((int) page.getTotal());
		jsonModel.setPage(page.getPageNum());
		return jsonModel;
	}

	/**
	 * 新增房源
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
			jsonModel.setInfo("房源信息不能为空！");
		} else {
			try {
				hou.setHousesId(Utils.uuid());
				houseService.insertOneHouse(hou);
				jsonModel.setInfo("新增成功！");
				jsonModel.setCode(0);
			} catch (Exception e) {
				jsonModel.setCode(-1);
				jsonModel.setInfo("出现异常，请检查代码！！");
			}
		}
		return jsonModel;
	}

}
