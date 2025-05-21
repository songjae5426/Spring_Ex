package com.songjae.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.ex.mybatis.domain.Review;
import com.songjae.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepository reviewRepository;
	
	// 전달받은 id와 일칠하는 리뷰 정보 얻어오기
	public Review getReview(int id) {
		// new_Review테이블에서 전달받은 id가 일치하는 행 조회
		return reviewRepository.selectReivew(id);
	}
}
