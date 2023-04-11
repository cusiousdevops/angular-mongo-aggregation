package com.example.mongoaggregation.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    public enum STUDENT_STATUS {
        ENROLLED, ALUMNI, FRESHERS
    }

    @Id
    private UUID studentId;

    private String createdBy;
    private String createdOn;
    private String firstName;
    private String lastName;
    private String batch;
    private STUDENT_STATUS studentStatus;
}
