package com.example.EmployeePayroll.service.Interface;

import com.example.EmployeePayroll.dto.EmployeeDTO;
import com.example.EmployeePayroll.model.User;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    List<User> getAllEmployees();

    Optional<User> getEmployeeById(Long id);

    User createEmployee(EmployeeDTO employeeDto);

    User updateEmployee(Long id, EmployeeDTO employeeDto);

    boolean deleteEmployee(Long id);
}