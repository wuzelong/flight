<%@page import="java.io.Console"%>
<%@page import="cn.jmu.utils.AliyunSmsUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!-- 引入jquery样式 -->
	<link rel="icon" href="images/myLogo.png" type="images/x-ico" />
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <link type="text/css" href="${APP_PATH}/static/css/animate.min.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/verify.css"rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/login_style.css"rel="stylesheet"/>
    <script type="text/javascript" src="${APP_PATH}/static/js/verify.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/tbdValidate.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/upload.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/smtp.js"></script>
	<style type="text/css">body{background:url(static/images/login_bg.jpg);background-size: 100% 100%;}</style>
</head>
<body>
<!-- 人机验证的模态框 -->
	<div class="modal fade" id="msgModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	    <div class="modal-dialog" role="document">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	                <h4 class="modal-title" id="myModalLabel">请先完成人机验证</h4>
	            </div>
                <form class="form-horizontal">
	           		<div id="mpanel4"></div>
	            </form>
	        </div>
	    </div>
	</div>
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
	<!-- 注册表单 -->
	 <div id="content" style="font-size: 15px">
      	<ul class="nav nav-tabs" style="font-size:25px">
		  <li role="presentation" class="active"id="li_phone"><a id="a_phone">手机注册</a></li>
		  <li role="presentation"id="li_email"><a id="a_email">邮箱注册</a></li>
		</ul>
		<br>
		<form>
		<div class="form-group" id="nameDiv">
			<input type="text" class="form-control input-lg" placeholder="请输入用户名" id="reg_name"name="username"/>
		  	<label class="col-sm-8 col-md-offset-4 control-label" id="reg_name_text"style="color:red"></label>
		</div>
		<div class="form-group" id="phoneDiv">
			<input type="text" class="form-control input-lg" placeholder="请输入手机号" id="reg_phone"name="loginid"/>
		  	<label class="col-sm-7 col-md-offset-5 control-label" id="reg_phone_text"style="color:red"></label>
		</div>
		<div class="form-group" id="pwdDiv">
			<input type="password" class="form-control input-lg" placeholder="设置登录密码" id="reg_password"name="password"/>
			<label class="col-sm-8 col-md-offset-5 control-label" id="reg_password_text"style="color:red"></label>
		</div>
		<div class="form-group" id="msgDiv">
			<input type="text" class="form-control input-lg" placeholder="短信验证码" id="reg_mescode""/>
			<input type="button" class="btn btn-success col-sm-5" id="reg_mescode_btn"value="获取验证码"able="able"/>
			<label class="control-label col-sm-7" id="reg_mescode_text"style="color:red"></label>
		</div>
		<br><br>
		<div class="form-group has-success has-feedback col-sm-12">
			<input type="button" value="注册" class="btn btn-info btn-lg" id="reg_submit" />
		</div>
		</form>
     </div>
