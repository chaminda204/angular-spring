package com.chaminda.example.service;

import java.util.Collection;

import com.chaminda.example.domain.Student;

public interface StudentService {

	Student saveStudent(Student user);

	Student updateStudent(Student user);

	Student findByStudentId(long id);

	Collection<Student> getAllStudents();
}
