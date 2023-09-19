package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pogo.Employee;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpController {
    
    @Autowired
    private EmployeeService empService;
    
    @GetMapping
    public List<Employee> getAllUsers() {
        return empService.getAllUsers();
    }
    
    @GetMapping("/{id}")
    public Employee getUserById(@PathVariable Long id) {
        return empService.getUserById(id);
    }
    
    @PostMapping
    public Employee createUser(@RequestBody Employee emp) {
        return empService.createUser(emp);
    }
    
    @PutMapping("/{id}")
    public Employee updateUser(@PathVariable Long id, @RequestBody Employee emp) {
        emp.setId(id);
        return empService.updateUser(emp);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
    	empService.deleteUser(id);
    }
}
