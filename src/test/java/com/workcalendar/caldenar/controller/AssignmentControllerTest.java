package com.workcalendar.caldenar.controller;

import com.workcalendar.caldenar.model.Assignment;
import com.workcalendar.caldenar.repository.AssignmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
@DataJpaTest
class AssignmentControllerTest {

    @Autowired
    AssignmentRepository assignmentRepository;

    Assignment testPostAssignment;
    Assignment testDeleteAssignment;

    @BeforeEach
    public void init() {
        Date startDate = new Date(2021, Calendar.JANUARY,24);
        Date endDate = new Date(2021,Calendar.DECEMBER,24);
        testPostAssignment = new Assignment(null,"gulvslibning","drejøgade",startDate,endDate ,"description here","green");
        testDeleteAssignment = new Assignment(null,"gulvslibning","drejøgade",startDate,endDate ,"description here","green");
    }

    @Test
    void dummyTest() {
        assertEquals(1,2);
    }

    @Test
    void findAllAssignments() {
        assignmentRepository.save(testPostAssignment);
        assignmentRepository.save(testDeleteAssignment);
        assertTrue(0 < assignmentRepository.findAll().size());
    }

    @Test
    void postAssignment() {
        Assignment savedAssignment = assignmentRepository.save(testPostAssignment);
        assertEquals(savedAssignment.getAssignmentID(),testPostAssignment.getAssignmentID());
    }

    @Test
    void deleteAssignment() {
        assignmentRepository.save(testDeleteAssignment);

    }
}