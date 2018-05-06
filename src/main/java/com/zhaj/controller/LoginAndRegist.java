package com.zhaj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaj.bean.LoginUser;
import com.zhaj.bean.LoginUserKey;
import com.zhaj.service.LoginAndRegistService;
import com.zhaj.utils.JsonModel;
import com.zhaj.utils.Utils;

@Controller
@RequestMapping("loginAndRegist")
public class LoginAndRegist {
	@Autowired
	LoginAndRegistService loginAndRegistService;
	
	/**
	 * 注册接口
	 * @param loginUser
	 * @return
	 */
	@RequestMapping("regeist")
	@ResponseBody
	public JsonModel registration(LoginUser loginUser) {
		JsonModel jsonModel=new JsonModel();
		try {
			loginUser.setUserId(Utils.uuid());
			int result= loginAndRegistService.insertUser(loginUser);
			jsonModel.setCode(0);
			jsonModel.setInfo("操作成功");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			jsonModel.setCode(-1);
			jsonModel.setInfo("操作失败");
		}
		return jsonModel;
	}
	
	@RequestMapping("login")
	public JsonModel login(LoginUserKey loginUserKey){
		JsonModel jsonModel = new JsonModel();
		try {
			int result = loginAndRegistService.login(loginUserKey.getUserName());
			jsonModel.setCode(0);
			jsonModel.setInfo("操作成功");
			
		} catch (Exception e) {
			e.printStackTrace();
			jsonModel.setCode(-1);
			jsonModel.setInfo("操作失败");
		}
		return jsonModel;
		
	}
}
