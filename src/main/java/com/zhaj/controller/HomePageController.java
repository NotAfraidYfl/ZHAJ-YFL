package com.zhaj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomePageController {

	@RequestMapping("/index")
	public String getHomePage() {
		return "/HomePageViews/homeIndex";
	}
}
