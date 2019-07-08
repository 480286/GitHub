<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<meta charset="utf-8">
        <title>商城</title>
        <link rel="stylesheet" href="./css/common.css">
        <link rel="stylesheet" href="./iconfont/iconfont.css">
        <link rel="stylesheet" href="./css/cart.css">
        <script type="text/javascript" src="js/new_file.js" ></script>
        <script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script>
	</head>
	<body>
		<div id="main">
            <div class="container">
                <div id="cart">
                    <h1>购物车</h1>
                    <form action="SettlementServlet" method="post">
                        <table class="form">
                            <thead>
                                <tr>
                                    <th width="8%">选择</th>
                                    <th width="50%">商品</th>
                                    <th width="13%">单价（元）</th>
                                    <th width="15%">数量</th>
                                    <th width="14%">金额（元）</th>
                                </tr>
                            </thead>
                            
                            <tbody id="cart-goods-list">
                            <!-- *************************************************************** -->
                                <c:forEach var="item" items="${sessionScope.cartLst }">
                                <tr>
                                    <td>
                                        <input type="checkbox" name="id" value="1">
                                    </td>
                                    <td class="goods">
                                        <div class="goods-image">
                                            <img src="${item.good.imgPath }">
                                        </div>
                                        <div class="goods-information">
                                            <h3> ${item.good.goodsName }</h3>
                                            <ul>
                                                <li>50毫升</li>
                                                <li>不支持7天无理由退货</li>
                                            </ul>
                                        </div>
                                    </td>
                                    <td>
                                        <span class="price">￥<em>${item.good.price }</em></span>
                                    </td>
                                    <td>
                                        <div class="combo">
                                            <input type="button" name="minus" value="-" class="combo-minus">
                                            <input type="text" name="count" value="${item.nums }" class="combo-value">
                                            <input type="button" name="plus" value="+" class="combo-plus">
                                        </div>
                                    </td>
                                    <td>
                                        <strong class="amount">￥<em>${item.nums*item.good.price }</em></strong>
                                    </td>
                                </tr>
                                </c:forEach>
                                <!-- ************************************** -->
                            </tbody>
                            <tfoot>
                                <tr>
                                    <td colspan="2">
                                        <label>
                                            <input type="checkbox" name="all">
                                            <span>全选</span>
                                        </label>
                                        <a href="#" id="cart-delete">删除</a>
                                    </td>
                                    <td colspan="3">
                                        <span>合计：</span>
                                        <strong id="total-amount">￥<em>0.00</em></strong>
                                        <input type="submit" value="立即结算" id="settlement">
                                    </td>
                                </tr>
                            </tfoot>
                        </table>
                    </form>
                </div>
            </div>
        </div>
	</body>
	<script type="text/javascript">
		var inputs = document.querySelector("#cart").document.querySelectorAll("input");
	</script>
</html>

