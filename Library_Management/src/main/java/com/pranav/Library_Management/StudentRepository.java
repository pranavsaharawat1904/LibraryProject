package com.pranav.Library_Management;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	public Student findByName(String name );
	
	@Modifying
	@Transactional
	@Query("update Student s SET s.email= :email where s.name= :name")
	public void updateStudentEmail(String email,String name);
	
	
	@Modifying
	@Transactional
	@Query(value="delete from student where sid= :id",nativeQuery=true)
	public void deleteStudent(int id);
}
