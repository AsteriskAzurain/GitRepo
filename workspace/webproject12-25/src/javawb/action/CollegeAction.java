package javawb.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import javawb.pojo.CollegeUser;
import javawb.pojo.CollegeUser1;
import javawb.service.CollegeService;

public class CollegeAction {
private CollegeService collegeservice;
private Map<String,Object> remap;
public void setCollegeservice(CollegeService collegeservice) {
	this.collegeservice = collegeservice;
}





public Map<String, Object> getRemap() {
	return remap;
}





public void setRemap(Map<String, Object> remap) {
	this.remap = remap;
}





public String querySomeCollege() {
	HttpServletRequest request = ServletActionContext.getRequest();
	CollegeUser collegeuser=new CollegeUser();
	String name = request.getParameter("name");
	collegeuser.setName(name);
	List<CollegeUser> rs = collegeservice.findSomeCollege(collegeuser);
	Map<String,Object> map=new HashMap<>();
	map.put("result", rs);
	remap = map;
	return "success";
}
public String querySomeCollege1() {
	HttpServletRequest request = ServletActionContext.getRequest();
	CollegeUser1 collegeuser1=new CollegeUser1();
	String name = request.getParameter("name");
	collegeuser1.setName(name);
	List<CollegeUser1> rs = collegeservice.findSomeCollege1(collegeuser1);
	Map<String,Object> map=new HashMap<>();
	map.put("result", rs);
	remap = map;
	return "success";
}




}
