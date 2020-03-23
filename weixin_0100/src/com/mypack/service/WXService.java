package com.mypack.service;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletInputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.mypack.entity.BaseMessage;
import com.mypack.entity.TextMessage;
import com.thoughtworks.xstream.XStream;

public class WXService {

	private static final String TOKEN = "abc";

	public static boolean check(String timestamp, String nonce, String signature) {
		//将timestamp, nonce, TOKEN三个参数进行字典排序
		String[] strs = new String[] {timestamp, nonce, TOKEN};
		Arrays.sort(strs);
		//将三个参数拼成一个字符串并加密
		String str = strs[0]+strs[1]+strs[2];
		String mysig = sha1(str);
		System.out.println(signature);
		System.out.println(mysig);
		return true;
	}
	//sha1加密
	private static String sha1(String str) {
		try {
			// 获取一个加密对象
			MessageDigest md = MessageDigest.getInstance("sha1");
			//加密
			byte[] digest = md.digest(str.getBytes());
			//处理加密结构并遍历
			char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
			StringBuilder sb = new StringBuilder();
			for (byte b:digest) {
				//处理高四位
                sb.append(chars[(b>>4)&15]);
                //处理低四位
                sb.append(chars[b&15]);
			}
			return sb.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 接收消息
	 * @param inputStream
	 * @return
	 */
	public static Map<String, String> parseRequest(ServletInputStream is) {
		Map<String ,String> map = new HashMap<>();
		//获取一个SAXReader对象
		SAXReader reader = new SAXReader();
		try {
			//读取输入流获取文档对象
			Document document = reader.read(is);
			//获取对象的根节点
			Element root = document.getRootElement();
			//获取子节点
			List<Element> lst = root.elements();
			for (Element e : lst) {
				map.put(e.getName(), e.getStringValue());
			}
			return map;
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 处理不同消息类型的事件和回复
	 * @param requestMap
	 * @return
	 */
	public static String getResponse(Map<String, String> requestMap) {
		BaseMessage message;
		String msgType = requestMap.get("msgType");
		switch (msgType) {
		case "text": 
			message = dealTextMessage(requestMap);
			break;

		default:
			break;
		}
		return beanToXml(message);
	}
	
	/**
	 * //获取XStream对象，将Java对象转换为xml数据包
	 * @param message
	 * @return
	 */
	private String beanToXml(BaseMessage message) {
		String xml;
		XStream xs = new XStream();	
		//xs.processAnnotations(TextMessage.class);
		xml = xs.toXML(message);
		System.out.println(xml);
		return null;
	}
	private static BaseMessage dealTextMessage(Map<String, String> requestMap) {
		TextMessage message = new TextMessage(requestMap, "helloworld！");
		return message;
	}
	
	
}
