package com.BikkadIT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Entity.Student;
import com.BikkadIT.Repository.StudentRepository;

@Service
public class ServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public int addData(Student stu) {
		 studentRepository.save(stu);
		return stu.getRollno();
	}

}
