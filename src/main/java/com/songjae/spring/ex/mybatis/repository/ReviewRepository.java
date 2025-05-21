package com.songjae.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.songjae.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	// new_rivew 테이블에서 전달받은 id와 일치하는 행 조회
	public Review selectReivew(@Param("id") int id);	// 꼭 @Param하고 매개변수 이름이 같을 필요는 없다, int id값으로 넘어온 값을 xml에서id라는 이름으로 사용한다@Param("xml에서 사용할 이름")
	
}
