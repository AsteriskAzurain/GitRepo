/**
 * 提交按钮 create by zhayao 2019/09/16
 */
function validate(){
         var name=document.forms[0].userName.value;//用户名
         var pwd=document.forms[0].userPwd.value;//密码
         var pwd1=document.forms[0].userPwd1.value;//确认密码
         var email=document.forms[0].userEmail.value;//邮箱
         var accept=document.forms[0].accept.checked;//是否接口协议
         var regl=/[a-zA-Z]\w*/;
         var reg2= /\w+([-+.']\w+)*@\w+([-.]\w+)*.\w+([-.]\w+)*/;
         if(name.length<=0) 
        	 alert("用户名不能为空！");
         else if(!regl.test(name)) 
        	 alert("用户名格式不正确！");
         else if(pwd.length<6) 
        	 alert("密码长度必须大于等于6！");
         else if(pwd!=pwd1) 
        	 alert("两次密码不一致！"); 
         else if(!reg2.test(email)) 
        	 alert("邮件格式不正确！"); 
         else if(accept==false) 
        	 alert("您需要仔细阅读并同意接受用户使用协议！");
         else {
        	 alert("操作成功！！");
        	 document.forms[0].submit();  
         }
        	
} 