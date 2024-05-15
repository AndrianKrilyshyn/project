package com.lpnu.springBackEnd.impl;

import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.repository.InMemoryLectureDAO;
import com.lpnu.springBackEnd.service.LectureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryLectureService implements LectureService {
private final InMemoryLectureDAO repository;
    @Override
    public List<Lecture> findAll() {
        return repository.findAll();
    }

    @Override
    public Lecture addLecture(Lecture lecture) {
        return repository.addLecture(lecture);
    }

    @Override
    public Lecture findByGroupName(String group) {
        return repository.findByGroupName(group);
    }

    @Override
    public Optional<Lecture> findById(Long id) {
        return Optional.ofNullable(repository.findById(id));
    }

    @Override
    public Lecture updateLecture(Lecture lecture) {
        return repository.updateLecture(lecture);
    }

    @Override
    public void deleteLecture(Long id) {
         repository.deleteLecture(id);
    }
}
