package com.lpnu.springBackEnd.service;

import com.lpnu.springBackEnd.model.Group;
import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.model.Task;

import java.util.List;

public interface GroupService {
    List<Group> findAll();
    Group saveGroup(Group group);
    Group findByName(String name);
    Group findById(Long id);
//    List<Lecture> getAllLectures();
    void deleteGroup(Long id);
}

