<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机票预订</title>
<%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!-- 引入jquery样式 -->
	<link rel="icon" href="images/myLogo.png" type="images/x-ico" />
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link type="text/css" href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/base_style.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/query_style.css" rel="stylesheet"/>
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
	<li class="nav-item active">
	<a href="index.jsp">首页 <span class="glyphicon glyphicon-home" aria-hidden="true"></a></li>
	
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
	<a href="help.jsp?page=1">出行帮助 <span class="glyphicon glyphicon-question-sign" aria-hidden="true"></a>
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
	<a href="user.jsp?page=2">个人中心 <span class="glyphicon glyphicon-user" aria-hidden="true"></a>
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

<!-- 标签 -->
<div id="header-offset">
	<div id="ticket-progress">
	<ul id="clearfix flight">
		<li class="flight active"><span class="glyphicon glyphicon-plane" aria-hidden="true"></span> 1.选择航班</li>
		<li class="order "><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 2.填写订单</li>
		<li class="increment "><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 3.增值服务</li>
		<li class="pay "><span class="glyphicon glyphicon-usd" aria-hidden="true"></span> 4.确认并支付</li>
		<li class="end "><span class="glyphicon glyphicon-check" aria-hidden="true"></span> 5.出票完成</li>
	</ul>
	</div>
</div>
</header>

