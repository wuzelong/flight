<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
 <%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!-- 引入jquery样式-->
	<link rel="icon" href="images/myLogo.png" type="images/x-ico" />
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <link type="text/css" href="${APP_PATH}/static/css/animate.min.css" rel="stylesheet"/>
	<link type="text/css" href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/verify.css"rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/login_style.css"rel="stylesheet"/>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/verify.js"></script>
	<style type="text/css">body{background:url(static/images/login_bg.jpg);background-size: 100% 100%;}</style>
</head>
<body>
<!-- 搭建显示页面和登录表单 -->
<div id="container">
	<!-- 时间 -->
	<div class="col-md-4" style="top:100px;font-size:30px">
	<span class="label label-warning">
		<span class="glyphicon glyphicon-time" aria-hidden="true">
		<span id="time"><script type="text/javascript"> showTime();</script></span>
		</span>
	</span>
	</div>
	<!-- 欢迎信息 -->
 	<div class="col-md-8 col-md-offset-1" style="top:180px">
 		<em><h1 style="font-size:90px" class="animate__animated animate__slideInLeft">
 		Welcome To</h1></em>
 	</div>
 	<div class="col-md-8 col-md-offset-1" style="top:180px">
 		<h1 class="animate__animated animate__slideInUp animate__delay-1s"style="font-size:75px">
 		<img src="./static/images/myLogo2.png"></h1>
	</div>
	<!-- 登录表单 -->
    <div id="content">
        <header>航空票务</header>
	    <form action="${APP_PATH}/users/logingCheck" method="post">
		    <div class="form-group">
		    <h3 class="col-sm-4"> 账号:</h3>
		    <input type="text" class="form-control input-lg" id="user_login_name" name="loginid" placeholder="请输入手机号或邮箱"/>
		    </div>
		    <div class="form-group">
		  	<h3 class="col-sm-4">密码:</h3>
		    <input type="password" class="form-control input-lg" id="user_login_password" name="password" placeholder="请输入密码" />
		    </div>
		    <div id="mpanel3" style="font-size:20px"></div>
		    <br>
		    <input type="button" id="user_register_btn" class="btn btn-info btn-lg" value="注册" onclick="window.location.href='register.jsp'"/>
		    <input type="button" id="user_login_btn"class="btn btn-primary btn-lg" value="登录"style="margin-left:30px"id="user_login_btn"/>
	    </form>
    </div>

</div>
<script type="text/javascript">
	//显示实时时间
	function showTime(){
    var time = new Date();
    nowTime = time.getFullYear()+"-"+(time.getMonth()+1)+"-"+time.getDate()+" "+time.getHours()+":"+time.getMinutes()+":"+time.getSeconds();
    document.getElementById("time").innerHTML = nowTime; 
    }
    setInterval("showTime()",1000);

	$('#mpanel3').codeVerify({
		type : 2,
		figure : 100,	//位数，仅在type=2时生效
		arith : 0,	//算法，支持加减乘，不填为随机，仅在type=2时生效
		width : '150px',
		height : '40px',
		fontSize : '20px',
		btnId : 'user_login_btn',
		ready : function() {
		},
		success : function() {
			$("#user_login_btn").val("正在登录...");
			//发送登录请求
			$.ajax({
				url:"${APP_PATH}/users/logingCheck",
	            type:"POST",
	            data:{id:$("#user_login_name").val(),pwd:$("#user_login_password").val()},
	            success:function (result) {
	            	if(result.code==100){
						alert("登录成功");
						window.location.href="${APP_PATH}/index.jsp";//替换成主界面
            		}
	            	else{
	            		$("#user_login_btn").val("登录");
		            	alert("账密错误或用户不存在！\n登录失败！");
						window.location.href="${APP_PATH}/login.jsp";         		
	            	}
                }
			});
		},
		error : function() {
			alert('验证码不匹配！');
		}
	});
	$(function(){
		$(".varify-input-code").attr("placeholder","请输入验证码");
	})
</script>
</body>
</html>