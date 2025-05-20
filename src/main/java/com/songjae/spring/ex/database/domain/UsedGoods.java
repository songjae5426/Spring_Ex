package com.songjae.spring.ex.database.domain;

import java.time.LocalDateTime;

// 특정 테이블의 한행의 모든 정보를 저장하기위한 클래스 정의
// Entity클래스 또는 Domain클래스라고한다
public class UsedGoods {
	private int id;
	private int sellerId;
	private String title;
	private int pricce;
	private String description;
	private String image;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPricce() {
		return pricce;
	}
	public void setPricce(int pricce) {
		this.pricce = pricce;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
