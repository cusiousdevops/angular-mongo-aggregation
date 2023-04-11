package com.example.mongoaggregation.service;

import com.example.mongoaggregation.dao.IStudentDAO;
import com.example.mongoaggregation.exception.DAOException;
import com.example.mongoaggregation.exception.ServiceException;
import com.example.mongoaggregation.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    IStudentDAO studentDAO;

    @Override
    public Student saveStudent(Student studentToSave) throws ServiceException {
        try {
            UUID uuid = UUID.randomUUID();
            studentToSave.setStudentId(uuid);
            return studentDAO.saveStudent(studentToSave);
        } catch (DAOException daoException) {
            log.error("DAO Exception occurs while saving student to database at service layer and the exception is " + daoException.getMessage());
            throw new ServiceException("DAO Exception occurs while saving student to database at service layer");
        }
    }

    @Override
    public List<Student> findAllStudents() throws ServiceException {
        try {
            return studentDAO.findAllStudents();
        } catch (DAOException daoException) {
            log.error("DAO Exception occurs while fetching student from database at service layer and the exception is " + daoException.getMessage());
            throw new ServiceException("DAO Exception occurs while fetching student from database at service layer");
        }
    }
}
