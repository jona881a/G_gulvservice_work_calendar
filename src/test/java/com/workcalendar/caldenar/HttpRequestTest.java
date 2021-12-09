package com.workcalendar.caldenar;

import com.workcalendar.caldenar.model.Assignment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

//Vi bruger randomport så vi undgår problematikker med porte under tests
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testIfPostAssignmentReturnsStatus201() throws URISyntaxException {
        final String baseUrl = "http://localhost:"+port+"/assignment";
        URI uri = new URI(baseUrl);
        Date startDate = new Date(2021,10,10);
        Date endDate = new Date(2021,11,10);

        Assignment newAssignment = new Assignment(1, "Event", "Nådsensgade 23", startDate, endDate, "Whatever", "Red");

        HttpEntity<Assignment> request = new HttpEntity<>(newAssignment);

        ResponseEntity<String> result = this.restTemplate.postForEntity(uri,request,String.class);

        assertEquals(HttpStatus.CREATED,result.getStatusCode());
    }
}