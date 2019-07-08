window.onload=function(){
	$("input[name=all]").click(function(){
		var inputs=$("input[name=id]");
		for (var i=0;i<inputs.length;i++) 
			inputs[i].checked=$("input[name=all]")[0].checked;
		aaa();
	});
	$("input[name=id]").click(function(){
		//点击选中执行此函数刷新总金额
		aaa();
	});	
	var jianshao=$(".combo-minus");
	var  zengjia= $(".combo-plus");
	for (var i=0;i<jianshao.length;i++) {
		var  minus=$(jianshao[i]);
		minus.click(function(){
			var cont=$(this).next().val();
			if(isNaN(cont))
				$(this).next().val(1);
				if(cont>1)
				$(this).next().val(--cont);
				aaa();
		});
	
		var plus=$(zengjia[i]);
		plus.click(function(){
			var cont=$(this).prev().val();
			if(isNaN(cont))
			$(this).prev().val(1);
			else
			$(this).prev().val(++cont);
			aaa();
		});
		
	}
	var countw=$(".combo-value");
	for (var i=0;i<countw.length;i++) {
		var counts=$(".combo-value[i]");
		counts.blur(function(){
			var b=$(this).val();
			if(b>1)
			$(this).val(parseInt(b));
			else
			$(this).val(1);
			aaa();
		});
	}
	$("#cart-delete").click(function(){
		var check=$("input[name=id]");
		for (var i=0;i<check.length;i++) {
			if(check[i].checked)
			$(check[i]).parent().parent().remove();
			
		}
		aaa();
	});
	
};
function aaa(){
	//获得tr标签数组
	var trs=$("#cart-goods-list").children();
	var prices=0.0;
	$("#total-amount").children()[0].innerHTML=prices;
	for (var i=0;i<trs.length;i++) {
		var price=parseFloat($(".price").children()[i].innerHTML);
		var count=parseInt($(".combo-value")[i].value);
		var colPrices=(price*count);
		$(".amount").children()[i].innerHTML = colPrices.toFixed(2);
		if($("input[name=id]")[i].checked)
			prices += colPrices;
	}
	//更改总金额
	$("#total-amount").children()[0].innerHTML = prices.toFixed(2);
	}

