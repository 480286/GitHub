$(function () {
	var pd1,pd2,pd3,pd4,pd5=false;
	//初始化变量
	var db=openDatabase("user","0.1","address user",20000000);
	//打开数据库（数据库名称，版本号，文本描述，数据库大小）
	db.transaction(function(tx){
		
		tx.executeSql('create table if not exists names(mobile,email,password)');
		//创建数据表（用户名，邮箱，密码）
		// tx.executeSql('insert into names(mobile,email,password) values("15670633870","1980894425@qq.com","123123")');
		// tx.executeSql('delete from names ');
	});
	//手机号验证
	$("#mobile").blur(function(){
		//当手机号码输入框失去焦点是触发
		var mobile=$("#mobile").val();
		//获取手机号输入框
		//alert(mobile);
		var phone=/^1[3 4 5 7 8]\d{9}$/g;
		//验证手机号码正则表达式
		if(phone.test(mobile)){
			//如果手机号码符合span标签内容隐藏
			$(this).next().css("display","none");
			pd1=true;
		}else{
			//如果手机号码不符合span标签内容显示
			$(this).next().css("display","block");
			pd1=false;
		}
	})

	//电子邮箱
	$("#email").blur(function(){
		//当电子邮箱输入框失去焦点是触发
		var email=$("#email").val();
		//获取电子邮箱输入框
		//alert(email)
		var reg=/^\w+@\w+(\.[a-zA-Z]{2,3}){1,2}$/i;
		//验证电子邮箱正则表达式
		if(reg.test(email)){
			// alert("邮箱正确");
			//如果电子邮箱格式符合，span标签内容隐藏
			$(this).next().css("display","none");
			pd2=true;
			
		}else{
			// alert("邮箱错误");
			//如果电子邮箱格式不符合，span标签内容显示
			$(this).next().css("display","block");
			pd2=false;
		}
	})

	//密码
	$("#password").blur(function(){
		//当密码输入框失去焦点是触发
		var password=$("#password").val();
		//获取密码输入框
		// alert(password)
		if(password.length<6){
			// alert("密码不能小于6")
			$(this).next().next().css("display","none");
			//获取密码的下一标签的下一标签（也就是span标签，密码不能小于6）
			$(this).next().css("display","block");	
			pd3=false;
		}else if(password.length>16){
			// alert("密码不能大于16")
			$(this).next().css("display","none");
			$(this).next().next().css("display","block");
			//获取密码的下一标签的下一标签（也就是span标签，密码不能大于16）
			pd3=false;
		}else{
			$(this).next().css("display","none");
			$(this).next().next().css("display","none");
			//获取密码的下一标签的下一标签（也就是span标签，仅限6~16个字母、数字、特殊符号。）
			pw=password;
			//使用户输入的密码赋值给离线存储的pw
			pd3=true;
		}
	})
	$("#password-confirmation").blur(function(){
		//当重复密码输入框失去焦点是触发
		var confirmation=$("#password-confirmation").val();
		//获取重复密码输入框
		var pw=$("#password").val();
		//获取密码输入框
		// alert(confirmation)
		if(confirmation!=pw){
			// alert("两次密码不相同");
			//比较两次输入密码是否相同
			$(this).next().css("display","block");	
			//获取重复密码的下一标签（也就是span标签），判断不一样，输出两次密码不相同
			pd4=false;
		}else{
			$(this).next().css("display","none");
			//获取重复密码的下一标签（也就是span标签），判断一样，span内容隐藏
			pd4=true;
		}
	})

	$("#submit").click(function(){
		//点击提交按钮
		// alert($("#c").is(':checked'));
		if(!$("#c").is(':checked')){
			//判断单选框是否被选上，如果判断为false则请您阅读协议
			alert("请您阅读协议");
			pd5=false;
		}else{
			pd5=true;
		}
		//绑定失去焦点事件
		$("#mobile").blur();
		pd5=$("#c").is(':checked');
		$("#email").blur();
		$("#password").blur();
		$("#password-confirmation").blur();
		
		if(pd1&& pd2&& pd3&& pd4&& pd5){
			//判断以上pd1,pd2,pd3,pd4,pd5是否为true,为true注册成功
			//$(location).attr('href','index.html');
			var mobile=$("#mobile").val();
			var email=$("#email").val();
			var password=$("#password").val();
			//alert(mobile+","+email+","+password)

			db.transaction(function(tx){
				// alert(0)
				tx.executeSql('create table if not exists names(mobile,email,password)');
				//创建一张表头文件mobile,email,password
				tx.executeSql('insert into names(mobile,email,password) values(?,?,?)',[mobile,email,password]);
				//从表单中获取数据
			});
			// for(var i=0;i<localStorage.length;i++){
			// 	if(localStorage.key(i)==mobile){
			// 		alert("该手机号码已经注册,请您直接登陆!");
			// 		return false;
			// 	}else if(localStorage.key(i)==email){
			// 		alert("该邮箱已经注册,请您直接登陆!");
			// 		return false;
			// 	}
			// }
			// localStorage.setItem(mobile,password);
			// localStorage.setItem(email,password);
			alert("注册成功");
			window.open("login.html");
			return true;
		}else{
			alert("请将您的用户信息填写完整");
		}
		return false;
	})
})