package com.zhaj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController {
	// ��½ҳ����ת
		@RequestMapping("test")
		public String getLogin() {
			return "test/test";
		}

}
