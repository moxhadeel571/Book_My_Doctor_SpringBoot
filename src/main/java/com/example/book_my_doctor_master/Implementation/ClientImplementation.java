package com.example.book_my_doctor.Implementation;
import com.example.book_my_doctor.Repository.ClientRepository;
import org.bson.BsonBinarySubType;
import org.bson.Document;
import com.example.book_my_doctor.DAO.Client;
import com.example.book_my_doctor.Service.ClientService;
import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ClientImplementation implements ClientService {
    private MongoTemplate mongoTemplate;
    private ClientRepository clientRepository;
    @Autowired
    public ClientImplementation(MongoTemplate mongoTemplate, ClientRepository mongoRepository) {
        this.mongoTemplate = mongoTemplate;
        this.clientRepository = clientRepository;
    }


    @Override
    public ObjectId addClient(MultipartFile file, Client client) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("file cannot be null");
        }
        byte[] fileData = file.getBytes();
        String fileName = file.getOriginalFilename();
        String contentType = file.getContentType();
        Document randowmDocument=new Document();
        randowmDocument.append("contentType",contentType)
                .append("fileName",fileName)
                .append("fileData",new Binary(BsonBinarySubType.BINARY,fileData))
                .append("name",client.getName())
                .append("surname",client.getSurname())
                .append("email",client.getEmail())
                .append("phoneNumber",client.getPhoneNumber())
                .append("Description",client.getDescripton());
        mongoTemplate.getCollection("ClientInfo").insertOne(randowmDocument);
        return randowmDocument.getObjectId("_id");

    }


    @Override
    public List<Client> getAllfiles() {

        return clientRepository.findAll();
    }


}
