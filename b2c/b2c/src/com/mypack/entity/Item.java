package com.mypack.entity;

public class Item {

	int itemId;
	Goods good;
	int nums;
	User user;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, Goods good, int nums, User user) {
		super();
		this.itemId = itemId;
		this.good = good;
		this.nums = nums;
		this.user = user;
	}
	
	public Item(Goods good, int nums, User user) {
		super();
		this.good = good;
		this.nums = nums;
		this.user = user;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
