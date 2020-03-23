package com.mypack.entity;

import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class TextMessage extends BaseMessage{

	@XStreamAlias("Context")
	private String context;

	public TextMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextMessage(Map<String ,String> requestMap ,String context) {
		super(requestMap);
		//设置消息的类型为文本消息
		this.setMsgType("text");
		this.context = context;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
}
