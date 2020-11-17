package com.ishang.service.imp;

import java.util.List;

import com.ishang.dao.StudentDao;
import com.ishang.dao.impl.StudentDaoImpl;
import com.ishang.entity.StudentsInfo;
import com.ishang.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public boolean save(StudentsInfo t) {
		studentDao.save(t);
		return true;
	}

	@Override
	public boolean update(StudentsInfo t) {
		studentDao.update(t);
		return true;
	}

	@Override
	public boolean delete(int id) {
		studentDao.delete(id);
		return true;
	}

	@Override
	public List<StudentsInfo> findByAll() {
		return studentDao.findByAll();
	}

	@Override
	public StudentsInfo findById(int id) {
		return studentDao.findById(id);
	}

	@Override
	public List<StudentsInfo> findByEntity(StudentsInfo t) { 
		return studentDao.findByEntity(t);
	}

}
