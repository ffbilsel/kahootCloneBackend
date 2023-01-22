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
public class DropPin {

    private String question;

    private String mediaUri;

    private Double timeLimit;

    private PointValue pointValue;

    private Point answer;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Point {
        private int x;
        private int y;
    }

}
