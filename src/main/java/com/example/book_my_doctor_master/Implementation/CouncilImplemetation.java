package com.example.book_my_doctor.Implementation;

import com.example.book_my_doctor.DAO.Council;
import com.example.book_my_doctor.Repository.CouncilRepository;
import com.example.book_my_doctor.Service.CouncilService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CouncilImplemetation implements CouncilService {
    private final CouncilRepository councilRepository;

    @Autowired
    public CouncilImplemetation(CouncilRepository councilRepository) {
        this.councilRepository = councilRepository;
    }

    @Override
    public Optional<Council> isApproved(ObjectId councilId) {
        // Retrieve the council by its ID
        Council council = councilRepository.findById(councilId)
                .orElseThrow();

        // Set the isApproved field to true
        council.setIsAprooved(true);

        // Save the updated council entity
        return Optional.of(councilRepository.save(council));
    }
}
