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
    <link type="text/css" href="${APP_PATH}/static/css/order_style.css" rel="stylesheet"/>
	<script type="text/javascript" src="${APP_PATH}/static/js/tbdValidate.js"></script>
</head>
<body>
<!-- 添加乘机人模态框 -->
<div class="modal fade" id="pasModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加乘机人</h4>
            </div>
            <form class="form-horizontal">
				<div class="modal-body">
                    <div class="form-group">
                        <label for="name_add_input"  class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="passengername" id="name_add_input" placeholder="请输入姓名">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="name_add_text"style="color:red"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="id_add_input"  class="col-sm-2 control-label">身份证号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="passengerid" id="id_add_input" placeholder="请输入身份证号">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="id_add_text"style="color:red"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="tel_add_input"  class="col-sm-2 control-label">手机号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="passengertel" id="tel_add_input" placeholder="请输入手机号">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="tel_add_text"style="color:red"></label>
                        </div>
                    </div>            
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-primary" id="modalBindBtn">添加</button>
	                <button type="reset" class="btn btn-reset">重置</button>
	                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	            </div>			
            </form>
        </div>
    </div>
</div>

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
	<a href="user.jsp?page=2">个人中心 <span class="glyphicon glyphicon-user"></a>
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
		<li class="flight"><span class="glyphicon glyphicon-plane" aria-hidden="true"></span> 1.选择航班</li>
		<li class="order active"id="headP2"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 2.填写订单</li>
		<li class="increment "id="headP3"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 3.增值服务</li>
		<li class="pay "id="headP4"><span class="glyphicon glyphicon-usd" aria-hidden="true"></span> 4.确认并支付</li>
		<li class="end "id="headP5"><span class="glyphicon glyphicon-check" aria-hidden="true"></span> 5.出票完成</li>
	</ul>
	</div>
</div>
</header>

