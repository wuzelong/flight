<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>预订管理</title>
<%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!-- 引入jquery样式 -->
	<link rel="icon" href="images/myLogo.png" type="images/x-ico" />
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link type="text/css" href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/base_style.css" rel="stylesheet"/>
	<link type="text/css" href="${APP_PATH}/static/css/manager_style.css" rel="stylesheet"/>
		<script type="text/javascript" src="${APP_PATH}/static/js/jquery.seat-charts.js"></script>
	<link type="text/css" href="${APP_PATH}/static/css/jquery.seat-charts.css" rel="stylesheet">
	<link type="text/css" href="${APP_PATH}/static/css/style.css" rel="stylesheet">
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

</header>

<!-- 中间主要内容 -->
<div class="container"style="margin-top:20px">
	<div id="middle">
		<div id="left"class="col-md-9">
			<!-- 左侧导航 -->
			<div id="navgation"class="col-md-3">
			<ul class="nav nav-pills">
			  <li role="presentation"id="p1"><a href="query.jsp">机票预订</a></li>
			  <li role="presentation"id="p2"><a href="manage.jsp?page=2">航班动态</a></li>
			  <li role="presentation"id="p3"><a href="manage.jsp?page=3">提前选座</a></li>
			  <li role="presentation"id="p4"><a href="manage.jsp?page=4">客票验真</a></li>
			  <li role="presentation"id="p5"><a href="manage.jsp?page=5">高端选餐</a></li>
			  <li role="presentation"id="p6"><a href="manage.jsp?page=6">自助退票</a></li>
			</ul>
			</div>
			
			<!-- 文本内容 -->
			<div id="content"class="col-md-9">
				<div id="titles"></div>	
				<div id="freshArea">
				<!-- 航班动态 -->
				<div class="alert alert-dismissible hide"id="p2detail"role="alert">
				<div class="alert alert-dismissible in"id="p21detail"role="alert">
					<input type="text"class="col-md-5 col-md-offset-7" id="flight_input" placeholder="请输入航班号"/>
					<button class="btn btn-warning" id="flight_button">查询</button>
					
					
				</div>
				
				<div class="alert alert-dismissible hide"id="p22detail"role="alert">
					<img alt="加载中" src="${APP_PATH}/static/images/loading.gif"style="height:100px;width:100px">
					<br>
				</div>
				<br style="clear:both;">
				</div>
				
				<!-- 提前选座 -->
				<div class="alert alert-dismissible hide"id="p3detail"role="alert">
					<div class="alert alert-dismissible in"id="p31detail"role="alert">
						<input type="text"class="col-md-5 col-md-offset-7" id="checkSeat_input" placeholder="请输入订单号"/>
						<button class="btn btn-success" id="checkSeat_button">选座</button>
					</div>
					<div class="alert alert-dismissible hide"id="p32detail"role="alert">
						<div id="seat-map">
							<div class="front-indicator">机首</div>
						</div>
						<div class="booking-details">
							<h2>在线值机选座</h2>
							<div id="legend"></div>
							<h3><strong id="oughtSelect"></strong></h3>
							<br>
							<h3> 我的选座（<span id="counter">0</span>）:</h3>
							<br>
							<ul id="curSelected"></ul>
							<ul id="selected-seats"></ul>
							<button class="btn btn-success checkout-button">确认</button>
						</div>
					</div>
				</div>
			
				<!-- 客票验真 -->
				<div class="alert alert-dismissible hide"id="p4detail"role="alert">
					<input type="text"class="col-md-5 col-md-offset-7" id="check_input" placeholder="请输入机票号">
					<button class="btn btn-danger" id="check_button">验证</button>
				</div>
				
				<!-- 高端选餐 -->
				<div class="alert alert-dismissible hide"id="p5detail"role="alert">
						<img alt="加载中" src="${APP_PATH}/static/images/loading.gif"style="height:100px;width:100px">
					开发中
				</div>
				
				<!-- 自助退票 -->
				<div class="alert alert-dismissible hide"id="p6detail"role="alert">
						<img alt="加载中" src="${APP_PATH}/static/images/loading.gif"style="height:100px;width:100px">
					开发中
				</div>
				</div>
				
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

	//点击注销登录
	$("#logout-a").click(function(){
		if(confirm("确认注销吗？")){
			$.ajax({
	            url:"${APP_PATH}/users/logout",
	            success:function (result) {
	            	alert("注销成功");
	    			window.location.href ="help.jsp?page=1";
	            }
	        });	
		}
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
		var p=getQueryString("page");
		if(p!=''){
			$('#p'+p).addClass('active');
			$("#titles").html($('#p'+p).html()); 
			$('#p'+p+'detail').removeClass('hide').addClass('in');
			$('#p'+p+'1detail').removeClass('hide').addClass('in');
		}
	});
	
	//客票验真
	$("#check_button").click(function(){
		$("#check_button").html("正在验证...");
		$.ajax({
			url:"${APP_PATH}/orders/checkTicket",
            data:{tickId:$("#check_input").val()},
            type:"POST",
            success:function (result) {
            	if(result.extend.result)alert("该机票为真！");
            	else alert("未查询到该机票号！\n谨防上当受骗！");
				$("#check_button").html("验证");
            }
		});
	});
	var scc;
	//选座
	var firstSeatLabel = 1;
	$(document).ready(function() {
		var $cart = $('#selected-seats'),
			$counter = $('#counter'),
			$total = $('#total'),
			sc = $('#seat-map').seatCharts({
			map: [
				'f_f_f_f','f_f_f_f',
				'eee_eee','eee_eee','eee_eee','eee_eee','eee_eee',
				'eee_eee','eee_eee','eee_eee','eee_eee','eee_eee',
				'eee_eee','eee_eee','eee_eee','eee_eee','eee_eee',
				'eee_eee','eee_eee','eee_eee','eee_eee','eee_eee',

			],
			seats: {
				f: {
					classes : 'first-class', //your custom CSS class
					category: '商务舱'
				},
				e: {
					classes : 'economy-class', //your custom CSS class
					category: '经济舱'
				}					
			},
			naming : {
				top : false,
				getLabel : function (character, row, column) {
					return firstSeatLabel++;
				},
			},
			legend : {
				node : $('#legend'),
			    items : [
					[ 'f', 'available',   '商务舱' ],
					[ 'e', 'available',   '经济舱'],
					[ 'n', 'unavailable', '已选定']
			    ]					
			},
			click: function () {
				if (this.status() == 'available') {
					//let's create a new <li> which we'll add to the cart items
					$('<li>'+this.data().category+' Seat # '+this.settings.label+': <b>$'+this.data().price+'</b> <a href="#" class="cancel-cart-item">[cancel]</a></li>')
						.attr('id', 'cart-item-'+this.settings.id)
						.data('seatId', this.settings.id);
					$counter.text(sc.find('selected').length+1);
					//
					var s=document.getElementById(this.settings.id).innerText ;
					var lii=$("<li></li>").html(this.data().category+" #"+s).attr("id","li"+this.settings.id).attr("num",s).addClass("oddli")
					$("#curSelected").append(lii);
					return 'selected';
				} else if (this.status() == 'selected') {
					//update the counter
					$counter.text(sc.find('selected').length-1);
					//remove the item from our cart
					$('#cart-item-'+this.settings.id).remove();
					//seat has been vacated
					document.getElementById("li"+this.settings.id).remove();
					return 'available';
				} else if (this.status() == 'unavailable') {
					//seat has been already booked
					return 'unavailable';
				} else {
					return this.style();
				}
			}
		});
		scc=sc;
		//this will handle "[cancel]" link clicks
		$('#selected-seats').on('click', '.cancel-cart-item', function () {
			//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here
			sc.get($(this).parents('li:first').data('seatId')).click();
		});
		//let's pretend some seats have already been booked
		//sc.get(['1_1', '4_1','10_7','7_2','13_5']).status('unavailable');
	});
	
	var tics;
	//点击选座
	$("#checkSeat_button").click(function(){
		var uid=<%=session.getAttribute("userid")%>;
		if(uid==null||uid==""){
			alert("请先登录！");	
			return false;			
		}
		$("#checkSeat_button").html("加载中");
		$.ajax({
			 url:"${APP_PATH}/orders/selectSeat",
	            data:{oid:$("#checkSeat_input").val(),uid:<%=session.getAttribute("userid")%>},
	            type:"POST",
	            success:function (result) {
	            	if(result.code==100){
		            	tics=result.extend.map.tickets;
		            	var seats=result.extend.map.seatSelections;
		            	if(tics[0].checkstatus!="未值机")alert("您已为该订单值机");
		            	else{
		            		var cabLev=tics[0].cabinid;
		            		var cabN='经济舱';
		            		if(cabLev==2)cabN='商务舱';
		            		var len=tics.length;
		            		$("#oughtSelect").html("待选： "+cabN+" × "+len);	            		
		            		$(".checkout-button").attr("tics",tics);
		            		initSeat(seats);
		            		$('#p31detail').removeClass('in').addClass('hide');
		            		$('#p32detail').removeClass('hide').addClass('in');
		            	}
		            	
	            		
	            	}
	            	else alert("这不是您的订单！");
	            }
		});
		$("#checkSeat_button").html("选座");
	});
	
	//点击确认选座
	$(".checkout-button").click(function(){
		var liLength = $("#curSelected li.oddli").length;
		if(liLength!=tics.length){
			alert("选座数量不对！！！\n"+$("#oughtSelect").html());
			return false;
		}
		var c2=0,c3=0;
		for(var i = 0; i < liLength; i++){
			var inputElement = $("#curSelected li.oddli")[i]; 
			var lid=inputElement.id;
			var num=$("#"+lid).attr("num");
			if(num<=8)c2++;
			else c3++;
        }
		var c1=tics[0].cabinid;
		if((c2!=0&&c3!=0)||(c1==2&&c3!=0)||(c1==3&&c2!=0)){
			alert("所选舱位等级不对！！！\n"+$("#oughtSelect").html());
			return false;
		}
		//封装json
		var json = "["; 
		var keysArr = new Array("ticketid", "executiveflightid","seatid","seatstatus"); 
		for(var i =0;i<liLength;i++){
			json += "{"; 
			json += "\""; //加上一个双引号 
			json += keysArr[0];  
			json += "\""; 
			json += ":";  
			json += "\""; 	 
			json += tics[i].ticketid;
			json += "\""; 	 
			json += ","; 	 
			json += "\""; //加上一个双引号 
			json += keysArr[1];  
			json += "\""; 
			json += ":";  
			json += "\""; 	 
			json += tics[i].ticExecutiveflightid;
			json += "\""; 	 
			json += ","; 	 
			json += "\""; //加上一个双引号 
			json += keysArr[2];  
			json += "\""; 
			json += ":";  
			json += "\""; 	 
			var inputElement = $("#curSelected li.oddli")[i]; 
			var lid=inputElement.id;
			var num=$("#"+lid).attr("num");
			json += num;
			json += "\""; 	 
			json += ",";
			json += "\""; //加上一个双引号 
			json += keysArr[3];  
			json += "\""; 
			json += ":";  
			json += "\""; 	 
			json += null;
			json += "\""; 	 
			json += ",";
			json = json.substring(0, json.length - 1); 	 
			json += "}"; 	 
			json += ","; 
		}
		json = json.substring(0, json.length - 1);  
		json += "]"; 
		//发送请求
		$.ajax({
			url:"${APP_PATH}/orders/insertSeatSelection",
            data:{seatInfo:json},
            type:"POST",
            success:function (result) {
            	if(result.code==100)alert("选座成功！");
            	else alert("手慢了，座位已被选！\n选座失败！");
            	window.location.href ="manage.jsp?page=3";
            }
		})
	});
	
	//初始化已选座位
	function initSeat(seats){
		var len=seats.length;
		for(var i=0;i<len;i++){
			var n=seatTrans(seats[i].seatid);
			console.log(n);
			scc.get(n).status('unavailable');
		}
	}
	
	function seatTrans(num){
		num=num-130;
		var rtn;
		var p2;
		if(num<=8){
			if(num<=4)rtn='1_';
			else rtn='2_';
			if(num==1||num==5)p2='1';else if(num==2||num==6)p2='3';
			else if(num==3||num==7)p2='5';else p2='7';
			rtn=rtn+p2;
		}
		else{
			num=num-9;
			var col=num%6;
			var row=(num-col)/6;
			var pp1=3+row;
			col=col+1;
			if(col>=3)col=col+1;
			rtn=pp1+"_"+col;
		}
		return rtn;
	}
	
	//查询航班动态
	$("#flight_button").click(function(){
		$("#flight_button").html("正在查询...");
		$.ajax({
			url:"${APP_PATH}/find/flightInformation",
            data:{fid:$("#flight_input").val()},
            type:"POST",
            success:function (result) {
            	var fli=result.extend.flightInformations;
            	console.log(fli);
           		var len=fli.length;
            	if(len==0)alert("抱歉，暂未查询到该航班相关信息！");
            	else{
            		$("#p22detail").empty();
            		$('#p21detail').removeClass('in').addClass('hide');
            		$('#p22detail').removeClass('hide').addClass('in');
            		//构建航班信息
            		for(var i=0;i<len;i++){
            			console.log(fli[i]);
            			var date1 = new Date(fli[i].etd);
		        		var h1 = (date1.getHours() < 10) ? ('0' + date1.getHours() ) : (date1.getHours() );
		        		var m1 = (date1.getMinutes() < 10) ? ('0' + date1.getMinutes() ) : (date1.getMinutes() );
		        		var date2 = new Date(fli[i].eta);
		        		var h2 = (date2.getHours() < 10) ? ('0' + date2.getHours()) : (date2.getHours()  );
		        		var m2 = (date2.getMinutes() < 10) ? ('0' + date2.getMinutes() ) : (date2.getMinutes() );
		        		var h3 = h2-h1;
		        		var m3 = m2-m1;
		        		if(m3<0){
		        			m3=m3+60;
		        			h3=h3-1;
		        		}
		        		
		        		var date = new Date(fli[i].etd);
	        			var y = date.getFullYear();
	        	        var MM = date.getMonth() + 1;
	        	        MM = MM < 10 ? ('0' + MM) : MM;
	        	        var d = date.getDate();
	        	        d = d < 10 ? ('0' + d) : d;
	
            			var divt=$("<div></div>").addClass("partTop");
            			var sp1=$("<span></span>").addClass("topText").append("航班#"+fli[i].flightId);
            			var sp2=$("<span></span>").addClass("topText").append(y+"-"+MM+"-"+d);
            			var sp3=$("<span></span>").addClass("topText").append("状态："+fli[i].flightStatus);
            			divt.append(sp1).append(sp2).append(sp3);
            			
            			var divm=$("<div></div>").addClass("partMid");
            			var divmF=$("<div></div>").addClass("fromTime").append(h1+":"+m1);
            			var divmFw=$("<div></div>").addClass("fromWhere").append(fli[i].departurecity.substring(0,2))
            				.append(fli[i].departureAirport);
            			divmF.append(divmFw);
            			var p=$("<p></p>").append(h3+"小时"+m3+"分钟");
            			var sp=$("<span></span>").addClass("glyphicon glyphicon-arrow-right").append(p);
            			
            			var divmT=$("<div></div>").addClass("toTime").append(h2+":"+m2);
            			var divmTw=$("<div></div>").addClass("toWhere").append(fli[i].arrivalcity.substring(0,2))
            				.append(fli[i].arrivalAirport);
            			divmT.append(divmTw);

            			divm.append(divmF).append(sp).append(divmT);
            			$("#p22detail").append(divt).append(divm).append($("<br></br>"));
            		}
            	}
            	$("#flight_button").html("查询");
            }
		});
	});
</script>
</body>
</html>