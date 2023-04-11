package com.example.mongoaggregation.service;

import com.example.mongoaggregation.exception.DAOException;
import com.example.mongoaggregation.exception.ServiceException;
import com.example.mongoaggregation.model.Student;

import java.util.List;

public interface IStudentService {

    Student saveStudent(Student studentToSave) throws ServiceException;

    List<Student> findAllStudents() throws ServiceException;

}
