package com.mypack.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.service.WXService;

@WebServlet("/WXServlet")
public class WXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 
			signature	微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
			timestamp	时间戳
			nonce	随机数
			echostr	随机字符串
			
		 */
		
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		//验证签名
		if(WXService.check(timestamp, nonce, signature)) {
			//把echostr	随机字符串返回给微信服务器
			// 注意 PrintWriter out = response.getWriter(); 指输出的对象是个命令提示符窗口
			PrintWriter out = response.getWriter();
			out.print(echostr);
			out.flush();
			out.close();
			System.out.println("接入成功");
		} else {
			System.out.println("接入失败");
		}
		
	}


	/**
	 * 接收消息和事件推送
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* <xml>
  		   		<ToUserName><![CDATA[toUser]]></ToUserName>
  				<FromUserName><![CDATA[fromUser]]></FromUserName>
  				<CreateTime>1348831860</CreateTime>
  				<MsgType><![CDATA[text]]></MsgType>
  				<Content><![CDATA[this is a test]]></Content>
  				<MsgId>1234567890123456</MsgId>
		   </xml>

			ServletInputStream is = request.getInputStream();
			byte[] b = new byte[1000];
			int len;
			StringBuilder sb = new StringBuilder();
			while((len=is.read(b))!=-1) {
				sb.append(new String(b ,0 ,len));
			}
			System.out.println(sb.toString());
		 */;
		//接收消息 
		Map<String ,String> requestMap = WXService.parseRequest(request.getInputStream());
		
		//回复消息
		String respXml = WXService.getResponse(requestMap);
		
		PrintWriter out = response.getWriter();
		out.print(respXml);
		out.flush();
		out.close();
	}

}
