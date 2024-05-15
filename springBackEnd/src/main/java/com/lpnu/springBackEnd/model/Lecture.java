package com.lpnu.springBackEnd.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(length = 10)
    private String groupName;

    private Integer lessonNumber;

    @Column( length = 40)
    private String subject;

    @Column( length = 30)
    private String teacher;

    @Column( length = 20)
    private String typeLesson;

    @Column( length = 40)
    private String location;

    @Column( length = 15)
    private String dayOfWeek;

    @Column(name = "start_time")
    private LocalDate startTime;
}