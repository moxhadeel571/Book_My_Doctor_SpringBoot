package com.example.book_my_doctor.Implementation;

import com.example.book_my_doctor.DAO.Doctor;
import com.example.book_my_doctor.Repository.DoctorRepository;
import com.example.book_my_doctor.Service.DoctorService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceimplementation implements DoctorService {

private DoctorRepository doctorRepository;
@Autowired
    public DoctorServiceimplementation(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public ObjectId addDoctor(MultipartFile file, Doctor doctor) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null.");
        }
        Doctor doctor1=new  Doctor();
        byte[] fileData = file.getBytes();
        String fileName = file.getOriginalFilename();
        String contentType = file.getContentType();
        doctor.setFileContentType(contentType);
        doctor.setFileName(fileName);
        doctor.getFileData(fileData);
        doctor.setDoctorName(doctor1.getDoctorName());
        doctor.setSpecialization(doctor1.getSpecialization());
        doctor.setAddress(doctor1.getAddress());
        doctor.setClinicNumber(doctor1.getClinicNumber());
        doctor.setClinicEmail(doctor1.getClinicEmail());
        doctor.setDegrees(doctor1.getDegrees());
        doctor.setExperience(doctor1.getExperience());
        doctor.setClinicName(doctor1.getClinicName());
        Doctor saved = doctorRepository.save(doctor);

        return saved.getId();
    }

    @Override
    public List<Doctor> getDoctorList() {
        return doctorRepository.findAll();
    }

    @Override
    public Optional<Doctor> findById(ObjectId id) {
        return doctorRepository.findById(id);
    }
}
