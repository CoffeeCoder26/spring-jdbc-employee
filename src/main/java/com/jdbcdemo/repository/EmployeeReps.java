package com.jdbcdemo.repository;

import java.util.List;

import com.jdbcdemo.entity.Employee;

public interface EmployeeReps {

	int count();

	Employee findById(Long id);

	List<Employee> findAll();
	
	List<Employee> findByNameAndSalary(String name, Double salary);

	int insert(Employee employee);

	int update(Employee employee);
	
	int delete (Long id);

}
