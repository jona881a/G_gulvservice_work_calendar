package com.workcalendar.caldenar.config;

import com.workcalendar.caldenar.model.Assignment;
import com.workcalendar.caldenar.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SetupData implements CommandLineRunner {

    @Autowired
    AssignmentRepository assignmentRepository;

    @Override
    public void run(String... args) throws Exception {
        assignmentRepository.save(new Assignment("Gulvslibning"));
    }
}
