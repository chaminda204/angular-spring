package com.chaminda.example.controller;

import java.util.Collection;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chaminda.example.domain.Student;
import com.chaminda.example.service.StudentService;

@Controller
public class MainController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String initialize(ModelMap model){
		return "home";
	}
	
	@RequestMapping("/student/getAll")
	public @ResponseBody String getAllStudents(){
		Collection<Student> students = studentService.getAllStudents();
		JSONObject jObject = new JSONObject();
		jObject.put("students", students);		
		return jObject.toString();
	}
	
	@RequestMapping("/student/get/{studentId}")
	public @ResponseBody String fetchSchoolsBySubject(@PathVariable long studentId){
		Student student = studentService.findByStudentId(studentId);
		JSONObject jObject = new JSONObject();
		jObject.put("student", student);
		return jObject.toString();		
	}
	

}
