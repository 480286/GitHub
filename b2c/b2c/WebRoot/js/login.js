$(function () {
	// alert(1)
	var db=openDatabase("user","0.1","address user",20000000);
	//打开数据库（数据库名称，版本号，文本描述，数据库大小）
	db.transaction(function(tx){
		tx.executeSql('create table if not exists names(mobile,email,password)');
		//创建数据表（用户名，邮箱，密码）
		// tx.executeSql('insert into names(mobile,email,password) values("15670633870","1980894425@qq.com","123123")');
		// tx.executeSql('delete from names ');
	});
	$("#submit").click(function(){
		//点击提交
		var account=$("#account").val();
		//获取手机号或邮箱
		var password=$("#password").val();
		//获取密码
		// alert(account+","+password)
		db.transaction(function(tx){
			//从数据库中获取数据
			tx.executeSql("select * from  names",[],function(tx,results){
				var len=results.rows.length;
				// alert(len)
				for(var i=0;i<len;i++){
					//循环
					if(results.rows.item(i).mobile==account){
						//判断用户输入的数据和数据库中的用户名是否相同
						if( password==results.rows.item(i).password){
							//判断用户输入的数据和数据库中的密码是否相同
							alert("登陆成功,欢迎您手机用户:"+account);
							$(location).attr('href','index.html');
							return;
						}
					}else if(results.rows.item(i).email==account){
						//判断用户输入的数据和数据库中的邮箱是否相同
						if( password==results.rows.item(i).password){
							//判断用户输入的数据和数据库中的密码是否相同
							alert("登陆成功,欢迎您邮箱用户:"+account);
							$(location).attr('href','index.html');
							return;
						}
					}
				}
				alert("账户或密码输入错误");
			})
		})
		return false;
	})
})