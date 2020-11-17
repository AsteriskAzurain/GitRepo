package ch0802.dao;

import java.util.List;

import ch0802.entity.StudentTo;

public interface StudentDao {
	
	public List<StudentTo> SearchByEntity(StudentTo t);

}
