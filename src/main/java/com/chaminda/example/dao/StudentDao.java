package com.chaminda.example.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.chaminda.example.domain.Student;

public class StudentDao {

	private Map<Long, Student> students = new HashMap<Long, Student>();

	private static StudentDao studentDao;

	private StudentDao() {
		initialise();
	}

	public static StudentDao getDaoInstance() {
		if (studentDao == null) {
			studentDao = new StudentDao();
		}
		return studentDao;
	}

	public Student saveStudent(Student student) {
		student.setId(students.size() + 1);
		students.put(student.getId(), student);
		return student;
	}

	public Student updateStudent(Student student) {
		students.put(student.getId(), student);
		return student;
	}

	public Student findByStudentId(Long studentId) {
		return students.get(studentId);
	}

	public Collection<Student> getAllStudents() {
		return students.values();
	}

	// Adding few instances to map

	private void initialise() {
		Student chaminda = new Student();
		chaminda.setFirstName("Kumar");
		chaminda.setLastName("Sanga");
		saveStudent(chaminda);

		Student tim = new Student();
		tim.setFirstName("Tim");
		tim.setLastName("Tom");
		saveStudent(tim);
		
		Student lee = new Student();
		lee.setFirstName("Lee");
		lee.setLastName("Barnes");
		saveStudent(lee);
		
		Student tom = new Student();
		tom.setFirstName("Tom");
		tom.setLastName("Moody");
		saveStudent(tom);
		
		

	}

}
