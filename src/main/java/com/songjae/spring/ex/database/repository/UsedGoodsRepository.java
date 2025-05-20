package com.songjae.spring.ex.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.songjae.spring.ex.database.domain.UsedGoods;

// 데이터 베이스 관련 처리 (query수행)
// Mybatis Framework
@Mapper
public interface UsedGoodsRepository {
	//used_goods모든행 조회
	public List<UsedGoods> selectUsedGoodsList();
}
