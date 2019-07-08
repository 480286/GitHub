<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>

<head>

	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

	<title>红色新版仿京东商城模板html源码下载_网页模板_js代码</title>
<meta name="keywords" content="国内网站模板,商城模板,网上商城模板,电子商城模板,购物,电子商务" />
<meta name="description" content="红色新版仿京东商城模板html源码下载，虽然京东首页已经改版，大站仍然有许多直接借鉴的地方，js代码推荐下载。" />

	<link rel="stylesheet" type="text/css" href="css/style.css">

	<link rel="stylesheet" type="text/css" href="css/global.css">

	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>

	<script type="text/javascript" src="js/jsstyle.js"></script>

</head>

<body>

	<div id="top">

		<div id="top_main">

			<ul class="topu">

				<li>

					<div class="xing"></div>

					<a href="">收藏京东</a>

				</li>



				<li class="xuan">
 
					<div class="erwei"></div>

					<a href="" class="aa">关注京东

						<!-- 将二维图添加进a标签里 -->

						<div class="erweitu">
						</div>

					</a>					

				</li>



				<li>

				<div class="didian"></div>

				<strong style="padding-left: 20px">北京</strong><a href="" style="padding-left: 0px">[更换]</a>

				</li>



			</ul>



			<div id="hello">

				<span>您好,欢迎${sessionScope.name }来到京东！
				
					<c:if test="${sessionScope.name }==null">
						<a href="">[登陆]</a><a href="">[免费注册]</a>
					
					</c:if>

					

				</span>

			</div>



			<div class="topright">

				<ul>

					<li>

					<div class="cun">

						<a href="">我的订单</a>

					</div>

						</li>

					<li>

						<div class="cun">

							<div class="vip"></div>

							<a href="">会员俱乐部</a>

						</div>		

					</li>

					<li>

						<div class="cun">

							<div class="bjd"></div>

							<a href="">企业频道</a>

						</div>

					</li>

					<li class="hidetu">

						<div class="cun">

							<a href="" class="dong">手机京东</a>

							<div class="phonetu"></div>

							<div class="downjian11"></div>

						</div>

						<div class="erwei">

							<div class="shoudan"></div>

							<div class="jd"></div>

							<div class="span1">

								<span>京东客户端</span>

							</div>

							<div class="apple"></div>

							<div class="andr"></div>

							<div class="ewtu"></div>

							<div class="span1">

								<span>网银钱包客户端</span>

							</div>

							<div class="apple"></div>

							<div class="andr"></div>

						</div>

					</li>

					<li class="kefu">

						<div class="cun">

							<div class="a1">

								<div class="kefuhide">

									<span>客户服务</span>

									<div class="downjian1"></div>

									<ul>

										<li><a href="">帮助中心</a></li>

										<li><a href="">售后服务</a></li>

										<li><a href="">在线客服</a></li>

										<li><a href="">投诉中心</a></li>

										<li><a href="">客服邮箱</a></li>

									</ul>

								</div>

							</div>	

						</div>

					</li>

					<li class="wangzhan">

						<div class="cun">

							<span>网站导航</span>

							<div class="downjian1"></div>

						</div>

						<div class="wangzhanhide">

							<div class="tese"><span>特色栏目</span></div>

							<div class="tesemain">

								<a href="">京东通信</a>

								<a href="">校园之星</a>

								<a href="">视频购物</a>

								<a href="">京东社区</a>

								<a href="">在线读书</a>

								<a href="">装机大师</a>

								<a href="">京东E卡　</a>

								<a href="">家装城</a>

								<a href="">搭配购　</a>

								<a href="">我喜欢　</a>

								<a href="">游戏社区</a>

							</div>

							<div class="tese"><span>企业服务</span></div>

							<div class="tesemain1">

								<a href="">企业采购</a>

								<a href="">办公直通车</a>

							</div>

							<div class="tese"><span>旗下网站</span></div>

							<div class="tesemain2">

								<a href="">English Site</a>

							</div>

							

						</div>

					</li>

				</ul>

			</div>

		

		</div>

	</div>

