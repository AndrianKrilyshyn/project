package com.lpnu.springBackEnd.repository;

import com.lpnu.springBackEnd.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
    Lecture findByGroupName(String group);

}
