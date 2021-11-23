package com.workcalendar.caldenar.controller;

import com.workcalendar.caldenar.model.Assignment;
import com.workcalendar.caldenar.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Assign;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @DeleteMapping("/assignment/{id}")
    public ResponseEntity<Object> deleteAssignment(@PathVariable int id) {

        try {
            assignmentRepository.deleteById(id);

        } catch (Exception err) {

            return new ResponseEntity<>("assignment with specified id: " + id + " not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
