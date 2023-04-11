package com.example.mongoaggregation.repository;

import com.example.mongoaggregation.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface StudentRepository extends MongoRepository<Student, UUID> {
}
