package com.zhaj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaj.bean.LoginUser;
import com.zhaj.service.LoginAndRegistService;
import com.zhaj.utils.JsonModel;
import com.zhaj.utils.Utils;

@Controller
@RequestMapping("loginAndRegist")
public class LoginAndRegist {
	@Autowired
	LoginAndRegistService loginAndRegistService;

	/**
	 * ע��ӿ�
	 * 
	 * @param loginUser
	 * @return
	 */
	@RequestMapping("regeist")
	@ResponseBody
	public JsonModel registration(LoginUser loginUser) {
		JsonModel jsonModel = new JsonModel();
		try {
			loginUser.setUserId(Utils.uuid());
			int result = loginAndRegistService.insertUser(loginUser);
			jsonModel.setCode(0);
			jsonModel.setInfo("�����ɹ�");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			jsonModel.setCode(-1);
			jsonModel.setInfo("����ʧ��");
		}
		return jsonModel;
	}

	@RequestMapping("login")
	public String login(LoginUser loginUserParam, HttpServletRequest request) {
		try {
			if (loginUserParam != null && loginUserParam.getUserName() != ""
					&& loginUserParam.getUserPassword() != "") {
				// ��ѯ�����û���������Ϣ�ŵ�LoginUser������
				LoginUser loginUser = loginAndRegistService.login(loginUserParam.getUserName());
				// case1:���
				if (loginUser == null || "".equals(loginUser)) {
				} else {
					if (loginUser.getUserPassword().equals(loginUserParam.getUserPassword())) {
						HttpSession session = request.getSession();
						session.setAttribute("loginUser", loginUser);
						System.out.println("�˺ź˶Գɹ�");
					}
				}
			} else {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/home/index";

	}
}
