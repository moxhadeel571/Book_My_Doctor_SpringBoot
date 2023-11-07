package com.example.book_my_doctor.Repository;

import com.example.book_my_doctor.DAO.Doctor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, ObjectId> {
    @Query("{ '_id' : ?0 }")
    Optional<Doctor> finImageById(String id);
}
