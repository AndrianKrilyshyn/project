package com.lpnu.springBackEnd.service;

import com.lpnu.springBackEnd.model.Task;
import com.lpnu.springBackEnd.model.User;

import java.util.List;

public interface UserService {
    User getById(Long id);
    User getByEmail(String email);
    List<User> findAll();
    User saveUser(User user);

    void deleteUser(Long id);
//    List<Task> getAllTasks();
}