<!-- 中间主要内容 -->
<div class="container"style="margin-top:70px">
	<div id="queryForm">
		<div id="btns">
			<button class="btn btn-default active"style="magin-left:25px">单程</button>
			<a tabindex="0" class="btn btn-default" role="button"data-toggle="popover" 
			data-trigger="focus" data-content="开发中"style="magin-left:25px">往返</a>
			<a tabindex="0" class="btn btn-default" role="button"data-toggle="popover" 
			data-trigger="focus" data-content="开发中"style="magin-left:25px">多程</a>
		</div>
		<div id="aLine">		
			<div id='suggest' class="ac_results"></div>
			<div id='suggest2' class="ac_results"></div>
			出发城市:<input type="text" id="cityFrom"/>
			<button class="btn btn-info btn-lg"id="changeBtn">
			<span id="sp"class="glyphicon glyphicon-resize-horizontal" aria-hidden="true"></span></button>
			到达城市：<input type="text" id="cityTo"到达城市/>
			去程日期：<input type="date" id="Apdate"/>
			<input type="button"id="queryBtn"class="btn btn-primary btn-lg"value="查询"/>
		</div>
	</div>
	
	<div id="middle">
		<div id="left"class="col-md-9">
			<div id="queryBar">
			<p id="pCity"></p><p id="pDate"></p>
			<label> <span class="glyphicon glyphicon-time" aria-hidden="true"></span>出发时刻从早到晚</label>
			</div>
			
			<div id="loadGif"class="alert alert-default alert-dismissible in" role="alert">
			<img alt="加载中" src="${APP_PATH}/static/images/loading.gif"class="loadGif">	
			</div>		
			<!-- 航班信息 -->
			<div class="flightGroup">
			</div>
			<div id="sorry"class="alert alert-danger alert-dismissible in" role="alert">
				<em>抱歉，暂无航班！</em>
			</div>

			
		</div>
		<div id="right"class="col-md-3">
			<!-- 登录提示框 -->
			<div id="loginDiv"class="alert alert-warning alert-dismissible in" role="alert">
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <p><strong><span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>登录提示</strong>
			  <br>点击<a href="login.jsp" class="alert-link">登录</a>，在线快捷购买机票！
			  <br>还没有账号？点击<a href="register.jsp" class="alert-link">注册</a>立享优质服务！</p>
			</div>
			
			<!-- 时间提示框 -->
			<div class="alert alert-danger alert-dismissible" role="alert">
			  <p><strong><span class="glyphicon glyphicon-warning-sign" aria-hidden="true"></span>注意</strong>
			  <br>所有航班起抵时间均为当地时间（24小时制），请注意安排行程。</p>
			</div>
			
			<!-- 温馨提示 -->
			<div class="alert alert-info alert-dismissible" role="alert">
			  <p><strong><strong><span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>温馨提示</strong>
			  <br>厦航官网暂不接受重要旅客（VIP)、孕妇、病残旅客等特殊旅客购票。如您有需要，请到厦航自营售票处咨询。</p>
			</div>
			
			<!-- 微信 -->
			<div class="alert alert-success alert-dismissible" role="alert">
			  <strong>官方微信</strong>
			  <img alt="官方微信" src="${APP_PATH}/static/images/code_wechat.png">
			</div>
			
			<!-- app -->
			<div class="alert alert-success alert-dismissible" role="alert">
			  <strong>手机应用</strong>
			  <img alt="手机应用" src="${APP_PATH}/static/images/code_app.png">
			</div>
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
	$(function () {
	  $('[data-toggle="popover"]').popover()
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
			$("#loginDiv").removeClass('hide').addClass('in');
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
			$("#loginDiv").removeClass('in').addClass('hide');
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
	//从地址栏接受参数
	function getQueryString(name){
		var reg=new RegExp( "(^|&)" +name+ "=([^&]*)(&|$)" );
		var r=window.location.search.substr(1).match(reg);
		if(r!=null){
			return decodeURIComponent(r[2]);
		}
		return '';
	}
	//检查地址栏是否有参
	$(function(){
		var f=getQueryString("cityFrom");
		var t=getQueryString("cityTo");
		var d=getQueryString("Apdate");
		if(f!=''&&t!=''&&d!=''){
			$("#cityFrom").val(f);
			$("#cityTo").val(t);
			$("#Apdate").val(d);
			query(f,t,d);
		}
		else $("#loadGif").removeClass('in').addClass('hide');
	});

	//点击查询按钮
	$("#queryBtn").click(function(){
		var f=$("#cityFrom").val();
		var t=$("#cityTo").val();
		var d=$("#Apdate").val();
		if(f==""||t==""||d==""){
			alert("您当前选择的行程不完整，请重新操作");
		}
		else{
			$("#loadGif").removeClass('hide').addClass('in');
			query(f,t,d);		
		}
	});
	
	//查询
	function query(f,t,d){
		$.ajax({
            url:"${APP_PATH}/find/findTicket",
            data:{f:f+'市',t:t+'市',d:d},
            type:"POST",
            success:function (result) {
            	$("#pCity").html("单程："+f+" - "+t);
            	$("#pDate").html(d);
            	var flis = result.extend.tickets;
            	$(".flightGroup").empty();
            	$("#loadGif").removeClass('in').addClass('hide');
            	var flightD=null;
            	var partB=null;
            	var partM=null;
            	var tag=true;
		        $.each(flis,function (index, item){
		        	console.log(item);
		        	tag=false;
		        	if(index%2==0){//商务舱
		        		flightD=$("<div></div>").addClass("flightDiv");
			        	var partT=$("<div></div>").addClass("partTop");
				        	var img=$("<img></img>").attr("src","${APP_PATH}/static/images/logosm.png");
				        	var sp1=$("<span></span>").addClass("topText")
				        		.append($("<span></span>").addClass("glyphicon glyphicon-plane")).append(" "+item.flightId);
			        		var sp2=$("<span></span>").addClass("topText")
			        			.append($("<span></span>").addClass("glyphicon glyphicon-cutlery")).append(" "+item.mealStatus+"餐食");
			        	partM=$("<div></div>").addClass("partMid");
			        			var date1 = new Date(item.departuretime);
				        		var h1 = (date1.getHours() < 10) ? ('0' + date1.getHours() ) : (date1.getHours() );
				        		var m1 = (date1.getMinutes() < 10) ? ('0' + date1.getMinutes() ) : (date1.getMinutes() );
				        		var date2 = new Date(item.arrivaltime);
				        		var h2 = (date2.getHours() < 10) ? ('0' + date2.getHours()) : (date2.getHours()  );
				        		var m2 = (date2.getMinutes() < 10) ? ('0' + date2.getMinutes() ) : (date2.getMinutes() );
				        		var h3 = h2-h1;
				        		var m3 = m2-m1;
				        		if(m3<0){
				        			m3=m3+60;
				        			h3=h3-1;
				        		}
				        					
				        	var fromT=$("<div></div>").addClass("fromTime");
			        			var img1=$("<img></img>").attr("src","${APP_PATH}/static/images/flightStart.png");
				        		var fromW=$("<div></div>").addClass("fromWhere").append(item.departurecity.substring(0,item.departurecity.length-1))
				        			.append(item.departureairportName.substring(0,2)).append(item.departureterminalName);
				        		var imgL=$("<img></img>").addClass("imgLine").attr("src","${APP_PATH}/static/images/line.png");
			        	    fromT.append(img1).append(h1).append(":").append(m1).append(fromW).append(imgL);
				        		var costT=$("<p></p>").append(h3+"小时"+m3+"分钟");
			        	    var spMid=$("<span></span>").addClass("glyphicon glyphicon-arrow-right")
			        			.append(costT);
			        			var toW=$("<div></div>").addClass("toWhere").append(item.arrivalcity.substring(0,item.arrivalcity.length-1))
			        				.append(item.arrivalairportName.substring(0,2)).append(item.arrivalterminalName);
			        	    var toT=$("<div></div>").addClass("toTime").append(h2+":"+m2)
			        			.append($("<img></img>").attr("src","${APP_PATH}/static/images/flightEnd.png"))
			        			.append(toW);
			        	    
			        		partB=$("<div></div>").addClass("partBot");
				        	var cabinH=$("<div></div>").addClass("cabinHigh");
				        		var TC=$("<div></div>").addClass("textC").append(item.cabinLevel);
				        		var TR=$("<div></div>").addClass("textR").append("行李|退改签规则");
				        		var TB=$("<button></button>").addClass("btn btn-success btn-sm").attr("data-container","body")
				        			.attr("data-toggle","popover").attr("data-placement","bottom")
				        			.attr("data-content","行李：        免费托运行李"+item.luggageAllowance+"件，限重"+item.luggageNumber+"斤。退改签规则：    "+item.rules)
				        			.append($("<span></span>").addClass("glyphicon glyphicon-zoom-in"));
				        		var TP=$("<div></div>").addClass("textP").append("￥").append($("<strong></strong>").append(item.sellingPrice));
				        		var TI=$("<div></div>").addClass("getI").append("积分"+item.integral);
				        		var TBB=$("<button></button>").addClass("btn btn-info bookBtn").append("预订")
				        			.attr("fli_id",item.executiveFlightId).attr("cab_id",item.cabinId).attr("remain",item.remainingTickets);
				        		var TT=$("<div><div>").addClass("remainT").append("余票"+item.remainingTickets+"张");
				        		cabinH.append(TC).append(TR.append(TB)).append(TP).append(TI).append(TBB).append(TT);
				        	flightD.append(partT.append(img).append(sp1).append(sp2));
				        	partM.append(fromT).append(spMid).append(toT);
				        	partB.append(cabinH);
		        	}
		        	else{
		        		var cabinL=$("<div></div>").addClass("cabinLow");
			        	var LC=$("<div></div>").addClass("textC").append(item.cabinLevel);
		        		var LR=$("<div></div>").addClass("textR").append("行李|退改签规则");
		        		var LB=$("<button></button>").addClass("btn btn-success btn-sm").attr("data-container","body")
		        			.attr("data-toggle","popover").attr("data-placement","bottom").attr("data-content",item.rules)
		        			.append($("<span></span>").addClass("glyphicon glyphicon-zoom-in"));
		        		var LP=$("<div></div>").addClass("textP").append("￥").append($("<strong></strong>").append(item.sellingPrice));
		        		var LI=$("<div></div>").addClass("getI").append("积分"+item.integral);
		        		var LBB=$("<button></button>").addClass("btn btn-info bookBtn").append("预订")
		        			.attr("fli_id",item.executiveFlightId).attr("cab_id",item.cabinId).attr("remain",item.remainingTickets);
		        		var LT=$("<div><div>").addClass("remainT").append("余票"+item.remainingTickets+"张");
		        		cabinL.append(LC).append(LR.append(LB)).append(LP).append(LI).append(LBB).append(LT);
		        		partB.append(cabinL);
		        		var lastP=$("<div></div>").addClass("lastPrice").append("￥").append($("<strong></strong>").append(item.sellingPrice)).append("起");
		        		flightD.append(partM.append(lastP)).append(partB).appendTo($(".flightGroup"));
		        		flightD=null;
		            	partB=null;
		            	partM=null;
		        	}
		        });
		        if(tag)$("#sorry").removeClass('hide').addClass('in');
            	else $("#sorry").removeClass('in').addClass('hide');
		        $('[data-toggle="popover"]').popover();
            }
        });
	};
	
	//点击注销登录
	$("#logout-a").click(function(){
		if(confirm("确认注销吗？")){
			$.ajax({
	            url:"${APP_PATH}/users/logout",
	            success:function (result) {
	            	alert("注销成功");
	    			window.location.href ="query.jsp";
	            }
	        });	
		}
	});
	
	//点击预订
	$(document).on("click",".bookBtn",function (){
		var fli_id=$(this).attr("fli_id");
		var cab_id=$(this).attr("cab_id");
		var rem=$(this).attr("remain");
		if(rem<=0)alert("抱歉，余票量不足！");
		else
			window.location.href ="order.jsp?fli="+fli_id+"&cab="+cab_id;
	});
</script>
</body>
</html>