package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Pogo.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long>{

}
