package com.songjae.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songjae.spring.ex.mybatis.domain.Review;
import com.songjae.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
	// 전달 받은 id와 일치하는 리뷰 정보를 response에 json으로 담는다
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {	// @RequestParam("id")는 id라는 이름의 request parameter로 넘어온값을 int id변수에 담는다 get으로 요청됨
		// request parmaeter 로 id를 전달 받는다
		
		// 전달받은 id와 일치하는 리뷰 정보 얻어오기
		return reviewService.getReview(id);
	}
}
