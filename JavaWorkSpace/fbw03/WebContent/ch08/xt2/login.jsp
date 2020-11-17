<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax实现注册</title>
<script type="text/javascript">	
	var xmlHttpRequest=null;//声明XMLHttpRequest对象	
	
	 //创建XMLHttpRequest对象实例的方法
	function createXHR(){
	   try {
		   xmlHttpRequest= new XMLHttpRequest();
	   } catch (e1) {
	     var _msxmlhttp = new Array("Msxml2.XMLHTTP.6.0","Msxml2.XMLHTTP.5.0",
	                             "Msxml2.XMLHTTP.4.0","Msxml2.XMLHTTP.3.0",
	                             "Msxml2.XMLHTTP","Microsoft.XMLHTTP");
	     for ( var i = 0; i < _msxmlhttp.length; i++) {
	        try {
	        	xmlHttpRequest = new ActiveXObject(_msxmlhttp[i]);
	             if(xmlHttpRequest != null){ break;}
	         } catch (e2) { }
	     }
	   }
	   if (xmlHttpRequest == null) {
	     alert("不能创建Ajax对象！");
	   }
	}

	
	//发送客户端的请求，该方法有4个参数，其中method取值为POST或GET
	function sendRequest(url,params,method,handler){
	    createXHR();
	    if(!xmlHttpRequest) return false;
	    xmlHttpRequest.onreadystatechange = handler;   //指定响应函数为handler
	    if(method == "GET"){
	       xmlHttpRequest.open(method,url+ '?' + params,true);
	       xmlHttpRequest.send(null);
	    }
	    if(method == "POST"){
	       xmlHttpRequest.open(method,url,true);
	       xmlHttpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded"); 
	       xmlHttpRequest.send(params); 
	    }
	}
	

	function regist(){
		var url="/registCheck";
		var userId = document.getElementsByName("userId")[0];
		var userpsw = document.getElementsByName("userpsw")[0];
		var checkuserpsw = document.getElementsByName("checkuserpsw")[0];
		var params="userId="+userId.value+"&userpsw="+userpsw.value+"&checkuserpsw="+userpsw.value;
		sendRequest(url,params,'POST',showresult);	
	}
	
	function showresult(){
		 if (xmlHttpRequest.readyState == 4) { 
				if (xmlHttpRequest.status == 200) {
					var info=xmlHttpRequest.responseText;
					result.innerHTML=info;
				}
			}
	}
	

</script>
</head>
<body>
   <div>
   	  <form action="">
   	  	<table>
   	  		<tr><td>用户名：</td><td><input type="text" name="userId" id="userId"></td></tr>
   	  		<tr><td>密码：</td><td><input type="password" name="userpsw" id="userpsw"></td></tr>
   	  		<tr><td>确认密码：</td><td><input type="password" name="checkuserpsw" id="checkuserpsw"></td></tr>
   	  		<tr><td><input type="button" value="提交" onclick="regist()"/>&nbsp;&nbsp;
   	  				<input type="reset" value="重置"/> 
   	  			</td>
   	  		</tr>
   	  	</table>   
	   </form> 
   </div>	
   <div id="result"></div>
</body>
</html>