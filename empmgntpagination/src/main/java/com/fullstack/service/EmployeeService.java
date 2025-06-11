package com.fullstack.service;

import com.fullstack.entity.Employee;
import com.fullstack.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Page<Employee> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return employeeRepository.findAll(pageable);
    }
}
