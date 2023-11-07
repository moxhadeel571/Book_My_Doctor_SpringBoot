package com.example.book_my_doctor.Repository;

import com.example.book_my_doctor.DAO.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, ObjectId> {
}
