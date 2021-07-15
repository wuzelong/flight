<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>廈门航空</title>
<%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!-- 引入jquery样式 -->
	<link rel="icon" href="images/myLogo.png" type="images/x-ico" />
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link type="text/css" href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/main_style.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/base_style.css" rel="stylesheet"/>
	<script type="text/javascript" src="${APP_PATH}/static/js/j.suggest.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/j.dimensions.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/aircity.js"></script>
</head>
<body>
<header>
<div class="wrap">
<div id="nav">
	<div class="logo">
		<a href="index.jsp"><img src="./static/images/myLogo2.png" alt=""></a>
	</div>
	<ul class="nave">
	<li class="nav-item active"><a href="index.jsp">首页  <span class="glyphicon glyphicon-home" aria-hidden="true"></a></li></a></li>
	<li ></li>
	<li class="nav-item">
		<a href="manage.jsp?page=2">预订管理 <span class="glyphicon glyphicon-paperclip" aria-hidden="true"></a>
		<div class="subMenu">
			<ul class="wrap">
			<li><a href="query.jsp">机票预订</a></li>
			<li><a href="manage.jsp?page=2">航班动态</a></li>
			<li><a href="manage.jsp?page=3">提前选座</a></li>
			<li><a href="manage.jsp?page=4">客票验真</a></li>
			<li><a href="manage.jsp?page=5">高端选餐</a></li>
			<li><a href="manage.jsp?page=6">自助退票</a></li>
			</ul>
		</div>
	</li>
	
	<li class="nav-item">
	<a href="help.jsp?page=1">出行帮助  <span class="glyphicon glyphicon-question-sign" aria-hidden="true"></a>
		<div class="subMenu">
			<ul class="wrap">
			<li><a href="help.jsp?page=1">座位布局图</a></li>
			<li><a href="help.jsp?page=2">危险品运输规定</a></li>
			<li><a href="help.jsp?page=3">防范短信诈骗</a></li>
			<li><a href="help.jsp?page=4">航班不正常服务</a></li>
			<li><a href="help.jsp?page=5">中国72/144小时过境免签政策</a></li>
			</ul>
		</div>
	</li>
	<li class="nav-item">
	<a href="user.jsp?page=2">个人中心  <span class="glyphicon glyphicon-user" aria-hidden="true"></a>
	<div class="subMenu">
		<ul class="wrap" id="userWrap">
		<!-- 根据用户动态显示 -->
		</ul>
	</div>
	</li>
	<li id="ifLogin">
		<!-- 用户名/登陆注册 -->
	</li>
</ul>
</div>
</div>
</header>

<!-- 中间主要内容 -->
<div class="container">
<!-- 幻灯片 -->
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
  </ol>
  
  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="./static/images/turn1.jpg"style="height:567px">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item">
      <img src="./static/images/turn2.jpg"style="height:567px">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item">
      <img src="./static/images/turn3.jpg"style="height:567px">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item">
      <img src="./static/images/turn4.jpg"style="height:567px">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item">
      <img src="./static/images/turn5.jpg"style="height:567px">
      <div class="carousel-caption">
      </div>
    </div>
  </div>
</div>

<!-- 查询表单 -->
<div class="queryForm">	
	<div class="form-group">
		<div id='suggest' class="ac_results"></div>
		<div id='suggest2' class="ac_results"></div>
		<div class="aLine">出发城市:
		<input type="text" id="cityFrom"/>
		</div>
		<div class="aLine">到达城市:
		<input type="text" id="cityTo"/>
		</div>
		<div class="aLine">去程日期：
		<input type="date" id="Apdate"/>
		</div>
		<button class="btn btn-info btn-lg"id="changeBtn">
		<span id="sp"class="glyphicon glyphicon-resize-vertical" aria-hidden="true"></span></button>
		<input type="button"id="queryBtn"class="btn btn-primary btn-lg"value="查询"/>
	</div>
</div>
</div>

<!-- 回到顶/底部 -->
<button class="scrollItem" id="toTop"><span class="glyphicon glyphicon-chevron-up" aria-hidden="true"></span>顶</button>
<button class="scrollItem" id="toBottom">底<span class="glyphicon glyphicon-chevron-down" aria-hidden="true"></span></button>

<!-- 底部about us -->
<div class="about-us-footer">
	<!-- connect us -->
	<div class="contact-us-bg">
	  <div class="container-clearfix-reset">
	    <div class="contact-group">
	      <div class="num">95557</div>
	      <div class="desc">服务热线</div>
	    </div>
	    <div class="contact-group">
	      <div class="num">86-592-2226666</div>
	      <div class="desc">境外请拨</div>
	    </div>
	    <div class="contact-group">
	      <div class="num">MF@XIAMENAIR.COM</div>
	      <div class="desc">E-mail</div>
	    </div>
	  </div>
	</div>
	<!-- copy right -->
	<div class="copy-right">
	    Copyright © 2020 JMU-WZL-YCB <span>中国厦门市集美大学</span>
	    <div style="display: inline; margin-left: 20px">
	        <a style="color: #fff;text-decoration: underline" href="http://beian.miit.gov.cn" target="_blank">闽ICP备06000856号</a>
	         <a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=35020602000793" style="display:inline-block;text-decoration:none;height:20px;line-height:20px;">
	      <p style="float:left;height:20px;line-height:30px;margin: 0px 0px 0px 5px; color:#fff;text-decoration: underline">闽公网安备XXXXXXXXX号</p>
	    </a>
	    </div>
	</div>
