package com.songjae.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import com.songjae.spring.ex.SpringExampleApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {

    private final SpringExampleApplication springExampleApplication;

    Ex01Controller(SpringExampleApplication springExampleApplication) {
        this.springExampleApplication = springExampleApplication;
    }
	// 간단한 html을 response에 담는 페이지
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/1")
	public String htmlResponse(){
		return ""
				+"<html>\n"
				+"	<head><title>Spring</title></head>\n"
				+ "	<body>\n"
				+ "		<h2>Spring html response</h2>\n"
				+ "	</body>\n"
				+ "</html>";
	}
	
	// 맵을 response에 담는 페이지 => 객체이기 때문에 json으로 변환되어 응답된다
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	public Map<String, Integer> mapResponse() {
		// 과일이름 : 가격
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("apple", 1500);
		fruitMap.put("banana", 4500);
		fruitMap.put("orange", 1300);
		
		return fruitMap;
	}
	
	
	
	
	
}
