package com.example.book_my_doctor.DAO;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Document(collection = "Council")
public class Council {
    private String id;
    private String CouncilName;
    private Boolean isAprooved;
}
