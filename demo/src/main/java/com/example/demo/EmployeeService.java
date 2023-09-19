package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Pogo.Employee;

@Service
public class EmployeeService {
	
	    
	    @Autowired
	    private EmployeeDao dao;
	    
	    public List<Employee> getAllUsers() {
	        return dao.findAll();
	    }
	    
	    public Employee getUserById(Long id) {
	        return dao.findById(id).orElse(null);
	    }
	    
	    public Employee createUser(Employee emp) {
	        return dao.save(emp);
	    }
	    
	    public Employee updateUser(Employee emp) {
	        return dao.save(emp);
	    }
	    
	    public void deleteUser(Long id) {
	        dao.deleteById(id);
	    }
	


}
