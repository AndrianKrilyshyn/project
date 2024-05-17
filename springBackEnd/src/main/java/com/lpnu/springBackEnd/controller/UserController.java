package com.lpnu.springBackEnd.controller;

import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.model.Task;
import com.lpnu.springBackEnd.model.User;
import com.lpnu.springBackEnd.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {
    private final UserService service;

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }
    @GetMapping("id/{id}")
    public User findById(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping("em/{email}")
    public User findByEmail(@PathVariable String email){
        return service.getByEmail(email);
    }
    @PostMapping("save_user")
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @DeleteMapping("delete_user/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteUser(id);
    }

//    @GetMapping("get_tasks")
//    public List<Task> getAllTasks(){
//        return service.getAllTasks();
//    }
}
