package com.workcalendar.caldenar;

import com.workcalendar.caldenar.controller.AssignmentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SmokeTest {

    @Autowired
    AssignmentController assignmentController;

    @Test
    void contextLoads() throws Exception{
        assertThat(assignmentController).isNotNull();
    }

}