<!-- 搜索区域开始 -->

	<div id="serach">

		<div class="logo">

			<img src="images/logo.png" alt="" />

			<div class="dongtu"></div>

		</div>

		<div class="sou">

			<div class="sousuo">

				<input type="text" class="kuang" value="跨界" style="color:#999;font-size:14px" />

				<div class="souzi"><a href="">搜索</a></div>

			</div>

			<div class="reci">

				<span>热门搜索:</span>	

				<a href="" style="color:red">校园之星</a>

				<a href="">影院到家</a>

				<a href="">JD制暖节</a>

				<a href="">腕表领券</a>

				<a href="">自营满减</a>

				<a href="">N3抢购</a>

				<a href="">图书换购</a>

				<a href="">12.12</a>

			</div>

		</div>

		<div class="myjd">

			<div class="mytu"></div>

			<a href="">我的京东</a>

			<div class="jiantou"></div>



			<div class="myjdhide">

				<div class="hello">

					<span>您好，请</span>

					<a href="">登录</a>

				</div>

				<div class="hey">

					<div class="heyleft">

						<ul>

							<li><a href="">待处理订单</a></li>

							<li><a href="">咨询回复</a></li>

							<li><a href="">降价商品</a></li>

							<li><a href="">返修退换货</a></li>

							<li><a href="">优惠券</a></li>

						</ul>

					</div>

					<div class="heyright">

						<ul>

							<li><a href="">我的关注></a></li>

							<li><a href="">我的京豆></a></li>

							<li><a href="">我的理财></a></li>

							<li><a href="">我的白条></a></li>

						</ul>

					</div>

				</div>

				<div class="hidebot">

					<div class="bottop">

						<span>最近浏览的商品:</span>

						<a href="">查看浏览历史></a>

					</div>

					<div class="botdown">

						<span>「暂无数据」</span>

					</div>

				</div>

			</div>

		</div>

		<div class="gouwuche">

			<div class="chetu"></div>

			<a href="ListCartServlet">去购物车结算</a>

			<div class="jianleft"></div>

			<div class="num">

				<div class="numright"></div>

				<div class="numzi"><span>0</span></div>

			</div>

			<div class="hideche">

				<div class="kongche"></div>

				<span>购物车中还没有商品，赶紧选购吧！</span>

			</div>

		</div>

		<div class="jubao"></div>

	</div>

<!-- 搜索区域结束 -->



<!-- 导航条区域开始 -->



<div id="daohang">

	<div class="dhleft">

		<a href="">全部商品分类</a>

		<div class="erjimenu">
			
			<ul>
				
<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!-->
					
						<li class="li1">
				<c:forEach var="menus" items="${lstMenus }">
							<div class="mulu">
	
								<a href="a_list?id=${menus.id }">${menus.valuename1 }</a>&nbsp;&nbsp;
								<a href="a_list?id=${menus.id }">${menus.valuename2 }</a>&nbsp;&nbsp; 
								<a href="a_list?id=${menus.id }">${menus.valuename3 }</a>&nbsp;&nbsp;
								<a href="a_list?id=${menus.id }">${menus.valuename4 }</a>&nbsp;&nbsp;
	
								<div class="jian"></div>
	
								<div class="bai"></div>
	
							</div>
	
				</c:forEach>
							<div class="hidemenu">
	
								<div class="hideleft">
<!-- **************************************************************************************************************************** -->
									<c:forEach var="menu" items="${lstMenu }">
									
										
										
										<dl class="dl1">
												<dt>
													<a href="">${menu.valuename1 }</a>
												</dt>
			
			
			
												<dd>
													<a href="">${menu.valuename2 }</a>
												</dd>
			
												<dd>
													<a href="">${menu.valuename3 }</a>
												</dd>
			
												<dd>
													<a href="">${menu.valuename4 }</a>
												</dd>
			
												<dd>
													<a href="">${menu.valuename5 }</a>
												</dd>
			
												<dd>
													<a href="">${menu.valuename6 }</a>
												</dd>
			
												<dd>
													<a href="">${menu.valuename7 }</a>
												</dd>
			
												<dd>
													<a href="">${menu.valuename8 }</a>
												</dd>
										</dl>
										
									</c:forEach>
	
<!-- ******************************************************************************************************************** -->								
	
								</div>
								
								<div class="hideright">
	
									<div class="tu1">
	
										<a href=""><img width="194px" height="70px"
											src="images/b1.jpg" alt="" /></a>
	
									</div>
	
									<div class="tu1">
	
										<a href=""><img width="194px" height="70px"
											src="images/b2.jpg" alt="" /></a>
	
									</div>
	
					
	
									
	
								</div>
	
							</div>
	
						</li>
<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! -->	
				</ul>
			</div>
			
		</div>

	</div>

	<div class="dhright">

		<ul>

			<li><a href="" style="background: #A40000">首页</a></li>

			<li><a href="">服装城</a></li>

			<li><a href="">食品</a></li>

			<li><a href="">团购</a></li>

			<li><a href="">夺宝岛</a></li>

			<li><a href="">闪购</a></li>

			<li><a href="">金融</a></li>

		</ul>

		<div class="dhtu">

			<ul>

				<li class="on"><img src="images/a3.png" alt="" />

					<div class="zeng"><span>4.2610%</span></div>

				</li>

				<li><img src="images/a4.png" alt="" /></li>

			</ul>

		</div>

	</div>

</div>

<!-- 导航条区域结束 -->









</body>

</html>

<!--代码整理：js代码 www.jsdaima.com-->