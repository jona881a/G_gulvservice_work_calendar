package com.workcalendar.caldenar.controller;

import com.workcalendar.caldenar.model.Assignment;
import com.workcalendar.caldenar.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AssignmentController {

    @Autowired
    AssignmentRepository assignmentRepository;

    @PostMapping(value="/assignment", consumes = "application/json")
    public ResponseEntity<Assignment> postAssignment(@RequestBody Assignment assignment) {
        assignmentRepository.save(assignment);

        return new ResponseEntity<>(assignment, HttpStatus.CREATED);
    }
}
