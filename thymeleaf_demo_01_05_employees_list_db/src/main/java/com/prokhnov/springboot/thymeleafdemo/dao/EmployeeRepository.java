package com.prokhnov.springboot.thymeleafdemo.dao;

import com.prokhnov.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
