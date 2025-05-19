package com.songjae.spring.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/lifecycle/ex02")
	public String thyemleafResponse(){
		// html파일 경로 리턴
		// src/main/resources/templates 생략 가능
		// .html 생략 가능
		return "lifecycle/ex02";
	}
}
