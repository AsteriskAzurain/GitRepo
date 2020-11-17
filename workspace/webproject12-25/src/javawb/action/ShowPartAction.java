package javawb.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javawb.pojo.LoginUser;
import javawb.service.LoginService;

public class ShowPartAction {
private LoginService loginService;
private Map<String,Object> remap;
private String username;


//public LoginService getLoginService() {
//	return loginService;
//}


public void setLoginService(LoginService loginService) {
	this.loginService = loginService;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}




public Map<String, Object> getRemap() {
	return remap;
}

public void setRemap(Map<String, Object> remap) {
	this.remap = remap;
}

public String querySomeStudent() {
LoginUser user=new LoginUser();
user.setUsername(username);
@SuppressWarnings("unchecked")
List<LoginUser> rs = loginService.findSomeUser(user);
System.out.println(rs);
Map<String, Object> map = new HashMap<>();
map.put("resultlist", rs);
remap = map;
return "success";
	
	
}


}
