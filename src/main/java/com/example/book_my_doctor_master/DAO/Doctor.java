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
@Document(collection = "Doctors")
public class Doctor {
    @MongoId
    private ObjectId id;
    private String DoctorName;
    private String ClinicName;
    private String ClinicNumber;
    private String ClinicEmail;
    private Integer Experience;
    private String Week;
    private String timings;
    @Field("file_name")
    private String fileName;
    @Field("file_content_type")
    private String fileContentType;
    @Field("file_data")
    private byte[] fileData;
    public String Degrees;
    public String Specialization;
    public String Address;
    // Getter method for retrieving the file data without any arguments
    public byte[] getFileData(byte[] fileData) {
        return this.fileData;
    }
}
