<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名片管理系统 - 添加</title>
<link rel="stylesheet" href="../css/Style.css" type="text/css"/>

</head>
<body>

<%String uname=new String((request.getParameter("owner")).getBytes("ISO-8859-1"),"GBK"); %>
<h5>欢迎【<%=uname %>】</h5>
<h2>添加名片</h2>
<form action="../../../card?flag=insert&owner=<%=uname  %>" method="post">
<div class="card">

<div class="company">Company&emsp;<input type="text" name="ccompany" /></div>
<div class="name">姓名&emsp;<input type="text" name="cname"/></div>
<div class="position">职位&emsp;<input type="text" nae="cposition" /></div>
<div class="info">
<span class="halfline">手机&emsp;<input type="text" name="cphone" /></span>
<span class="halfline" style="margin-left:40px;">微信&emsp;<input type="text" name="cwechat" /></span>
<br>
<span class="halfline">电话&emsp;<input type="text" name="cdel" /></span>
<span class="halfline" style="margin-left:40px;">邮箱&emsp;<input type="text" name="cmail" /></span>
<br>
<span class="wholeline">地址&emsp;<input type="text" name="caddress" /></span>

</div>
</div>
<div class="notes">
备注<input type="submit" value="提交">
<br><textarea rows="3" cols="50"></textarea>
</div>
</form>
</body>
</html>