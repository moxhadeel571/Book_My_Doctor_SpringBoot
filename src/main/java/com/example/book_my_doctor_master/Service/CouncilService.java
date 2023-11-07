package com.example.book_my_doctor.Service;

import com.example.book_my_doctor.DAO.Council;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface CouncilService {


    Optional<Council> isApproved(ObjectId councilId);
}
