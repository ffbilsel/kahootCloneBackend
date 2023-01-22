package com.example.kahootbackend.entity;

import com.example.kahootbackend.en.PointValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class TypeAnswer {

    private String question;

    private String mediaUri;

    private double timeLimit;

    private PointValue pointValue;

    private List<String> possibleAnswers;

}
