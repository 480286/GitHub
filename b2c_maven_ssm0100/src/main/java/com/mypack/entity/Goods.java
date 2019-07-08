package com.mypack.entity;

public class Goods {

	int gId;									//商品id
	String name;								//商品名称
	int stock;									//库存
	int unitPrice;								//单价
	String imgPath;								//图片路径
	GoodsDetail goodsDetail;					//商品详情
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int gId, String name, int stock, int unitPrice, String imgPath, GoodsDetail goodsDetail
			) {
		super();
		this.gId = gId;
		this.name = name;
		this.stock = stock;
		this.unitPrice = unitPrice;
		this.imgPath = imgPath;
		this.goodsDetail = goodsDetail;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public GoodsDetail getGoodsDetail() {
		return goodsDetail;
	}
	public void setGoodsDetail(GoodsDetail goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	@Override
	public String toString() {
		return "Goods [gId=" + gId + ", name=" + name + ", stock=" + stock + ", unitPrice=" + unitPrice + ", imgPath="
				+ imgPath + ", goodsDetail=" + goodsDetail + "]";
	}
	
	
}
