package com.workcalendar.caldenar.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter @Setter @NoArgsConstructor
@Entity
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private Integer assignmentID;
    private String address;
    private Date assignmentStartDateTime;
    private Date assignmentEndDateTime;
    private String description;
    private String color;

}
