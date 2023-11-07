package com.example.book_my_doctor.Service;


import com.example.book_my_doctor.DAO.Doctor;
import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface DoctorService  {

    ObjectId addDoctor(MultipartFile files, Doctor doctor) throws IOException;

    List<Doctor> getDoctorList();


    Optional<Doctor> findById(ObjectId id);
}
