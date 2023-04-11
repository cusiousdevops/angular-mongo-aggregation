package com.example.mongoaggregation.dao;

import com.example.mongoaggregation.exception.DAOException;
import com.example.mongoaggregation.model.Student;

import java.util.List;

public interface IStudentDAO {

    Student saveStudent(Student studentToSave) throws DAOException;

    List<Student> findAllStudents() throws DAOException;
}
