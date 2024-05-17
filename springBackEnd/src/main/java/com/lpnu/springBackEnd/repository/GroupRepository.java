package com.lpnu.springBackEnd.repository;

import com.lpnu.springBackEnd.model.Group;
import com.lpnu.springBackEnd.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
//    List<Lecture> getAllLectures();
}
