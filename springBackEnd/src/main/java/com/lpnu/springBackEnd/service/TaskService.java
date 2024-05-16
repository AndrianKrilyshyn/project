package com.lpnu.springBackEnd.service;

import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.model.Task;
import com.lpnu.springBackEnd.repository.TaskRepository;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
    Task saveTask(Task task);
    Task findByStatus(String status);
    Task findById(Long id);
    Task updateTask(Task task);
    void deleteTask(Long id);
}
