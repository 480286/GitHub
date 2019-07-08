package com.mypack.entity;

public class GoodsDetail {

	int quality;					//商品质量
	String color;					//....颜色
	String source;					//....产地
	String type;					//....类型
	String gdImgPath;				//....图片路径
	int g_Id;
	public GoodsDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsDetail(int quality, String color, String source, String type, String gdImgPath, int g_Id) {
		super();
		this.quality = quality;
		this.color = color;
		this.source = source;
		this.type = type;
		this.gdImgPath = gdImgPath;
		this.g_Id = g_Id;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGdImgPath() {
		return gdImgPath;
	}
	public void setGdImgPath(String gdImgPath) {
		this.gdImgPath = gdImgPath;
	}
	public int getG_Id() {
		return g_Id;
	}
	public void setG_Id(int g_Id) {
		this.g_Id = g_Id;
	}
	@Override
	public String toString() {
		return "GoodsDetail [quality=" + quality + ", color=" + color + ", source=" + source + ", type=" + type
				+ ", gdImgPath=" + gdImgPath + ", g_Id=" + g_Id + "]";
	}
	
	
	
}
