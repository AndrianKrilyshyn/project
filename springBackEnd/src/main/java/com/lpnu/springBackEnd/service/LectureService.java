package com.lpnu.springBackEnd.service;

import com.lpnu.springBackEnd.model.Lecture;

import java.util.List;
import java.util.Optional;

public interface LectureService {

    List<Lecture> findAll();
    Lecture addLecture(Lecture lecture);
    Lecture findByGroupName(String group);
    Optional<Lecture> findById(Long id);
    Lecture updateLecture(Lecture lecture);
    void deleteLecture(Long id);
}
