package com.zhaj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LonginController {
	// ��½ҳ����ת
	@RequestMapping("login")
	public String getLogin() {
		return "HomePageViews/login";
	}

}
