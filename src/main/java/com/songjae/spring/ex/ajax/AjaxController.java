package com.songjae.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@GetMapping("/ajax/ex01")
	public String ex01() {
		return "ajax/ex01";
	}
	
	// response에 데이터가 담기는 페이지
	// API <-> View 
	// API => 응답에 데이터가 담기는 것, View => 응답에 HTML이 담기는것
	// 이름과 생년월일을 전달 받고 이름과 나이를 응답으로 전달한다
	// 응답에 데이터(json)만 포함
	@GetMapping("/ajax/person")
	@ResponseBody
	public Map<String, Object> personInfo(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday) {
		
		// 이런 기능은 서비스에서 해야하지만 간단한예시이므로
		int year = Integer.parseInt(birthday.substring(0, 4)); 	
		int age = 2025 - year + 1;
		
		// {"name":"김인규", "age":32}
		// 이 두개의 값을 넣을려고 클래스를 만드는건 번거롭기 떄문에 Map활용
		// spring에서는 jackson라이브러리가 객체를 json문자열로 변환해준다
		Map<String, Object> personMap = new HashMap<>();
		personMap.put("name", name);
		personMap.put("age", age);
		
		return personMap;
		
		
	}
	
	
}
