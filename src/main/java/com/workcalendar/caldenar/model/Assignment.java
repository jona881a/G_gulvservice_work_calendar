package com.workcalendar.caldenar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assignmentID;
    private String title;
    private String address;
    private Date assignmentStartDateTime;
    private Date assignmentEndDateTime;
    private String description;
    private String color;

    public Integer getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(Integer assignmentID) {
        this.assignmentID = assignmentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAssignmentStartDateTime() {
        return assignmentStartDateTime;
    }

    public void setAssignmentStartDateTime(Date assignmentStartDateTime) {
        this.assignmentStartDateTime = assignmentStartDateTime;
    }

    public Date getAssignmentEndDateTime() {
        return assignmentEndDateTime;
    }

    public void setAssignmentEndDateTime(Date assignmentEndDateTime) {
        this.assignmentEndDateTime = assignmentEndDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