<!-- 中间主要内容 -->
<div class="container"style="margin-top:70px">
	<div id="middle">
		<div id="left"class="col-md-9">
		<!-- 填写订单 -->
		<div class="alert alert-dismissible in"id="p2detail"role="alert">
		    <div class="deepBar">
				<p>乘机人信息</p>
			<div class="partMid">
				<div class="btn-group btns" role="group">
				  <button type="button" class="btn btn-success"id="norAdd"style="width:100px">添加</button>
				  <div class="btn-group" role="group">
				    <button type="button"id="myAdd"class="btn btn-warning dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    	 我的乘机人
				      <span class="caret"></span>
				    </button>
				    <ul class="dropdown-menu">
				    
				    </ul>
				  </div>
				</div>
				
				<div id="pasForm"class="col-md-10 col-md-offset-1">
				<table class="table table-hover table-condensed"id="pasg_table">
					<thead>
					<tr id="ttil">
						<th>姓名</th>
						<th id="tid">身份证号</th>
						<th id="tph">手机号</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody id="ttbod">
						
					</tbody>	
				</table>
				</div>
			</div>
			
			<div class="deepBar">
				<p>联系人信息</p>
				<div class="partMid">
					
				 <input type="text" class="col-sm-6 col-md-offset-3" id="linkName_add_input" placeholder="请输入联系人姓名">
                 <label class="col-sm-6 col-md-offset-6 control-label" id="linkName_add_text"style="color:red"></label>
		
 				 <input type="text" class="col-sm-6 col-md-offset-3" id="linkTel_add_input" placeholder="请输入手机号">
                 <label class="col-sm-6 col-md-offset-6 control-label" id="linkTel_add_text"style="color:red"></label>
				 
				 <button class="btn btn-danger col-md-3 col-md-offset-2" id="preBtn">重新选择航班</button>
				 <button class="btn btn-primary col-md-3 col-md-offset-3" id="linkBtn">下一步</button>
				</div>
			</div>
			
			</div>
		</div>
		<!-- 增值服务 -->
		<div class="alert alert-dismissible hide"id="p3detail"role="alert">
			<div class="deepBar">
				<p>是否购买保险？（20元/份）</p>
				<div class="partMid"style="font-size:20px">
				<br>
				<div class="col-md-1 col-md-offset-3">
				 是<input type="radio" name="issu"value="是"id="issuY"></div>
				 <div class="col-md-1 col-md-offset-4">
				 否<input type="radio" name="issu"value="否"id="issuN">
				</div>
				<br>
				<br>
				 <button class="btn btn-danger col-md-3 col-md-offset-2" id="preBtn2">上一步</button>
				 <button class="btn btn-primary col-md-3 col-md-offset-3" id="linkBtn2">下一步</button>
				</div>
			</div>
		</div>
		<!-- 确认并支付 -->
		<div class="alert alert-dismissible hide"id="p4detail"role="alert">
		<div class="deepBar">
			<p>订单详情</p>
			<div class="partMid"style="font-size:20px">
			<div class="col-md-10 col-md-offset-1 pasForm">
			<table class="table table-hover table-condensed">
				<thead class="costHead">
				<tr>
					<th>细目</th>
					<th class="tid">单价</th>
					<th class="tph">数量</th>
					<th>小计</th>
				</tr>
				</thead>
				<tbody >
					<tr>
						<td>机票</td>
						<td class="ticketP1"></td>
						<td class="ticketC1"></td>
						<td class="ticketA1"></td>
					</tr>
					<tr>
						<td>机场建设费</td>
						<td class="ticketP2">50</td>
						<td class="ticketC2"></td>
						<td class="ticketA2"></td>
					</tr>
					<tr>
						<td>保险费</td>
						<td class="ticketP3">20</td>
						<td class="ticketC3"></td>
						<td class="ticketA3"></td>
					</tr>		
				</tbody>
				<tfoot>
					<tr>
				   	<td></td><td></td>
				     <td>抵用积分</td>
			 	     <td class="subInt"></td>
				   </tr>
				   <tr>
				   	<td></td><td></td>
				     <td>总计</td>
			 	     <td class="totalCost"></td>
				   </tr>	
				</tfoot>
				</table>
				</div>
			<br>
			<button class="btn btn-danger col-md-3 col-md-offset-2" id="preBtn3">上一步</button>
			<button class="btn btn-success col-md-3 col-md-offset-3" id="payBtn">确认支付</button>
			</div>
			</div>
		</div>
		<!-- 出票完成 -->
		<div class="alert alert-dismissible hide"id="p5detail"role="alert">
			<div class="deepBar" id="con5">	
				<img alt="加载中" src="${APP_PATH}/static/images/loading.gif"style="height:100px;width:100px">						
			</div>
			</div>
		</div>
			
		</div>
		<div id="right"class="col-md-3">
			
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

	//下拉菜单
	$(function(){
	    $('ul.nave li.nav-item').hover(function(){
	        $(this).children('div.subMenu').stop().slideToggle(600);
	    })
	})
	//检查是否登录
	<%  if(session.getAttribute("username")==null){%>
			alert("您还未登录！\n请先登录！");
			window.location.href ="login.jsp";	
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
			//我的乘机人下拉框
			$.ajax({
				url:"${APP_PATH}/passenger/findPassenger",
	            type:"POST",
	            data:{id:<%=session.getAttribute("userid")%>},
	            success:function(result){
	            	var pasg = result.extend.passenger;
	            	$.each(pasg,function (index, item) {
	            		var it=item.passenger;
	            		$(".dropdown-menu").append($("<li></li>").append($("<a></a>")
	            				.append(it.passengername).addClass("addLi").attr("pid",it.passengerid)
	            				.attr("pname",it.passengername).attr("ptel",it.passengertel)));
	           		});
	        	}		
			});
		<%}
	%>
	
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
	var f;
	var c;
	var r=0;
	var p=0;
	$(function(){
		f=getQueryString("fli");
		c=getQueryString("cab");
		//获取机票价格
		$.ajax({
			url:"${APP_PATH}/find/findTicketType",
            type:"POST",
            data:{f:f,c:c},
            success:function (result) {
            	r=result.extend.tickType.remainingtickets;
            	p=result.extend.tickType.sellingprice;
            }
		});
	});
	
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
	
	//点击添加乘机人
	$("#norAdd").click(function(){
		//清除表单数据（表单重置）
        $("#pasModal form")[0].reset();
        //弹出模态框
        $("#pasModal").modal({
        	backdrop:"static"
		});	
	});
	
	function validPassenger(){
		tbdValidate(
			regconfigPassenger,
			{
				elesubmit:"modalBindBtn",//提交按钮
				funsubmit:function(){
					if(checkRepeat($("#id_add_input").val())){
						var Tname=$("<td></td>").append($("#name_add_input").val());
						var Tid=$("<td></td>").append($("#id_add_input").val());
						var Ttel=$("<td></td>").append($("#tel_add_input").val());
						var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
	                     .append($("<span></span>").addClass("glyphicon glyphicon-trash"));
						$("<tr></tr>").append(Tname).append(Tid).append(Ttel).append($("<td></td>").append(delBtn))
							.appendTo($("#pasg_table tbody"));
					}
					else alert("该乘机人已添加！");
					$("#pasModal").modal('hide');//关闭模态框
				},
				funerr:function(){//不可提交回调
				},
	            funerrlist:function(errlist){
	                $('#'+ errlist[0]).focus();
	            }	
			}
		);	
	}
	//校验乘机人
	var regconfigPassenger=[
		{eleinput:"name_add_input",eletext:"name_add_text",rule:[{reg:/^.+$/,text:'姓名不能为空'},{reg:/^[\u4e00-\u9fa5]{2,8}/,text:'姓名格式错误'}]},
		{eleinput:"id_add_input",eletext:"id_add_text",rule:[{reg:/^.+$/,text:'身份证号不能为空'},{reg:/^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/,text:'身份证号格式错误 '}]},
		{eleinput:"tel_add_input",eletext:"tel_add_text",rule:[{reg:/^.+$/,text:'手机号不能为空'},{reg:/^1[345789]\d{9}$/,text:'手机号格式错误'}]}
	];
	validPassenger();
	
	//检查重复乘机人
	function checkRepeat(id){
		var tb=document.getElementById("pasg_table");
		var rows=tb.rows;
		var tag=true;
        for(var i=0;i<rows.length-1;i++){    //--循环所有的行
        	var cells=rows[i+1].cells;
			if(cells[1].innerHTML==id){
				tag=false;
				break;
			}
        }
		return tag;
	}
	
	//删除乘机人
	$(document).on("click",".delete_btn",function () {
		 if(confirm("确认删除该乘机人吗？")){
			 var tr=this.parentNode.parentNode;
			 var tb=tr.parentNode;
			 tb.removeChild(tr);
		 }
	});
	
	//从我的乘机人添加
	$(document).on("click",".addLi",function (){
		var pid=$(this).attr("pid");
		var pname=$(this).attr("pname");
		var ptel=$(this).attr("ptel");
		if(checkRepeat(pid)){
			var Tname=$("<td></td>").append(pname);
			var Tid=$("<td></td>").append(pid);
			var Ttel=$("<td></td>").append(ptel);
			var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
             .append($("<span></span>").addClass("glyphicon glyphicon-trash"));
			$("<tr></tr>").append(Tname).append(Tid).append(Ttel).append($("<td></td>").append(delBtn))
				.appendTo($("#pasg_table tbody"));
		}
		else alert("该乘机人已添加！");
	});
	
	var cnt=0;
	function validLinkMan(){
		tbdValidate(
			regconfigLinkMan,
			{
				elesubmit:"linkBtn",//提交按钮
				funsubmit:function(){
					var tb=$("#ttbod");
					var sub=tb.children().length;
					if(sub==0){
						alert("乘机人不能为空！");
					}
					else if(sub>r){
						alert("抱歉，乘机人数超出余票量！");
					}
					else {	//点击下一步（填写完订单）
						cnt=sub;
						$('#p2detail').removeClass('in').addClass('hide');
						$('#p3detail').removeClass('hide').addClass('in');
						$('#headP2').removeClass('active');
						$('#headP3').addClass('active');
					}
				},
				funerr:function(){//不可提交回调
				},
	            funerrlist:function(errlist){
	                $('#'+ errlist[0]).focus();
	            }	
			}
		);	
	}
	//校验联系人
	var regconfigLinkMan=[
		{eleinput:"linkName_add_input",eletext:"linkName_add_text",rule:[{reg:/^.+$/,text:'姓名不能为空'},{reg:/^[\u4e00-\u9fa5]{2,8}/,text:'姓名格式错误'}]},
		{eleinput:"linkTel_add_input",eletext:"linkTel_add_text",rule:[{reg:/^.+$/,text:'手机号不能为空'},{reg:/^1[345789]\d{9}$/,text:'手机号格式错误'}]}
	];
	validLinkMan();
	
	//点击重新选择航班
	$("#preBtn").click(function(){
		window.location.href ="query.jsp";	
	});
	
	//点击重新填写订单
	$("#preBtn2").click(function(){
		$('#p3detail').removeClass('in').addClass('hide');
		$('#p2detail').removeClass('hide').addClass('in');
		$('#headP3').removeClass('active');
		$('#headP2').addClass('active');
	});
	
	var AA1=0;//机票单价
	var AA2=0;//订单总价
	var AA3=0;//保险
	var AA4=0;//抵用积分
	//点击下一步（增值服务完）
	$("#linkBtn2").click(function(){
		if($("#issuY").prop("checked")||$("#issuN").prop("checked")){
			$('#p3detail').removeClass('in').addClass('hide');
			$('#p4detail').removeClass('hide').addClass('in');
			$('#headP3').removeClass('active');
			$('#headP4').addClass('active');	
			
			var A1=cnt*p;
			var A2=cnt*50;
			var A3=0;
			//显示表单费用细目
			$(".ticketP1").html(p);
			$(".ticketA1").html("+"+A1);
			$(".ticketC1").html(cnt);
			$(".ticketC2").html(cnt);
			$(".ticketA2").html("+"+A2);
			if($("#issuY").prop("checked")){
				A3=cnt*20;
				AA3=20;
				$(".ticketC3").html(cnt);
				$(".ticketA3").html("+"+A3);				
			}
			else{
				A3=0;
				$(".ticketC3").html(0);
				$(".ticketA3").html("+"+A3);
			}
			//获取用户积分
			$.ajax({
				url:"${APP_PATH}/users/getUsers",
	            type:"POST",
	            async: false,
	            data:{id:<%=session.getAttribute("userid")%>},
	            success:function (result) {
	            	var user=result.extend.user;
	            	AA4=user.integral;
	            	$(".subInt").html("-"+AA4);
	            }
			});
			AA1=(A1+A2+A3)/cnt;
			AA2=A1+A2+A3-AA4;
			$(".totalCost").html(AA2);
		}
		else alert("请选择！");
	});

	$("#payBtn").click(function(){	
		$("#payBtn").html("加载中...");
		var pasJson=TableToJson("pasg_table");
		console.log(pasJson);
		//生成订单请求
		$.ajax({
			url:"${APP_PATH}/orders/confirmOrder",
            data:{fli:f,cab:c,passenger:pasJson,linkMan:$("#linkName_add_input").val(),
            	linkTel:$("#linkTel_add_input").val(),issu:AA3,userId:<%=session.getAttribute("userid")%>
            	,inte:AA4,rderCost:AA2,ticketCost:AA1},
            type:"POST",
            datatype:"json",
            scriptCharset: 'utf-8',
            success:function (result) {
            	if(result.code==100){
					$('#p4detail').removeClass('in').addClass('hide');
					$('#p5detail').removeClass('hide').addClass('in');
					$('#headP4').removeClass('active');
					$('#headP5').addClass('active');
	            	var map=result.extend.map;
	            	var tiks=map.tickets;
	            	var ord=map.orders;
					//支付成功
					$.ajax({
						url:"${APP_PATH}/orders/payOrder",
			            data:{oid:ord.orderid},
			            type:"POST",
			            async: false,
			            success:function (result) {
			            	alert("支付成功！\n(假装完成了支付)");
			            }
					});     
					//构建出票完成界面
					$("#con5").empty();
		        	$("<p></p>").addClass("orderP").html("订单号#"+ord.orderid).appendTo("#con5");
	        			var div311=$("<div></div>").addClass("col-md-4 col-md-offset-1").append("联系人："+$("#linkName_add_input").val());
	        			var div312=$("<div></div>").addClass("col-md-5 col-md-offset-2").append("联系电话："+$("#linkTel_add_input").val());
	        			var div313=$("<div></div>").addClass("col-md-4 col-md-offset-7").append("总费用："+AA2);
	        		$("<div></div>").addClass("partTop2").append(div311).append(div312).append(div313).appendTo("#con5");
			        //根据订单号构建机票信息
		        	$.ajax({
		        		url:"${APP_PATH}/orders/findTicket/",
		    			type:"POST",
		    			data:{oid:ord.orderid,uid:<%=session.getAttribute("userid")%>},
		    			success:function(result){
		    				var tids=result.extend.ticketId;
		    				 $.each(tids,function (idx, it) {
		    					 $.ajax({
		    						url:"${APP_PATH}/orders/getInformation/",
		   			    			type:"POST",
		   			    			data:{tid:it},
		   			    			success:function(result){
		   			    				var fli=result.extend.map.flightInformation;
		   			    				var pas=result.extend.map.passenger;
		   			    				var cab=result.extend.map.cabin;
		   			    				var date1 = new Date(fli.etd);
						        		var h1 = (date1.getHours() < 10) ? ('0' + date1.getHours() ) : (date1.getHours() );
						        		var m1 = (date1.getMinutes() < 10) ? ('0' + date1.getMinutes() ) : (date1.getMinutes() );
						        		var date2 = new Date(fli.eta);
						        		var h2 = (date2.getHours() < 10) ? ('0' + date2.getHours()) : (date2.getHours()  );
						        		var m2 = (date2.getMinutes() < 10) ? ('0' + date2.getMinutes() ) : (date2.getMinutes() );
						        		var h3 = h2-h1;
						        		var m3 = m2-m1;
						        		if(m3<0){
						        			m3=m3+60;
						        			h3=h3-1;
						        		}
						        		var y1 = date1.getFullYear();
					        	        var MM1 = date1.getMonth() + 1;
					        	        MM1 = MM1 < 10 ? ('0' + MM1) : MM1;
					        	        var d1 = date1.getDate();
					        	        d1 = d1 < 10 ? ('0' + d1) : d1;
					        	        
		   			    				var div30t=$("<div></div>").addClass("partTop");
			   			        			var sp301=$("<span></span>").addClass("topText").append(pas.passengername);
			   			        			var sp302=$("<span></span>").addClass("topText").append("航班#"+fli.flightId);
			   			        			var sp303=$("<span></span>").addClass("topText").append(cab.cabinlevel);
			   			        			var sp304=$("<span></span>").addClass("topText").append("机票#"+it);
			   			        			var sp306=$("<span></span>").addClass("topText").append(y1+"-"+MM1+"-"+d1);
			   			        			var sp307=$("<span></span>").addClass("topText").append(pas.passengertel);
			   			        		div30t.append(sp302).append(sp304).append(sp306).append(sp303).append(sp301).append(sp307);
		   			        			var div30m=$("<div></div>").addClass("partMid");
		   			        			var div30mf=$("<div></div>").addClass("fromTime");
						        			var fromW=$("<div></div>").addClass("fromWhere").append(fli.departurecity.substring(0,fli.departurecity.length-1))
						        				.append(fli.departureAirport);
		   			        			div30mf.append(h1).append(":").append(m1).append(fromW);
		   			        				var costT=$("<p></p>").append(h3+"小时"+m3+"分钟");
		   				        	    var spMid=$("<span></span>").addClass("glyphicon glyphicon-arrow-right").append(costT);
		   				        			var toW=$("<div></div>").addClass("toWhere").append(fli.arrivalcity.substring(0,fli.arrivalcity.length-1))
		   				        				.append(fli.arrivalAirport);
		   				        	    var div30mt=$("<div></div>").addClass("toTime").append(h2+":"+m2).append(toW);
		   				        	 	div30m.append(div30mf).append(spMid).append(div30mt);
		   				        	 	$("#con5").append(div30t).append(div30m); 		   			    			
			   			    			}
			    					 });
		    				 });
		    				$("#payBtn").html("确认支付");
		    			}
		        	});       	
            	}
            	else{
            		alert(result.extend.msg);
            		$("#payBtn").html("确认支付");            		
            	}
            }
		});
	});
	
	
	var keysArr = new Array("passengername", "passengerid","passengertel"); 
	 
	function TableToJson(tableid) { //tableid是你要转化的表的表名，是一个字符串，如"example" 
		var rows = document.getElementById(tableid).rows.length; //获得行数(包括thead) 
		var colums = document.getElementById(tableid).rows[0].cells.length-1; //获得列数 
		var json = "["; 
		var tdValue; 
		for (var i = 1; i < rows; i++) { //每行 
			json += "{"; 
			for (var j = 0; j < colums; j++) { 
				tdName = keysArr[j]; //Json数据的键 
				json += "\""; //加上一个双引号 
				json += tdName;  
				json += "\""; 
				json += ":";  
				tdValue = document.getElementById(tableid).rows[i].cells[j].innerHTML;//Json数据的值  
				json += "\""; 	 
				json += tdValue; 	 
				json += "\""; 	 
				json += ","; 	 
			} 	 
			json = json.substring(0, json.length - 1); 	 
			json += "}"; 	 
			json += ",";  
		} 	 
		json = json.substring(0, json.length - 1);  
		json += "]"; 	 
		return json; 
	} 

	//点击上一步（确认并支付）
	$("#preBtn3").click(function(){
		$('#p4detail').removeClass('in').addClass('hide');
		$('#p3detail').removeClass('hide').addClass('in');
		$('#headP4').removeClass('active');
		$('#headP3').addClass('active');
	});

</script>
</body>
</html>