</div>
</body>
<script type="text/javascript">
	var ran="";//验证码
	var type=0;//区分手机/邮箱
	//显示实时时间
	function showTime(){
    var time = new Date();
    nowTime = time.getFullYear()+"-"+(time.getMonth()+1)+"-"+time.getDate()+" "+time.getHours()+":"+time.getMinutes()+":"+time.getSeconds();
    document.getElementById("time").innerHTML = nowTime;
    }
    setInterval("showTime()",1000);
	
	//获取短信验证码
	var mesdong=null;
	var mestime=60;
	$("#reg_mescode_btn").click(function(){	
		var phoneval=$.trim($("#reg_phone").val());
		if(regconfig[0].rule[0].reg.test(phoneval)){
			$("#reg_phone_text").hide();	
		}else{			
			$("#reg_phone_text").html(regconfig[0].rule[0].text).show();
			$("#reg_phone").focus();
			return false
		};
		if(regconfig[0].rule[1].reg.test(phoneval)){
			$("#reg_phone_text").hide();				
		}else{
			$("#reg_phone").focus();
			$("#reg_phone_text").html(regconfig[0].rule[1].text).show();
			return false
		};
		if($(this).attr('able')=="able"){//发送
			$(this).attr('able',"disable");
			$(this).css('cursor','not-allowed');
			$(this).html(mestime+"s");
			mesdong=setInterval(function(){//倒计时
				mestime-=1;
				if(mestime<0){
					$("#reg_mescode_btn").attr('able',"able");
					$("#reg_mescode_btn").css('cursor','pointer');
					$("#reg_mescode_btn").attr("value","获取验证码");
					mestime=60;
					clearInterval(mesdong);
				}else{
					$("#reg_mescode_btn").attr("value",mestime+"s");			
				};
			},1000);
	        //弹出模态框
	        $("#msgModal").modal({
	        	backdrop:"static"
			});	
		}
	});	
	
	//校验
	var regconfig=[
			{eleinput:"reg_phone",eletext:"reg_phone_text",rule:[{reg:/^.+$/,text:'手机号不能为空'},{reg:/^1[345789]\d{9}$/,text:'手机号格式错误'}]},
			{eleinput:"reg_password",eletext:"reg_password_text",rule:[{reg:/^.+$/,text:'密码不能为空'},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]},
			{eleinput:"reg_mescode",eletext:"reg_mescode_text",rule:[{reg:/^.+$/,text:'验证码不能为空'},{reg:/^[0-9]{6}$/,text:'输入6位短信验证码'}]},
			{eleinput:"reg_name",eletext:"reg_name_text",rule:[{reg:/^.+$/,text:'用户名不能为空'},{reg:/^.{2,6}$/,text:'用户名在2-6位之间'}]}
		];
	function valid(){
		tbdValidate(
			regconfig,
			{
				elesubmit:"reg_submit",//提交按钮
				funsubmit:function(){//验证通过可提交回调	
					var cur=$("#reg_mescode").val();
					if(ran!=cur){
						$("#reg_mescode_text").html("验证码错误").show();
						return false;
					}			
					$("#reg_submit").val("正在注册...");
					//发送注册用户请求
					$.ajax({
						url:"${APP_PATH}/users/insertUsers",
			            type:"POST",
			            data:$("#content form").serialize(),//表单信息序列化
			            success:function (result) {
			            	if(result.code==100){
			            		//注册成功->点击对话框回到登录界面
								alert("注册成功！");
								window.location.href="${APP_PATH}/login.jsp";
		            		}
			            	else{
			            		alert("该手机/邮箱已被注册！\n注册失败！");
			            		$("#reg_submit").val("注册");
			            	}
		                }
					});
				},
				funerr:function(){//不可提交回调
				},
	            funerrlist:function(errlist){
	                $('#'+ errlist[0]).focus();
	            }	
			}
		);	
	}
	valid();

	//滑动验证
	$("#mpanel4").slideVerify({
    	type : 2,		//类型
		vOffset : 5,	//误差量，根据需求自行调整
        vSpace : 5,	//间隔
        imgName : ['check1.jpeg', 'check2.jpeg','check3.jpg'],
        imgSize : {
        	width: '400px',
        	height: '200px',
        },
        blockSize : {
        	width: '40px',
        	height: '40px',
        },
        barSize : {
        	width : '400px',
        	height : '40px',
        },
        ready : function() {
    	},
        success : function() {//验证通过->发送短信
        	if(type==0){//手机
        		$.ajax({
  	   			  url:"${APP_PATH}/users/sendToPhone",
                  type:"POST",
                  data:{tel:$("#reg_phone").val()},
                  success:function (result){
                  	if(result.code==100){
		                ran=result.extend.ranNum;
		               	alert("验证码发送成功！");                		 
                	 }
                	else alert("请稍后重试！");
                 }
  	   		  });
        	}
        	else{//邮箱
        		$.ajax({//请求验证码
           		 url:"${APP_PATH}/users/random",
                    type:"POST",
                    success:function (result){
                   	 ran=result.extend.ranNum;
                   	 var mail=$("#reg_phone").val();
            		 Email.send({//发送邮件
            			 Host : "smtp.qq.com",
            		     Username : "413652081@qq.com",
            		     Password : "nvyyspxysfypbhfj",
            		     To :  mail,
            		     From : "413652081@qq.com",
            		     Subject : "【廈门航空】",
            		     Body : "【廈门航空】您正在申请邮箱注册，验证码为："+ran+"，5分钟内有效！"
	            		 }).then(
	            		   message => alert(message)
	            		 );
                	}
         	  	});
        	}
	   		$("#msgModal").modal('hide');//关闭模态框
        },
        error : function() {
        	$("#msgModal").modal('hide');//关闭模态框     	
        } 
    })
    
    //点击邮箱注册
    $("#a_email").click(function(){
		$("#content form")[0].reset();//重置表单
    	type=1;
		$("#li_email").attr("class","active");
		$("#li_phone").attr("class","");
		$("#reg_name_text").html("");
		$("#reg_phone_text").html("");
		$("#reg_password_text").html("");
		$("#reg_mescode_text").html("");
		$("#reg_mescode_text").html("");
		$("#myModalLabel").html("请先完成人机验证(若未收到邮件，请检查是否开通pop3/smtp服务)");
		$("#reg_phone").attr("placeholder","请输入邮箱地址");
		$("#reg_mescode").attr("placeholder","邮箱验证码");
		regconfig[0]={eleinput:"reg_phone",eletext:"reg_phone_text",rule:[{reg:/^.+$/,text:'邮箱地址不能为空'},{reg:/^([a-zA-Z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/,text:'邮箱格式错误'}]};
		valid();
	});
	
	//点击手机注册
    $("#a_phone").click(function(){
		$("#content form")[0].reset();//重置表单
    	type=0;
    	$("#li_phone").attr("class","active");
		$("#li_email").attr("class","");
		$("#reg_name_text").html("");
		$("#reg_phone_text").html("");
		$("#reg_password_text").html("");
		$("#reg_mescode_text").html("");
		$("#myModalLabel").html("请先完成人机验证");
		$("#reg_phone").attr("placeholder","请输入手机号");
		$("#reg_mescode").attr("placeholder","短信验证码");
		regconfig[0]={eleinput:"reg_phone",eletext:"reg_phone_text",rule:[{reg:/^.+$/,text:'手机号不能为空'},{reg:/^1[34578]\d{9}$/,text:'手机号格式错误'}]};
		valid();
    });
</script>
</html>