</div>
<script type="text/javascript">
	$(function () {
	    var speed = 700;//滚动速度
	    //回到顶部
	    $("#toTop").click(function () {
		  	$('html,body').animate({
				scrollTop: '0px'
			},
			speed);			
	    });
	    //回到底部
	    $("#toBottom").click(function () {
	        $('html,body').animate({
				scrollTop: '2500px'
			},
			speed);
	    });
	});
	//日期约束
	$(function(){
	    //得到当前时间
		var date_now = new Date();
		//得到当前年份
		var year = date_now.getFullYear();
		//得到当前月份
		//注：
		//  1：js中获取Date中的month时，会比当前月份少一个月，所以这里需要先加一
		//  2: 判断当前月份是否小于10，如果小于，那么就在月份的前面加一个 '0' ， 如果大于，就显示当前月份
		var month = date_now.getMonth()+1 < 10 ? "0"+(date_now.getMonth()+1) : (date_now.getMonth()+1);
		//得到当前日子（多少号）
		var date = date_now.getDate() < 10 ? "0"+date_now.getDate() : date_now.getDate();
		$("#Apdate").attr("min",year+"-"+month+"-"+date);
	})
	//下拉菜单
	$(function(){
	    $('ul.nave li.nav-item').hover(function(){
	        $(this).children('div.subMenu').stop().slideToggle(600);
	    })
	})
	
	//检查是否登录
	<%  if(session.getAttribute("username")==null){%>
			$("#ifLogin").empty();
			var re=$("<a></a>").attr("href","register.jsp").html("注册");
			var lo=$("<a></a>").attr("href","login.jsp").html("登录");
			$("#ifLogin").append(re).append("|").append(lo);
			$("#userWrap").empty();
			var l1=$("<a></a>").attr("href","user.jsp?page=1").html("我的账户");
			var l2=$("<a></a>").attr("href","user.jsp?page=2").html("我的订单");
			var l3=$("<a></a>").attr("href","user.jsp?page=3").html("我的乘机人");
			$("#userWrap").append($("<li></li>").append(l1))
				.append($("<li></li>").append(l2))
				.append($("<li></li>").append(l3));
		<%}
		else{
			String name=session.getAttribute("username").toString();%>
			$("#ifLogin").empty();
			var wel=$("<i></i>").html("欢迎");
			var lo=$("<br></br>");
			$("#ifLogin").append(wel).append(lo).append(" <%=name%> ");
			$("#userWrap").empty();
			var l1=$("<a></a>").attr("href","user.jsp?page=1").html("我的账户");
			var l2=$("<a></a>").attr("href","user.jsp?page=2").html("我的订单");
			var l3=$("<a></a>").attr("href","user.jsp?page=3").html("我的乘机人");
			var l4=$("<a></a>").attr("id","logout-a").html("注销登录");
			var l5=$("<a></a>").attr("href","user.jsp?page=5").html("后台管理");
			var ad=<%=session.getAttribute("admin")%>;
			if(ad==1){
				$("#userWrap").append($("<li></li>").append(l5))
				.append($("<li></li>").append(l2))
				.append($("<li></li>").append(l3))
				.append($("<li></li>").append(l4));
			}
			else{
				$("#userWrap").append($("<li></li>").append(l1))
				.append($("<li></li>").append(l2))
				.append($("<li></li>").append(l3))
				.append($("<li></li>").append(l4));
			}
		<%}
	%>
	//城市选择
	$(function(){
		$("#cityFrom").suggest(citys,{hot_list:commoncitys,attachObject:"#suggest"});
		
		$("#cityTo").suggest(citys,{hot_list:commoncitys,attachObject:"#suggest2"});

	});

	//交换城市
	$("#changeBtn").click(function(){
		var f=$("#cityFrom").val();
		var t=$("#cityTo").val();
		$("#cityFrom").val(t);
		$("#cityTo").val(f)
	});
	
	//点击查询
	$("#queryBtn").click(function(){
		var f=$("#cityFrom").val();
		var t=$("#cityTo").val();
		var d=$("#Apdate").val();
		if(f==""||t==""||d==""){
			alert("您当前选择的行程不完整，请重新操作");
		}
		else{//传参跳到查询界面
			window.location.href ="query.jsp?cityFrom="+f+"&cityTo="+t+"&Apdate="+d;	
		}
	});
	
	//点击注销登录
	$("#logout-a").click(function(){
		if(confirm("确认注销吗？")){
			$.ajax({
	            url:"${APP_PATH}/users/logout",
	            success:function (result) {
	            	alert("注销成功");
	    			window.location.href ="index.jsp";
	            }
	        });	
		}
	});
</script>
</body>
</html>