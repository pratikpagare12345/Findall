package com.BikkadIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIT.Entity.Student;
import com.BikkadIT.Service.StudentServiceI;

@Repository
public class StudentController {
	
	@Autowired
	private StudentServiceI studentServiceI;

	@PostMapping("/addData")
	public int addData(@RequestBody Student stu) {
		int i = studentServiceI.addData(stu);
		
		return i;
		
	}
}
