package com.mypack.entity;

import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class BaseMessage {

	@XStreamAlias("ToUserName")
	private String toUserName;				//开发者微信号
	@XStreamAlias("FromUserName")
	private String fromUserName;			//发送方帐号（一个OpenID）
	@XStreamAlias("Create")
	private String create;					//消息创建时间 （整型）单位是秒
	@XStreamAlias("MsgType")
	private String msgType;					//消息类型
	public BaseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	//由于前两个参数接收和发送一样，故原样返回，第三个参数是返回的时间单位是秒
	public BaseMessage(Map<String ,String> requestMap) {
		super();
		this.toUserName = requestMap.get("toUserName");
		this.fromUserName = requestMap.get("fromUserName");
		this.create = System.currentTimeMillis()/1000+"";
	}
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public String getCreate() {
		return create;
	}
	public void setCreate(String create) {
		this.create = create;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	
	
	
	
}
