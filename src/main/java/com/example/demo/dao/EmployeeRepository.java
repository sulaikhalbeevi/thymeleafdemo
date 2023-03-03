package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	
	// add a method to sort by first name
	public List<Employee> findAllByOrderByFirstName();
	/*
	 * //add a method to find by email
	 * 
	 * @Query(value = "SELECT * FROM EMPLOYEE WHERE EMAIL = ?0", nativeQuery = true)
	 * public Employee findByEmail(String email);
	 */
	
}

