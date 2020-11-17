package ch0802.service.impl;

import java.util.List;

import ch0802.dao.StudentDao;
import ch0802.dao.impl.StudentDaoImpl;
import ch0802.entity.StudentTo;
import ch0802.service.StudentService;

public class StudentServiceImpl implements StudentService{
	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public boolean checkUser(String username) {
		StudentTo s = new StudentTo();
		s.setName(username);
		List<StudentTo> list = studentDao.SearchByEntity(s);
		return list.size()>0?true:false;
	}

}
