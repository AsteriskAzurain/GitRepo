<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名片管理系统 - 修改</title>
<link rel="stylesheet" href="../css/Style.css" type="text/css"/>
</head>
<body>

<h2>添加名片</h2>
<form action="" method="post" class="loaddiv">
<h5>查找名片</h5>
请输入名片id：<input type="text" name=cardid /><br><br>
<input type="submit" value="加载" />
<p>
</form>

<form action="" method="post">
<div class="card">

<div class="company">Company&emsp;<input type="text" name="ccompany" value="xxx"/></div>
<div class="name">姓名&emsp;<input type="text" name="cname" value="xxx"/></div>
<div class="position">职位&emsp;<input type="text" nae="cposition" value="xxx"/></div>
<div class="info">
<span class="halfline">手机&emsp;<input type="text" name="cphone" value="xxx"/></span>
<span class="halfline" style="margin-left:40px;">微信&emsp;<input type="text" name="cwechat" value="xxx"/></span>
<br>
<span class="halfline">电话&emsp;<input type="text" name="cdel" value="xxx"/></span>
<span class="halfline" style="margin-left:40px;">邮箱&emsp;<input type="text" name="cmail" value="xxx"/></span>
<br>
<span class="wholeline">地址&emsp;<input type="text" name="caddress" value="xxx"/></span>

</div>
</div>
<div class="notes">
备注<input type="submit" value="提交">
<br><textarea rows="3" cols="50">xxx</textarea>
</div>
</form>
</body>
</html>