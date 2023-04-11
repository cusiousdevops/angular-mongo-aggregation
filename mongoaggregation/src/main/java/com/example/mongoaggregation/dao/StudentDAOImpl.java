package com.example.mongoaggregation.dao;

import com.example.mongoaggregation.exception.DAOException;
import com.example.mongoaggregation.model.Student;
import com.example.mongoaggregation.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class StudentDAOImpl implements IStudentDAO{
    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student studentToSave) throws DAOException {
        try {
            log.debug("Inside StudentDAOImpl, saveStudent method saving student :" + studentToSave.getFirstName());
            return studentRepository.save(studentToSave);
        } catch (DataAccessException dataAccessException) {
            log.error("DataAccess Exception occurs while saving student at DAO Layer and the exception is " + dataAccessException.getMessage());
            throw new DAOException("DataAccess Exception occurs while saving student at DAO Layer");
        }
    }

    @Override
    public List<Student> findAllStudents() throws DAOException {
        try {
            log.debug("Inside StudentDAOImpl, findAllStudent method fetching all student available");
            return studentRepository.findAll();
        } catch (DataAccessException dataAccessException) {
            log.error("DataAccess Exception occurs while fetching all available student at DAO layer and the exception is " + dataAccessException.getMessage());
            throw new DAOException("DataAccess Exception occurs while fetching all available student at DAO layer");
        }
    }


}
