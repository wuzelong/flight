<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!-- 引入jquery样式 -->
	<link rel="icon" href="images/myLogo.png" type="images/x-ico" />
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link type="text/css" href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/base_style.css" rel="stylesheet"/>
	<link type="text/css" href="${APP_PATH}/static/css/user_style.css" rel="stylesheet"/>
	<script type="text/javascript" src="${APP_PATH}/static/js/tbdValidate.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/verify.js"></script>
	<link type="text/css" href="${APP_PATH}/static/css/verify.css"rel="stylesheet"/>
	<script type="text/javascript" src="${APP_PATH}/static/js/j.suggest.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/j.dimensions.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/aircity.js"></script>
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
           		<div id="mpanel5"></div>
            </form>
        </div>
    </div>
</div>

<!-- 绑定乘机人模态框 -->
<div class="modal fade" id="pasModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">绑定乘机人</h4>
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

<!-- 新增/修改航班模态框 -->
<div class="modal fade" id="fliInModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >更新航班</h4>
            </div>
            <form class="form-horizontal">
				<div class="modal-body">
                    <div class="form-group">
                        <label for="fid_add_input"  class="col-sm-2 control-label">航班号：</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="flightid" id="fid_add_input" placeholder="请输入航班号">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="fid_add_text"style="color:red"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="fw_add_input"  class="col-sm-2 control-label">出发地</label>
                        <div class="col-sm-10">
	                    	<div id='suggest' class="ac_results"></div>
                            <input type="text" class="form-control" name="frowCity" id="fw_add_input" placeholder="请输入出发地">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="fw_add_text"style="color:red"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="ft_add_input"  class="col-sm-2 control-label">预计出发</label>
                        <div class="col-sm-10">
                            <input type="time" class="form-control" name="planneddeparturettime" id="ft_add_input2">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="ft_add_text"style="color:red"></label>
                        </div>
                    </div>     
                    <div class="form-group">
                        <label for="tw_add_input"  class="col-sm-2 control-label">目的地</label>
                        <div class="col-sm-10">
	                    	<div id='suggest2' class="ac_results"></div>
                            <input type="text" class="form-control" name="toCity" id="tw_add_input" placeholder="请输入目的地">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="fw_add_text"style="color:red"></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="tt_add_input"  class="col-sm-2 control-label">预计到达</label>
                        <div class="col-sm-10">
                            <input type="time" class="form-control" name="plannedarrivaltime" id="tt_add_input2">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="tt_add_text"style="color:red"></label>
                        </div>
                    </div>   
                    <div class="form-group">
                        <label for="price_add_input"  class="col-sm-2 control-label">定价</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="plannedarrivaltime" id="price_add_input" placeholder="请输入定价">
                            <label class="col-sm-8 col-md-offset-4 control-label" id="price_add_text"style="color:red"></label>
                        </div>
                    </div>         
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-primary" id="modalIndBtn">确认</button>
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
			  <li role="presentation"id="p1"><a id="pp1"href="user.jsp?page=1">我的账户</a></li>
			  <li role="presentation"id="p2"><a href="user.jsp?page=2">我的订单</a></li>
			  <li role="presentation"id="p3"><a href="user.jsp?page=3">我的乘机人</a></li>
			</ul>
			</div>
			
			<!-- 文本内容 -->
			<div id="content"class="col-md-9">
				<div id="titles"></div>	
				<div id="freshArea">
				<!-- 我的账户 -->
				<div class="alert alert-dismissible hide"id="p1detail"role="alert">
				  	<form id="userForm" class="form-group">
				  		<input type="hidden"name="userid"id="p1userid"value=<%=session.getAttribute("userid")%>>
				  		账号：<input type="text"class="form-control ipt"id="p1id"name="loginid"readonly="readonly"value="账号"/>
				  		用户名:<input type="text"class="form-control ipt"id="p1name"name="username"value="用户名"/>
					  	<label class="col-sm-8 col-md-offset-4 control-label" id="reg_name_text"style="color:red"></label>
					  	密码：<input type="password"class="form-control ipt"id="p1pwd"name="password"value="密码"/>
					  	<label class="col-sm-8 col-md-offset-4 control-label" id="reg_password_text"style="color:red"></label>
					  	年龄：<input type="text"class="form-control ipt"id="p1age"name="userage"value="年龄"/>
					  	性别：
					  	<div class="form-control ipt">
					  	男<input type="radio"id="p1sex1"name="usersex"value="男"/>
	     				女<input type="radio"id="p1sex0"name="usersex"value="女"/>
					  	</div>
					  	积分：<input type="text"class="form-control ipt"id="p1int"name="integral"readonly="readonly"value="积分"/>
				  	</form>
					<button class="btn btn-success upd"id="reg_submit">修改</button>
				  	
				</div>
				
				<!-- 我的订单 -->
				<div class="alert alert-dismissible hide"id="p2detail"role="alert">
				  	<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
					  <img alt="加载中" src="${APP_PATH}/static/images/loading.gif"style="height:100px;width:100px">
					</div>
					<div class="row">
						<!-- 分页文字信息 -->
						<div class="col-md-5" id="page_info_area"></div>
						<!-- 分页条信息 -->
						<div class="col-md-7" id="page_nav_area">
							
						</div>
					</div>
				</div>
				
				<!-- 我的乘机人-->
				<div class="alert alert-dismissible hide"id="p3detail"role="alert">
					<div class="col-md-offset-9">
					<button type="button" class="btn btn-warning"id="bindBtn">
					  <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
					绑定乘机人</button></div><br>
					<table class="table table-hover table-condensed"id="pasg_table">
					<thead>
					<tr id="ttil">
						<th>姓名</th>
						<th id="tid">身份证号</th>
						<th id="tph">手机号</th>
						<th>信用状态</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody>
						<tr>
						<td>
						<img alt="加载中" src="${APP_PATH}/static/images/loading.gif"
						style="height:50px;width:50px;margin-left:220px">
						</td></tr>
					</tbody>	
					</table>
			
				</div>

				<!-- 后台管理 -->
				<div class="alert alert-dismissible hide"id="p5detail"role="alert">
					<div class="row">
					<button class="btn btn-primary col-md-2"id="all_button">显示全部</button>
					<button class="btn btn-success col-md-2"id="insert_button">新增</button>
					
					<input type="text" placeholder="请输入航班号"class="col-md-3 col-md-offset-3"id="search_input"/>
					<button class="btn btn-info col-md-2"id="search_button">查找</button>
					</div>
					<br style="clear:both;">
					<div class="partMid"style="height: 725px;">
						<table class="table table-hover" id="flightTable">
						<thead>
							<tr>
								<th>航班</th>
								<th>出发地</th>
								<th>预计出发</th>
								<th>目的地</th>
								<th>预计到达</th>
								<th>定价</th>
							</tr>
						</thead>
						<tbody id="flightBody">
						
						</tbody>
						</table>
						<br style="clear:both;">
					</div>
					<br style="clear:both;">
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
		<%}
	%>

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
			if(p=='1'){	//显示账户修改前信息
				//请求数据
				$.ajax({
					url:"${APP_PATH}/users/getUsers",
		            type:"POST",
		            data:{id:<%=session.getAttribute("userid")%>},
		            success:function (result) {
		            	var user=result.extend.user;
		            	$("#p1id").val(user.loginid);
		            	$("#p1name").val(user.username);
		            	$("#p1pwd").val(user.password);
		            	$("#p1age").val(user.userage);
		            	$("#p1int").val(user.integral);
		            	if(user.usersex!=null){
			            	if("男"==user.usersex)$("#p1sex1").attr("checked","checked");
			            	else $("#p1sex0").attr("checked","checked");		            		
		            	}
		            }
				});
				var ad=<%=session.getAttribute("admin")%>;
				if(ad==null||ad==""){
				}
				else{
					$("#pp1").html("后台管理");
					$("#pp1").attr("href","user.jsp?page=5");
					$('#p5detail').removeClass('hide').addClass('in');
					$('#p1detail').removeClass('in').addClass('hide');
				}
			}
			else if(p=='2'){
				 to_page(1);//去我的订单第一页
				 var ad=<%=session.getAttribute("admin")%>;
				if(ad==null||ad==""){
				}
				else{
					$("#pp1").html("后台管理");
					$("#pp1").attr("href","user.jsp?page=5");
				}
			}
			else if(p=='3'){
				//请求我的乘机人数据
				$.ajax({
					url:"${APP_PATH}/passenger/findPassenger",
		            type:"POST",
		            data:{id:<%=session.getAttribute("userid")%>},
		            success:function(result){
		            	$("#pasg_table tbody").empty();
		            	var pasg = result.extend.passenger;
		            	$.each(pasg,function (index, item) {
		            		 var it=item.passenger;
		            		 var tn=$("<td></td>").append(it.passengername);
		            		 var ti=$("<td></td>").append(it.passengerid);
		            		 var tt=$("<td></td>").append(it.passengertel);
		            		 var tc=$("<td></td>").append(it.creditstatus);
		            		 var delBtn = $("<button></button>").addClass("btn btn-danger delete_btn")
		                     .append($("<span></span>").addClass("glyphicon glyphicon-trash"));
			                 //为删除按钮添加属性表示id
			                 delBtn.attr("del_id",it.passengerid);
			                 $("<tr></tr>").append(tn).append(ti).append(ti).append(tt).append(tc)
			                 	.append($("<td></td>").append(delBtn)).appendTo("#pasg_table tbody");		            		
		           		});
		        	}		
				});
				var ad=<%=session.getAttribute("admin")%>;
				if(ad==null||ad==""){
				}
				else{
					$("#pp1").html("后台管理");
					$("#pp1").attr("href","user.jsp?page=5");
				}
			}
			else{//后台管理
				var ad=<%=session.getAttribute("admin")%>;
				if(ad==null||ad==""){
					alert("您无操作权限！");
					window.location.href ="index.jsp";
				}
				else{
					$("#titles").html("后台管理");
					$("#pp1").html("后台管理");
					$("#pp1").attr("href","user.jsp?page=5");
					showAllFlights();			
				}
			}
		}
	});
	function validUser(){
		tbdValidate(
			regconfigUser,
			{
				elesubmit:"reg_submit",//提交按钮
				funsubmit:function(){
					//验证码
					//清除表单数据（表单重置）
			        $("#msgModal form")[0].reset();
			        //弹出模态框
			        $("#msgModal").modal({
			        	backdrop:"static"
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
	//校验用户修改
	var regconfigUser=[
			{eleinput:"p1pwd",eletext:"reg_password_text",rule:[{reg:/^.+$/,text:'密码不能为空'},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]},
			{eleinput:"p1name",eletext:"reg_name_text",rule:[{reg:/^.+$/,text:'用户名不能为空'},{reg:/^.{2,6}$/,text:'用户名在2-6位之间'}]}
			
			];
	validUser();
	
	//用户修改验证
    $('#mpanel5').pointsVerify({
    	defaultNum : 4,	//默认的文字数量
    	checkNum : 2,	//校对的文字数量
    	vSpace : 5,	//间隔
    	imgName : ['check1.jpeg', 'check2.jpeg','check3.jpg'],
    	imgSize : {
        	width: '400px',
        	height: '200px',
        },
        barSize : {
        	width : '400px',
        	height : '40px',
        },
        ready : function() {
    	},
        success : function() {
        	$("#reg_submit").html("正在修改...");
			//发送修改用户请求
			$.ajax({
				url:"${APP_PATH}/users/updateUser",
	            type:"POST",
	            data:$("#p1detail form").serialize(),//表单信息序列化
	            success:function (result) {
	            	if(result.code==100){
       	            	alert("修改成功！");
   						window.location.href="${APP_PATH}/user.jsp?page=1";
            		}
	            	else{
	            		alert("修改失败！");
	            		$("#reg_submit").html("修改");	            		
	            	} 
                }
			});
        	$("#msgModal").modal('hide');//关闭模态框
        },
        error : function() {
        	$("#msgModal").modal('hide');//关闭模态框
        } 
    });
	
	//点击绑定乘机人
	$("#bindBtn").click(function(){
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
					$("#modalBindBtn").html("正在添加...");
					//发送绑定请求
					$.ajax({
						url:"${APP_PATH}/passenger/binding/"+<%=session.getAttribute("userid")%>,
						type:"POST",
						data:$("#pasModal form").serialize(),
						success:function(result){
							if(result.code==100){
								alert("添加成功！");
								$("#pasModal").modal('hide');//关闭模态框
								window.location.href="${APP_PATH}/user.jsp?page=3";
							}
							else{
								alert("添加失败！");
								$("#pasModal").modal('hide');//关闭模态框
								$("#modalBindBtn").html("添加");
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
	//校验乘机人
	var regconfigPassenger=[
		{eleinput:"name_add_input",eletext:"name_add_text",rule:[{reg:/^.+$/,text:'姓名不能为空'},{reg:/^[\u4e00-\u9fa5]{2,8}/,text:'姓名格式错误'}]},
		{eleinput:"id_add_input",eletext:"id_add_text",rule:[{reg:/^.+$/,text:'身份证号不能为空'},{reg:/^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/,text:'身份证号格式错误 '}]},
		{eleinput:"tel_add_input",eletext:"tel_add_text",rule:[{reg:/^.+$/,text:'手机号不能为空'},{reg:/^1[345789]\d{9}$/,text:'手机号格式错误'}]}
	];
	validPassenger();
	
	//解绑乘机人
    $(document).on("click",".delete_btn",function () {
       //1、弹出确认删除对话框
        var pasId = $(this).attr("del_id");
        if(confirm("确认解除绑定该乘机人吗？")){
            //发送ajax请求删除
            $.ajax({
                url:"${APP_PATH}/passenger/deletebinding/",
                type:"post",
                data:{uid:<%=session.getAttribute("userid")%>,pid:pasId},
                success:function (result) {
                    alert("删除成功！");
                    window.location.href="${APP_PATH}/user.jsp?page=3";
                }
            })
        }
    });
	
    function to_page(pn) {
		//请求我的订单数据
		$.ajax({
			url:"${APP_PATH}/orders/myOrders/",
			type:"POST",
			data:{uid:<%=session.getAttribute("userid")%>,page:pn},
			success:function(result){
				//1、解析并显示信息
                build_pros_table(result);
                //2、解析并显示分页信息
                build_page_info(result);
                //3、解析显示分页条
                build_page_nav(result);
			}
		});
    };
    
    function build_pros_table(result) {
    	$("#accordion").empty();
        var pros = result.extend.pageInfo.list;
        $.each(pros,function (index, item) {
        	
        	var div1=$("<div></div>").addClass("panel panel-info");
        	var div2=$("<div></div>").addClass("panel-heading").attr("role","tab").attr("id","heading"+index);
        		var h4=$("<h4></h4>").addClass("panel-title");
        		var a=$("<a></a>").attr("role","button").attr("data-toggle","collapse").attr("data-parent","#accordion")
        			.attr("href","#collapse"+index).attr("aria-expanded","false").attr("aria-controls","collapse"+index)
        			.addClass("collapsed");
        		var date = new Date(item.createtime);
        			var y = date.getFullYear();
        	        var MM = date.getMonth() + 1;
        	        MM = MM < 10 ? ('0' + MM) : MM;
        	        var d = date.getDate();
        	        d = d < 10 ? ('0' + d) : d;
        		var em=$("<em></em>").addClass("topP").append(y+"-"+MM+"-"+d);
        	div2.append(h4).append(a.html("订单号#"+item.orderid).append(em));
        	var div3=$("<div></div>").attr("id","collapse"+index).addClass("panel-collapse collapse").attr("role","tabpanel")
        		.attr("aria-labelledby","heading"+index);
        		var div31=$("<div></div>").addClass("panel-body");
        		
        		var div311=$("<div></div>").addClass("col-md-4 col-md-offset-1").append("联系人："+item.linkman);
        		var div312=$("<div></div>").addClass("col-md-5 col-md-offset-2").append("联系电话："+item.telephone);
        		var div313=$("<div></div>").addClass("col-md-4 col-md-offset-7").append("总费用："+item.totalcost);
        	
        		var div31top=$("<div></div>").addClass("partTop2").append(div311).append(div312).append(div313);
        		div3.append(div31.append(div31top));
	        	div1.append(div2).append(div3).appendTo("#accordion");
        	//根据订单号构建机票信息
        	$.ajax({
        		url:"${APP_PATH}/orders/findTicket/",
    			type:"POST",
    			data:{oid:item.orderid,uid:<%=session.getAttribute("userid")%>},
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
	   			        			var sp301=$("<span></span>").addClass("topText22").append(pas.passengername);
	   			        			var sp303=$("<span></span>").addClass("topText").append(cab.cabinlevel);
	   			        			var sp304=$("<span></span>").addClass("topText").append("机票#"+it);
	   			        			var sp305=$("<span></span>").addClass("topText").append("航班#"+fli.flightId);
   			        				var sp306=$("<span></span>").addClass("topText").append(y1+"-"+MM1+"-"+d1);
	   			        			var sp307=$("<span></span>").addClass("topText22").append(pas.passengertel);
   			        			div30t.append(sp305).append(sp304).append(sp303).append(sp306).append(sp301).append(sp307);
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
   				        	 	div31.append(div30t).append(div30m); 
   			    			}
    					 });
    				 });
    			}
        	});       	
        });
    }
    
    //解析构建显示分页信息
    function build_page_info(result) {
        //先清空
        $("#page_info_area").empty();
        $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页，总"+
            result.extend.pageInfo.pages+"页，共"+
            result.extend.pageInfo.total+"条记录");
        totalRecord = result.extend.pageInfo.total;
        //更新商品信息后，需返回显示当前页
        currentPage = result.extend.pageInfo.pageNum;
    }
    
    //解析构建分页条信息，点击进行跳转下一页
    function build_page_nav(result) {
        //page_nav_area
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");

        //构建元素
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else {
            //为元素添加翻页事件
           	var condition=$("#pro_search_test").val();
            firstPageLi.click(function () {
            	to_page(1);        		
            });
            prePageLi.click(function () {
				to_page(result.extend.pageInfo.pageNum -1);            	          		
            });
        }

        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        if (result.extend.pageInfo.hasNextPage == false) {
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else {
            nextPageLi.click(function () {
            	to_page(result.extend.pageInfo.pageNum +1);            		          	
            });
            lastPageLi.click(function () {
            	to_page(result.extend.pageInfo.pages);            		         		
            });
        }

        //页码
        ul.append(firstPageLi).append(prePageLi);
        $.each(result.extend.pageInfo.navigatepageNums,function (index, item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            numLi.click(function () {
            	to_page(item);            		          		
            });
            ul.append(numLi);
        });

        ul.append(nextPageLi).append(lastPageLi);

        //把ul加入到nav
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }
    var type=1;
    //后台管理->查询航班
    $("#search_button").click(function(){
    	$.ajax({
    		url:"${APP_PATH}/flight/findFlight/",
    		type:"POST",
    		data:{fid:$("#search_input").val()},
    		success:function(result){
    			var rlt=result.extend.flight2;
    			$("#flightBody").empty();
    			if(rlt==null){
    				$("#flightBody").append($("<tr></tr>").append("未查询到该航班相关信息！"));
    				return false;
    			}
    			var date1 = new Date(rlt.planneddeparturettime);
        		var h1 = (date1.getHours() < 10) ? ('0' + date1.getHours() ) : (date1.getHours() );
        		var m1 = (date1.getMinutes() < 10) ? ('0' + date1.getMinutes() ) : (date1.getMinutes() );
        		var date2 = new Date(rlt.plannedarrivaltime);
        		var h2 = (date2.getHours() < 10) ? ('0' + date2.getHours()) : (date2.getHours()  );
        		var m2 = (date2.getMinutes() < 10) ? ('0' + date2.getMinutes() ) : (date2.getMinutes() );
    	        
				var td1=$("<td></td>").append($("<a></a>").addClass("fliA").append(rlt.flightid));
				var td2=$("<td></td>").append(rlt.departurecity.substring(0,rlt.departurecity.length-1));
				var td3=$("<td></td>").append(h1+":"+m1);
				var td4=$("<td></td>").append(rlt.arrivalcity.substring(0,rlt.arrivalcity.length-1));
				var td5=$("<td></td>").append(h2+":"+m2);
				var td6=$("<td></td>").append(rlt.pricing);
				$("#flightBody").append($("<tr></tr>").append(td1).append(td2)
						.append(td3).append(td4).append(td5).append(td6));
    		}
    	});
    });
    
    //后台管理->点击显示全部
    $("#all_button").click(function(){
    	 showAllFlights();
    });
    
    //显示全部航班
    function showAllFlights(){
    	$("#flightBody").empty();
    	$.ajax({
    		url:"${APP_PATH}/flight/getAllFlight/",
    		success:function(result){
    			var lis=result.extend.flight2s;
    			var len=lis.length;
    			for(var i=0;i<len;i++){
    				var date1 = new Date(lis[i].planneddeparturettime);
	        		var h1 = (date1.getHours() < 10) ? ('0' + date1.getHours() ) : (date1.getHours() );
	        		var m1 = (date1.getMinutes() < 10) ? ('0' + date1.getMinutes() ) : (date1.getMinutes() );
	        		var date2 = new Date(lis[i].plannedarrivaltime);
	        		var h2 = (date2.getHours() < 10) ? ('0' + date2.getHours()) : (date2.getHours()  );
	        		var m2 = (date2.getMinutes() < 10) ? ('0' + date2.getMinutes() ) : (date2.getMinutes() );
        		
    				var td1=$("<td></td>").append($("<a></a>").addClass("fliA").append(lis[i].flightid));
    				var td2=$("<td></td>").append(lis[i].departurecity.substring(0,lis[i].departurecity.length-1));
    				var td3=$("<td></td>").append(h1+":"+m1);
    				var td4=$("<td></td>").append(lis[i].arrivalcity.substring(0,lis[i].arrivalcity.length-1));
    				var td5=$("<td></td>").append(h2+":"+m2);
    				var td6=$("<td></td>").append(lis[i].pricing);
    				$("#flightBody").append($("<tr></tr>").append(td1).append(td2)
    						.append(td3).append(td4).append(td5).append(td6));
    			}
    		}
    	});
    }
   	//后台管理->点击新增航班按钮
   	$("#insert_button").click(function(){
   		type=1;
   		$("#fliInModal form")[0].reset();
        //弹出模态框
        $("#fliInModal").modal({
        	backdrop:"static"
		});	
   	});
   	
   	//新增航班模态框->点击确认
   	$("#modalIndBtn").click(function (){
   		var t1="2020-06-26 "+$("#ft_add_input2").val()+":00";
       	var t2="2020-06-26 "+$("#tt_add_input2").val()+":00";
   		var keysArr = new Array("flightid", "planneddeparturettime","plannedarrivaltime","pricing");
   		var json="{";
   		
		json += "\""; //加上一个双引号 
		json += keysArr[0];
		json += "\""; 
		json += ":";  
		json += "\""; 	 
		json += $("#fid_add_input").val(); 	 
		json += "\""; 	 
		json += ","; 	
		
		json += "\""; //加上一个双引号 
		json += keysArr[1];
		json += "\""; 
		json += ":";  
		json += "\""; 	 
		json += t1; 	 
		json += "\""; 	 
		json += ","; 
		
		json += "\""; //加上一个双引号 
		json += keysArr[2];
		json += "\""; 
		json += ":";  
		json += "\""; 	 
		json += t2; 
		json += "\""; 	 
		json += ","; 
		
		json += "\""; //加上一个双引号 
		json += keysArr[3];
		json += "\""; 
		json += ":";  
		json += "\""; 	 
		json += $("#price_add_input").val(); 	 
		json += "\""; 	 
		json += "}"; 
		var fw=$("#fw_add_input").val();
   		var tw=$("#tw_add_input").val();
   		if(type==1){//新增
    		$.ajax({
    			url:"${APP_PATH}/flight/insertFlight/",
    			type:"POST",
    			datatype:"json",
                scriptCharset: 'utf-8',
    			data:{flight1:json,cityName1:fw,cityName2:tw},
    			success:function(result){
    				if(result.code==100){
    					alert("新增成功！");
	    				$("#fliInModal").modal('hide');//关闭模态框
	    				showAllFlights();
    				}
    				else{
						alert("该航班号已存在！\n新增失败！"); 					
    				}
    			}			
    		});    			
   		}
   		else{//修改
   			$.ajax({
    			url:"${APP_PATH}/flight/updateFlight/",
    			type:"POST",
    			datatype:"json",
                scriptCharset: 'utf-8',
    			data:{flight1:json,cityName1:fw,cityName2:tw},
    			success:function(result){
    				if(result.code==100){
    					alert("修改成功！");
	    				$("#fliInModal").modal('hide');//关闭模态框
	    				showAllFlights();
    				}
    				else{
						alert("该航班号已存在！\n修改失败！"); 					
    				}
    			}			
    		}); 
   		
   		}
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
		$("#ft_add_input1").attr("min",year+"-"+month+"-"+date);
		$("#ft_add_input2").attr("min",year+"-"+month+"-"+date);
	})
  
	//城市选择
	$(function(){
		$("#fw_add_input").suggest(citys,{hot_list:commoncitys,attachObject:"#suggest"});
		
		$("#tw_add_input").suggest(citys,{hot_list:commoncitys,attachObject:"#suggest2"});

	});
  	
  	//点击航班好链接->修改航班
  	$(document).on("click",".fliA",function (){
  		type=2;
		$("#fliInModal form")[0].reset();
		//填充数据
		var fidd=$(this).html();
		$.ajax({
    		url:"${APP_PATH}/flight/findFlight/",
    		type:"POST",
    		data:{fid:fidd},
    		success:function(result){
    			var rlt=result.extend.flight2;

    			var date1 = new Date(rlt.planneddeparturettime);
        		var h1 = (date1.getHours() < 10) ? ('0' + date1.getHours() ) : (date1.getHours() );
        		var m1 = (date1.getMinutes() < 10) ? ('0' + date1.getMinutes() ) : (date1.getMinutes() );
        		var date2 = new Date(rlt.plannedarrivaltime);
        		var h2 = (date2.getHours() < 10) ? ('0' + date2.getHours()) : (date2.getHours()  );
        		var m2 = (date2.getMinutes() < 10) ? ('0' + date2.getMinutes() ) : (date2.getMinutes() );
    	        
    	        $("#fid_add_input").val(rlt.flightid);
    	        $("#fw_add_input").val(rlt.departurecity.substring(0,rlt.departurecity.length-1));
    	        $("#ft_add_input2").val(h1+":"+m1);
    	        $("#tw_add_input").val(rlt.arrivalcity.substring(0,rlt.arrivalcity.length-1));
    	        $("#tt_add_input2").val(h2+":"+m2);
    	        $("#price_add_input").val(rlt.pricing);
    		}
    	});
        //弹出模态框
        $("#fliInModal").modal({
        	backdrop:"static"
		});	
  	});
  	
  	//到达时间大于出发时间约束
  	$("#ft_add_input2").change(function (){
  		var v=$("#ft_add_input2").val();
  		$("#tt_add_input2").val($("#ft_add_input2").val());
  	});
  	$("#tt_add_input2").change(function (){
  		var v1=$("#ft_add_input2").val();
  		var v2=$("#tt_add_input2").val();
  		var h1=v1.substring(0,2);
  		var h2=v2.substring(0,2);
  		if(h1<h2)return false;
  		var m1=v1.substring(3,5);
  		var m2=v2.substring(3,5);
  		if(h1==h2&&m1<=m2)return false;
  		alert("到达时间不得早于出发时间！！！");
  		$("#tt_add_input2").val(v1);
  	});
</script>
</body>
</html>