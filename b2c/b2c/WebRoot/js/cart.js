
window.onload   = function() {
	//全选
	$("input[name=all]").click(function(){
		//获取每个tr中多选框,
		var inputs = $("input[name=id]");
		for(var i = 0; i < inputs.length; i++)
			//每个tr中多选框的值更改为全选多选框中的值(如果全选选中，那么tr中所有的多选框都会被选中)
			inputs[i].checked = $("input[name=all]")[0].checked;
		//更新总金额
		calculate();
	});
	//切换单行选中状态
	$("input[name=id]").click(function(){
		//点击选中执行此函数刷新总金额
		calculate();
	});
	//点击更改数量
	var count_minus = $(".combo-minus");//获取减少按钮标签
	var count_plus = $(".combo-plus");//获取增加标签
	for(var i = 0; i < count_minus.length; i++){
		//得到当前所在行的按钮标签
		var minus = $(count_minus[i]);
		minus.click(function(){//点击执行此函数
			var count = $(this).next().val();//获取输入框内的数量值
			if(isNaN(count))//判断是否为非数字如果是更改为1
				$(this).next().val(1);
			if(count > 1)//如果数量大于1才可以减少
				$(this).next().val(--count);
			calculate();//更新总金额
		});
		var plus = $(count_plus[i]);
		plus.click(function(){
			var count = $(this).prev().val();
			if(isNaN(count))
				$(this).prev().val(1);
			else
				$(this).prev().val(++count);
			calculate();
		});
	}
	//手动更改数量
	var count_values = $(".combo-value");//获取输入框对象数组
	for(var i = 0; i < count_values.length; i++){
		var values = $(count_values[i]);//得到jQuery对象
		values.blur(function(){//失去焦点执行此函数
			var count = $(this).val();//获取输入框中的值
			if(count > 1)//如果大于一更新输入框内的值并解析成整数
				$(this).val(parseInt(count));
			else//否则更改为1
				$(this).val(1);
			calculate();//刷新总金额
		});
	}
	//删除商品
	$("#cart-delete").click(function(){
		//获取每行内的多选框
		var checks = $("input[name=id]");
		for(var i = 0; i < checks.length; i++){
			if(checks[i].checked)//如果选中，移除当前多选框的父元素的父元素就是当前行
				$(checks[i]).parent().parent().remove();
		}
		calculate();
	});
//	$("#settlement").click(function(){
// 	var checks = $("input[name=id]");
//		for(var i = 0; i < checks.length; i++){
//			if(checks[i].checked){
//				alert("合计"+prices.toFixed(2));
//			}
//			
//		}
//		calculate();
// });
//	
//	
};
//// 立即结算
// 

/**
 * 计算金额
 */
function calculate() {
	//获得tr标签数组
	var trs = $("#cart-goods-list").children();
	//定义总金额默认值为0.00
	var prices = 0.00;
	$("#total-amount").children()[0].innerHTML = prices;
	for(var i = 0; i < trs.length; i++){
		//获得单价$
		var price = parseFloat($(".price").children()[i].innerHTML);
		//获取数量
		var count = parseInt($(".combo-value")[i].value);
		//当前行总金额
		var colPrices = (price * count);
		//更改当前行总金额
		$(".amount").children()[i].innerHTML = colPrices.toFixed(2);
		//判断是否选中，如果选中累加，否则忽略
		if($("input[name=id]")[i].checked)
			prices += colPrices;
	}
	//更改总金额
	$("#total-amount").children()[0].innerHTML = prices.toFixed(2);
}
