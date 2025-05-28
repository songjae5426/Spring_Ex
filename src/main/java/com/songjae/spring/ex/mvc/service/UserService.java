package com.songjae.spring.ex.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.ex.mvc.domain.User;
import com.songjae.spring.ex.mvc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// 가장 최근에 등록한 사용자 정보 얻어오기
	public User getLastUser() {
		return userRepository.selectLastUser();
	}
	
	// 이름, 생일, 이메일, 자기소개를 입력 받아서 db에 저장
	public int addUser(User user) {
		return userRepository.insertUser(user);
	}
	
	
}
