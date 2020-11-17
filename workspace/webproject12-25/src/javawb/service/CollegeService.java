package javawb.service;

import java.util.List;

import javawb.dao.CollegeDaoImpl;
import javawb.pojo.CollegeUser;
import javawb.pojo.CollegeUser1;

public class CollegeService {
private CollegeDaoImpl collegedaoimpl;

public CollegeDaoImpl getCollegedaoimpl() {
	return collegedaoimpl;
}

public void setCollegedaoimpl(CollegeDaoImpl collegedaoimpl) {
	this.collegedaoimpl = collegedaoimpl;
}

@SuppressWarnings("rawtypes")
public List<CollegeUser> findSomeCollege(CollegeUser collegeuser){
	System.out.println(collegeuser);
	return collegedaoimpl.findByCollegeName(collegeuser);
	
	
}
public List<CollegeUser1> findSomeCollege1(CollegeUser1 collegeuser1){
	System.out.println(collegeuser1);
return collegedaoimpl.findByCollegeName1(collegeuser1);
	
	
}

}
