package com.employee.EmplMgmtSys.repository;

import com.employee.EmplMgmtSys.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
