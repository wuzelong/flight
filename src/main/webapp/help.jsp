<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出行帮助</title>
<%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!-- 引入jquery样式 -->
	<link rel="icon" href="images/myLogo.png" type="images/x-ico" />
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link type="text/css" href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
    <link type="text/css" href="${APP_PATH}/static/css/base_style.css" rel="stylesheet"/>
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
			  <li role="presentation"id="p1"><a href="help.jsp?page=1">座位布局图</a></li>
			  <li role="presentation"id="p2"><a href="help.jsp?page=2">危险品运输规定</a></li>
			  <li role="presentation"id="p3"><a href="help.jsp?page=3">防短信诈骗</a></li>
			  <li role="presentation"id="p4"><a href="help.jsp?page=4">航班不正常服务</a></li>
			  <li role="presentation"id="p5"><a href="help.jsp?page=5">中国72/144小时过境免签政策</a></li>
			</ul>
			</div>
			
			<!-- 文本内容 -->
			<div id="content"class="col-md-9">
				<div id="titles"></div>	
				<div id="freshArea">
				<!-- 座位布局 (js) -->
				<!-- 危险品运输规定 -->
				<div class="alert alert-dismissible hide"id="p2detail"role="alert">
				  	根据《中华人民共和国民用航空法》第一百零一条规定“禁止以非危险品品名托运危险品。 禁止旅客随身携带危险品乘坐民用航空器“。除因执行公务并按照国家规定经过批准外，禁止旅客携带枪支、管制刀具乘坐民用航空器。禁止违反国务院民用航空主管部门的规定将危险品作为行李托运，隐匿携带的乘坐民用航空器造成后果的，将比照刑法追究刑事责任。';
					<br><br><strong>一、旅客的托运行李和随身携带物品中，不得包含以下危险物品：</strong>
            		<br>1） 爆炸物品，包括弹药、爆破器材和烟火制品等（经承运人同意，限于体育运动用的小型枪械的弹药除外）。
            		<br>2） 气体，包括氢气、氧气、丁烷等瓶装压缩气体、液化气体等。
            		<br>3） 易燃液体，如汽油、煤油、柴油、苯、乙醇（酒精）、油漆、松香油等。
            		<br>4） 易燃固体、自燃物质和遇水释放易燃气体的物质，如火柴、闪光粉、固体酒精、赛璐珞等易燃固体；黄磷、白磷、硝化纤维（含胶片）、油纸及其制品等自燃物品；金属钠、钾、碳化钙（电石）、镁铝粉等遇水燃烧物品。
            		<br>5） 氧化物质及有机过氧化物，包括过氧化钠、过氧化钾、过氧化铅、过醋酸等各种无机、有机氧化剂。
            		<br>6） 有毒物质及有传染性的物质，包括氰化物、剧毒农药等剧毒物品。
            		<br>7） 放射性物质，如放射性同位素等放射性物品。
            		<br>8） 腐蚀性物质，包括硫酸、盐酸、硝酸、有液蓄电池、氢氧化钠、氢氧化钾等。
            		<br>9） 国际民航组织的《危险物品安全航空运输技术细则》中列出的其它危害飞行安全的物品，如可能干扰飞机上各种仪表正常工作的强磁化物、有强烈刺激性气味的物品等。
            		<br>10） 国家法律法规规定的其他禁止携带、运输的物品。
            		<br><br><strong>二、作为行李运输的锂电池的规定：</strong>
            		<br>对于锂含量不超过2g的锂金属电池和额定能量不超过100Wh的锂离子电池，携带备用电池数量应以旅客在行程中使用设备所需的合理数量为判断标准；对于额定能量在100~160Wh的大型锂离子电池，经航空运营人批准后，每人携带备用电池的数量不超过二块。内含锂电池的设备可置于托运行李或手提行李中，备用锂电池仅能置于手提行李。
            		<br>锂电池作为行李运输的操作规范：
            		<br><br>1. 适用范围
            		<br>个人自用的内含锂电池的电子消费品设备（如：手表、计算机、照相机、手机、手提电脑、便携式摄像机等）及备用电池，可以由旅客置于行李中带上航空器。
            		<br>注：锂电池包括锂离子电池（锂聚合物电池也属于锂离子电池一种）、锂金属电池（锂合金电池也属于锂金属电池一种）。
            		<br><br>2. 含量限制
            		<br>备用电池或安装在设备中的电池作为行李运输时，锂含量和额定能量限制如下：
            		<br>A）锂金属或锂合金电池，锂含量不得超过2g；
            		<br>B）锂离子电池，额定能量不得超过100Wh；
            		<br>C）大型锂离子电池，经航空运营人批准，其额定能量可大于100Wh，但不得超过160Wh。
            		<br><br>3. 保护措施
            		<br>备用电池应单个做好保护以防短路，包括将备用电池放置于原厂零售包装中或对电极进行绝缘处理，比如将暴露的电极用胶布粘住或将每一块电池单独装在塑料袋或保护袋中。
            		<br>带电池设备应有防止设备意外启动的措施。
            		<br><br>4. 备用电池数量
            		<br>对于锂含量不超过2g的锂金属电池和额定能量不超过100Wh的锂离子电池，每位旅客或机组成员可以携带的备用电池(包含全部种类的电池)的总数不能超过20块，含有锂金属或锂离子电池芯或电池的便携式电子设备（PED）不超过15个，超过上述数量的限制必须获得航空运营人的批准，批准程序参照厦航手册执行。对于额定能量在100~160Wh的大型锂离子电池，经航空运营人批准后，每人携带备用电池的数量不超过二块。   
            		<br><br>5. 行李类型
            		<br>内含锂电池的设备可置于托运行李或手提行李中，备用锂电池仅能置于手提行李。
            		<br><br><strong>三、携带充电宝乘机的安全指南:</strong>
            		<img src="${APP_PATH}/static/images/help_rule.png">
				</div>
				
				<!-- 防短信诈骗 -->
				<div class="alert alert-dismissible hide"id="p3detail"role="alert">
				尊敬的旅客：
      			<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp近期，各类机票诈骗短信频繁出现，若您在乘机前接到“您乘坐的航班因XX原因取消，请致电XX电话进行退票和改签”的短信，请引起高度重视，立即拨打厦航唯一客服电话95557或登录厦航官网www.xiamenair.com进行核实，切勿拨打短信中提供的电话，谨防上当受骗。			
			
				</div>
			
				<!-- 航班不正常服务 -->
				<div class="alert alert-dismissible hide"id="p4detail"role="alert">
					<strong>一、按局方要求，公布航班延误或取消信息。</strong>
					<br><br><strong>二、因厦航原因，造成航班延误或取消，厦航:</strong>
					<br>&nbsp&nbsp&nbsp&nbsp（1）免费提供餐饮;
					<br>&nbsp&nbsp&nbsp&nbsp（2）提供现有娱乐休闲物品与读物;
					<br>&nbsp&nbsp&nbsp&nbsp（3）为有需要的旅客提供通信服务;
					<br>&nbsp&nbsp&nbsp&nbsp（4）出港航班延误3小时以上，免费向旅客提供膳宿服务，老弱病残、孕妇、抱小孩旅客、无人陪儿童等需要特殊照顾的旅客优先保障；
					<br>&nbsp&nbsp&nbsp&nbsp（5）延误航班在目的地机场当日飞行结束后抵达或当地机场已无至市区交通工具，视情为旅客提供地面交通方便；
					<br>&nbsp&nbsp&nbsp&nbsp（6）延误达4小时或以上航班，对旅客（含婴儿和儿童旅客）进行经济补偿。
					<br><br><strong>三、由于天气、突发事件、空中交通管制、安检和旅客等非厦航原因，在始发站造成的延误或取消，厦航可协助旅客安排膳宿，费用由旅客自理。</strong>
					<br><br><strong>四、厦航航班发生备降、在经停地延误或取消，厦航免费为旅客提供膳宿服务。</strong>
				</div>
				
				<!-- 中国72/144小时过境免签政策 -->
				<div class="alert alert-dismissible hide"id="p5detail"role="alert">
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp经报国务院批准，目前中国部分航空口岸对持53个国家有效国际旅行证件和72或144小时内确定日期、座位以及前往第三国（地区）联程机票的人员，实行过境免办签证政策。
					<br><br><strong>一、72/144小时过境免签政策惠及的国家（共53个）</strong>
					<br>1、欧洲申根签证协议国家（24个）：奥地利、比利时、捷克、丹麦、爱沙尼亚、芬兰、法国、德国、希腊、匈牙利、冰岛、意大利、拉脱维亚、立陶宛、卢森堡、马耳他、荷兰、波兰、葡萄牙、斯洛伐克、斯洛文尼亚、西班牙、瑞典、瑞士；
					<br>2、欧洲其他国家（15个）：俄罗斯、英国、爱尔兰、塞浦路斯、保加利亚、罗马尼亚、乌克兰、塞尔维亚、克罗地亚、波黑、黑山、马其顿、阿尔巴尼亚、摩纳哥、白俄罗斯；
					<br>3、美洲国家（6个）：美国、加拿大、巴西、墨西哥、阿根廷、智利；
					<br>4、大洋洲国家（2个）:澳大利亚、新西兰；
					<br>5、亚洲国家（6个）：韩国、日本、新加坡、文莱、阿联酋、卡塔尔。
					<br><br><strong>二、72/144小时过境免签政策的要求</strong>
					<br>上述53国公民持有本人有效国际旅行证件和72/144小时内已确定日期及座位的前往第三国（地区）联程机票、船票，自开放的国内口岸机场过境前往第三国（地区），可免办签证过境停留不超过72/144小时。</p><p>比如，韩国旅客从首尔经厦门到欧洲国家，可以不申请中国签证，在厦门停留144小时，但如果该旅客是从首尔来厦门，并从厦门直接返回韩国，则不适用此项政策；入境后再买144小时内离境前往第三国（地区）的机（船）票的旅客，也不适用此项政策。
					<br><br><strong>三、厦门市转机要求与提示</strong>
					<br>1、厦门市中转口岸限制。在厦门市中转的旅客必须自厦门高崎国际机场、五通客运码头、厦门国际邮轮中心过境。
					<br>2、厦门市中转停留时间的计算。厦门空海港口岸144小时过境免签外国人，自入境日的次日零时起，可在厦门市停留不超过144小时，入境当天的时间不计算在内。具体停留时间以边检机关在其护照签证页上签发的临时入境许可中标明的停留期限为准。
					<br>3、使用144小时免签过境申请填表系统。2019年1月1日起，在厦门市转机并申请144小时过境免签的旅客，可以使用免签过境申请填表系统提前填写并申报个人信息，更快捷地实现过境通关。
					<br>温馨提示：本页面信息仅供参考，不具备法律效力，政策具体情况，请以国家移民管理局发布消息为准。
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
			if(p=='1'){
				var path="${APP_PATH}/static/images/help_model";
				for(i=1;i<=5;i++){
					var a=$('<a></a>').attr("href",path+i+'.jpg');
					var img=$("<img></img>").attr("src",path+i+'.jpg');
					$("#content").append(a.append(img));
				}
			}
			else{
				$('#p'+p+'detail').removeClass('hide').addClass('in');
			}
		}
	});
</script>
</body>
</html>