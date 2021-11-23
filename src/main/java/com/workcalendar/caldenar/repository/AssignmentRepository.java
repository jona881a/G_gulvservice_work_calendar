package com.workcalendar.caldenar.repository;

import com.workcalendar.caldenar.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
}
