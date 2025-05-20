package com.songjae.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjae.spring.ex.database.domain.UsedGoods;
import com.songjae.spring.ex.database.repository.UsedGoodsRepository;

// 로직(business)담당
// 데이터 가공
// 그외 복잡한 기능 수행
@Service
public class UsedGoodsService {
	
	// 의존성 주입 - DI
	// 객체 생성을 Spring Framework에서 직접 관리
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	
	// 중고 게시글 정보 모두 얻어오기
	public List<UsedGoods> getUserdGoodsList() {
		// used_goods테이블 모든 행 조회
		return usedGoodsRepository.selectUsedGoodsList();
		
	}
}
