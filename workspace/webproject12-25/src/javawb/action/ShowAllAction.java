package javawb.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import javawb.pojo.LoginUser;
import javawb.service.LoginService;
//import net.sf.json.JSONArray;

public class ShowAllAction {
	private LoginService loginService;
	private Map<String, Object> remap;
private String username;
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
 

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String queryAllStudent() {
		@SuppressWarnings("unchecked")
		List<LoginUser> rs = loginService.findAllUser();
		System.out.println(rs);
//	HttpServletRequest request=(HttpServletRequest)ServletActionContext.getRequest();
//	HttpServletResponse response=(HttpServletResponse)ServletActionContext.getResponse();
//	request.setAttribute("resultlist", rs);
		Map<String, Object> map = new HashMap<>();
		map.put("resultlist", rs);
		remap = map;
		return "success";

	}


public String querySomeStudent() {
	HttpServletRequest request=(HttpServletRequest)ServletActionContext.getRequest();
	String username=request.getParameter("username");
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
//	public String execute() throws Exception {
//		// ͨ������ҵ���߼����������е��û�
//		List all = loginService.findAllUser();
//		// �������û�List������request��Χ��
//		ServletActionContext.getRequest().setAttribute("all", all);
//		System.out.println(all);
////	Map<String,Object> map=new HashMap<>();
//
//		JSONArray data = JSONArray.fromObject(all);
//
//		return "success";
//	}
//
//}
