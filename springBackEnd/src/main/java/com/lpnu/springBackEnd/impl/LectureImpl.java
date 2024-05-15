package com.lpnu.springBackEnd.impl;

import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.repository.LectureRepository;
import com.lpnu.springBackEnd.service.LectureService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class LectureImpl implements LectureService {
    private final LectureRepository repository;
    @Override
    public List<Lecture> findAll() {
        return repository.findAll();
    }

    @Override
    public Lecture addLecture(Lecture lecture) {
        return repository.save(lecture);
    }

    @Override
    public Lecture findByGroupName(String group) {
        Lecture byGroupName = repository.findByGroupName(group);
        return byGroupName;
    }

    @Override
    public Optional<Lecture> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Lecture updateLecture(Lecture lecture) {
        return repository.save(lecture);
    }

    @Override
    @Transactional
    public void deleteLecture(Long id) {
        repository.deleteById(id);
    }
}
