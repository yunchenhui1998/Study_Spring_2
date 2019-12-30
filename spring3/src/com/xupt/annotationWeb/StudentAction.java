package com.xupt.annotationWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("studentAction")
public class StudentAction {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	public void execute() {
		studentService.addStudent();
	}
}
