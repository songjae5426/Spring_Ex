package com.songjae.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.songjae.spring.ex.mvc.domain.User;

// 마이바티스는 쿼리를 xml로 작성하는것
@Mapper	// 마이바티스를 사용할거기 떄문에 @Mapper 어노테이션으로 xml과 연결을 한다
public interface UserRepository {
	public User selectLastUser();

	public int insertUser(User user);

}


