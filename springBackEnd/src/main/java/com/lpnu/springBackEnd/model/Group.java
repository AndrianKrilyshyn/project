package com.lpnu.springBackEnd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 10)
    private String name;
    @ManyToMany
    @JoinTable(name="group_lecture",
            joinColumns=  @JoinColumn(name="group_id", referencedColumnName="id"),
            inverseJoinColumns= @JoinColumn(name="lecture_id", referencedColumnName="id") )
    private List<Lecture> lectures;
}
