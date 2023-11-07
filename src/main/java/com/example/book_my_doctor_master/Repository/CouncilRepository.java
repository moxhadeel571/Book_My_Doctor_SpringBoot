package com.example.book_my_doctor.Repository;

import com.example.book_my_doctor.DAO.Council;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouncilRepository extends MongoRepository<Council, ObjectId> {
}
