package com.example.kahootbackend.entity;

import com.example.kahootbackend.en.AnswerMargin;
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
public class Slider {

    private String question;

    private String mediaUri;

    private double timeLimit;

    private PointValue pointValue;

    private AnswerMargin answerMargin;

    private int stepValue;

    private int min;

    private int max;

}
