package Dao;

import java.util.Set;

import beans.Student;

public interface StudentDao {

	void saveStudent(Set<Student> std);

	Set<Student> loaddata() throws ClassNotFoundException;

}
