package com.lpnu.springBackEnd.repository;

import com.lpnu.springBackEnd.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
    Lecture findByGroupName(String group);
    List<Lecture> findAllByGroupName(String group);
    List<Lecture>  findAllByGroupNameAndDayOfWeek( String group,  String dayOfWeek);

}
