package com.lpnu.springBackEnd.impl;

import com.lpnu.springBackEnd.model.Task;
import com.lpnu.springBackEnd.repository.TaskRepository;
import com.lpnu.springBackEnd.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskImpl implements TaskService {
    private final TaskRepository repository;
    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return repository.save(task);
    }

    @Override
    public Task findByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Override
    public Task findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Task updateTask(Task task) {
        return repository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
