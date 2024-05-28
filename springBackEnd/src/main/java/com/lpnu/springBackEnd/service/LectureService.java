package com.lpnu.springBackEnd.service;

import com.lpnu.springBackEnd.model.Lecture;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface LectureService {

    List<Lecture> findAll();
    Lecture addLecture(Lecture lecture);
    Lecture findByGroupName(String group);
    Lecture findById(Long id);
    Lecture updateLecture(Lecture lecture);
    void deleteLecture(Long id);
    public List<Lecture> findAllByGroupName( String group);
}
