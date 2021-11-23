package com.workcalendar.caldenar.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Getter @Setter @NoArgsConstructor
@Entity
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assignmentID;
    private String address;
    private Time assignmentStartTime;
    private Time assignmentEndTime;
    private Date assignmentStartDate;
    private Date assignmentEndDate;
    private String description;
    private String color;

}
