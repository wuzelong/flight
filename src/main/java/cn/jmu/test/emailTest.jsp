<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发送邮件测试</title>
 <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH}/static/js/smtp.js"></script>
<script src="https://smtpjs.com/v3/smtp.js">
</script>
</head>
<body>
<script type="text/javascript">
Email.send({
    Host : "smtp.qq.com",
    Username : "413652081@qq.com",
    Password : "nvyyspxysfypbhfj",
    To : '413652081@qq.com',
    From : "413652081@qq.com",
    Subject : "【航空票务系统】",
    Body : "【航空票务系统】您正在申请邮箱注册，验证码为：123456，5分钟内有效！"
}).then(
  message => alert(message)
);
</script>
</body>
</html>