package com.workcalendar.caldenar.repository;

import com.workcalendar.caldenar.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Integer, Employee> {
}
