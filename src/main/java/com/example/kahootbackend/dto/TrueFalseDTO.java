package com.example.kahootbackend.entity;

import com.example.kahootbackend.en.PointValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class TrueFalse {

    private String question;

    private String mediaUri;

    private Boolean answer;

    private double timeLimit;

    private PointValue pointValue;

}
