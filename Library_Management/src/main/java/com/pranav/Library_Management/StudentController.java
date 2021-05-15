package com.pranav.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/allStudents")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	@GetMapping("/getStudent/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		return studentService.getStudent(studentId);
	}
	
	@PostMapping("/saveStudent")
	public void saveStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
	}
	
	@GetMapping("/studentName/{name}")
	public Student getStudentEmail(@PathVariable String name)
	{
		return studentService.findStudentByName(name);
	}
	/*
	@PutMapping("/update/{email}/{name}")
	public void updateEmail(@PathVariable String email,@PathVariable String name)
	{
		studentService.updateStudentEmail(email, name);
	}
	*/
	@PutMapping("/update")
	public void updateEmail(@RequestParam("email") String email,@RequestParam("name") String name)
	{
		studentService.updateStudentEmail(email, name);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteMapping(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}

	
	
}
