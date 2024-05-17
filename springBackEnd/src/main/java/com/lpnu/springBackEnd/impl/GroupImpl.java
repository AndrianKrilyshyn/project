package com.lpnu.springBackEnd.impl;

import com.lpnu.springBackEnd.model.Group;
import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.repository.GroupRepository;
import com.lpnu.springBackEnd.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class GroupImpl implements GroupService {
    private final GroupRepository repository;
    @Override
    public List<Group> findAll() {
        return repository.findAll();
    }

    @Override
    public Group saveGroup(Group group) {
        return repository.save(group);
    }

    @Override
    public Group findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Group findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

//    @Override
//    public List<Lecture> getAllLectures() {
//        return repository.getAllLectures();
//    }

    @Override
    public void deleteGroup(Long id) {
        repository.deleteById(id);
    }
}
