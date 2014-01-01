package com.chaminda.example.service;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.chaminda.example.dao.StudentDao;
import com.chaminda.example.domain.Student;

@Component
public class StudentServiceImpl implements StudentService {

	// Dummy Dao instance with some vals
	StudentDao studentDao = StudentDao.getDaoInstance();

	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	public Student updateStudent(Student student) {
		return studentDao.updateStudent(student);

	}

	public Student findByStudentId(long id) {
		return studentDao.findByStudentId(id);
	}

	public Collection<Student> getAllStudents() {
		return studentDao.getAllStudents();

	}

}
