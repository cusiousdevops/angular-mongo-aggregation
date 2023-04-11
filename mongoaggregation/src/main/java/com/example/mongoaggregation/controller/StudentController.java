package com.example.mongoaggregation.controller;

import com.example.mongoaggregation.exception.ServiceException;
import com.example.mongoaggregation.model.Student;
import com.example.mongoaggregation.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    IStudentService studentService;

    @GetMapping("/student")
    public List<Student> getAllStudent() throws ServiceException {
        try {
            return studentService.findAllStudents();
        } catch (ServiceException serviceException) {
            log.error("Service exception was caught while fetching all student at controller layer and the exception is " + serviceException.getMessage());
            throw new ServiceException(serviceException.getMessage());
        }
    }

    @PostMapping("/student")
    public Student saveStudent(Student student) throws ServiceException {
        try {
            return studentService.saveStudent(student);
        } catch (ServiceException serviceException) {
            log.error("Service exception was caught while saving student at controller layer and the exception is " + serviceException.getMessage());
            throw new ServiceException(serviceException.getMessage());
        }
    }
}
