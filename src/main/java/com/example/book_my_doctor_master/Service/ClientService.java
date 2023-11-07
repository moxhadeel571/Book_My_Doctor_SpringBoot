package com.example.book_my_doctor.Service;

import com.example.book_my_doctor.DAO.Client;
import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ClientService  {
    ObjectId addClient(MultipartFile fileData, Client client) throws IOException;
    List<Client> getAllfiles();
}
