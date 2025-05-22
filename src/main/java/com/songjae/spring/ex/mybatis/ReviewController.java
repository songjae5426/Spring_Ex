package com.songjae.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songjae.spring.ex.mybatis.domain.Review;
import com.songjae.spring.ex.mybatis.service.ReviewService;

@Controller
@RequestMapping("/mybatis/review")
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
	// 전달 받은 id와 일치하는 리뷰 정보를 response에 json으로 담는다
	@RequestMapping("")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {	// @RequestParam("id")는 id라는 이름의 request parameter로 넘어온값을 int id변수에 담는다 get으로 요청됨
		// request parmaeter 로 id를 전달 받는다
		
		// 전달받은 id와 일치하는 리뷰 정보 얻어오기
		return reviewService.getReview(id);
	}
	
	// 리뷰를 저장하는 기능
//	@RequestMapping("/create")
//	@ResponseBody
//	public int createReview() {
//		// 4, 치즈피자, 김인규, 4.5, 치즈피자 존맛!
//		return reviewService.setReview(4, "치즈피자", "김인규", 4.5, "치즈피자 존맛!");
//	}
	
	@RequestMapping("/create")
	@ResponseBody
	public int createReview() {
		// 4, 치즈피자, 김인규, 4.5, 치즈피자 존맛!
//		return reviewService.setReview(4, "치즈피자", "김인규", 4.5, "치즈피자 존맛!");
		Review review = new Review();
		review.setId(2);
		review.setMenu("뿌링클");
		review.setUserName("김인규");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리입니다.");
		
		return reviewService.setReview(review);
	}
	
	
	
}
