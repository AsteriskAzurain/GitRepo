<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="../calculate">
	      请输入第一个复数的实部：<input type="text" name="r1"/><br>
	      请输入第一个复数的虚部：<input type="text" name="i1"/><br>
	      选择运算类型
	      <select name="oper">
	          <option>+</option>
	          <option>-</option>
	          <option>*</option>
	          <option>/</option>
	      </select> <br/>
	      请输入第二个复数的实部：<input type="text" name="r2"/><br>
	      请输入第二个复数的虚部：<input type="text" name="i2"/><br>
     <input type="submit" value="计算"/>
     </form> 
</body>
</html>