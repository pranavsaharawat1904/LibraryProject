package com.pranav.Library_Management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	
	public List<Student> getAllStudent()
	{
		return studentRepo.findAll();
	}
	
	public Student getStudent(int studentId)
	{
		return studentRepo.findById(studentId).orElse(null);
	}
	
	public void saveStudent(Student student)
	{
		studentRepo.save(student);
	}
	
	public Student findStudentByName(String name)
	{
		return studentRepo.findByName(name);
	}
	
	public void updateStudentEmail(String email,String name)
	{
		studentRepo.updateStudentEmail(email, name);
	}
	
	public void deleteStudent(int id)
	{
		studentRepo.deleteStudent(id);
	}

}
