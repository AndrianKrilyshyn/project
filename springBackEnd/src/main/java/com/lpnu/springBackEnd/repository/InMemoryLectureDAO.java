package com.lpnu.springBackEnd.repository;

import com.lpnu.springBackEnd.model.Lecture;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryLectureDAO {
    private final List<Lecture> LECTURES = new ArrayList<>();

    public List<Lecture> findAll() {
        return LECTURES;
    }

    public Lecture addLecture(Lecture lecture) {
        LECTURES.add(lecture);
        return lecture;
    }

    public Lecture findByGroupName(String groupName) {
        return LECTURES.stream()
                .filter(lecture -> lecture.getGroupName().equals(groupName))
                .findFirst()
                .orElse(null);
    }

    public Lecture updateLecture(Lecture lecture) {
        int lectureIndex = IntStream.range(0, LECTURES.size())
                .filter(index -> LECTURES.get(index).getId().equals(lecture.getId()))
                .findFirst()
                .orElse(-1);
        if (lectureIndex > -1) {
            LECTURES.set(lectureIndex, lecture);
            return lecture;
        }
        return null;
    }
    public Lecture findById(Long id) {
        return LECTURES.stream().filter(lecture -> lecture.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public String deleteLecture(Long id) {
        Lecture lecture = findById(id);
        LECTURES.remove(lecture);
        return "lecture was delete";
    }
}
