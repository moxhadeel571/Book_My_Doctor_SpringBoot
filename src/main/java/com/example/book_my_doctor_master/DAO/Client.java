package com.example.book_my_doctor.DAO;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Document(collection = "Client")
public class Client {
    @MongoId
    private ObjectId id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String Descripton;
    @Field("file_name")
    private String fileName;

    @Field("file_content_type")
    private String fileContentType;

    @Field("file_data")
    private byte[] fileData;
}
