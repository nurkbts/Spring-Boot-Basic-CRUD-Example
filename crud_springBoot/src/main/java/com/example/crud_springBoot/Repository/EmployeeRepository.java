package com.example.crud_springBoot.Repository;

import com.example.crud_springBoot.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
