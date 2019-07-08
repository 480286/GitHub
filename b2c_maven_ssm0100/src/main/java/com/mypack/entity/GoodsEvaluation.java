package com.mypack.entity;

public class GoodsEvaluation {

	int evId;
	String imgPathEvLst;						//评价的图片路径
	String comment;								//评价
	int praiseNum;								//称赞数
	public GoodsEvaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsEvaluation(int evId, String imgPathEvLst, String comment, int praiseNum) {
		super();
		this.evId = evId;
		this.imgPathEvLst = imgPathEvLst;
		this.comment = comment;
		this.praiseNum = praiseNum;
	}
	public int getEvId() {
		return evId;
	}
	public void setEvId(int evId) {
		this.evId = evId;
	}
	public String getImgPathEvLst() {
		return imgPathEvLst;
	}
	public void setImgPathEvLst(String imgPathEvLst) {
		this.imgPathEvLst = imgPathEvLst;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(int praiseNum) {
		this.praiseNum = praiseNum;
	}
	@Override
	public String toString() {
		return "GoodsEvaluation [evId=" + evId + ", imgPathEvLst=" + imgPathEvLst + ", comment="
				+ comment + ", praiseNum=" + praiseNum + "]";
	}
	
	
}
