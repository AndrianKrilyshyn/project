package com.lpnu.springBackEnd.controller;

import com.lpnu.springBackEnd.model.Task;
import com.lpnu.springBackEnd.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {
    private final TaskService service;

    @GetMapping
    public List<Task> findAll(){
        return service.findAll();
    }
    @GetMapping("id/{id}")
    public Task findById(@PathVariable Long id){
        return service.findById(id);
    }
    @GetMapping("st/{status}")
    public Task findByStatus(@PathVariable String status){
        return service.findByStatus(status);
    }
    @PostMapping("save_task")
    public Task saveTask(@RequestBody Task task){
        return service.saveTask(task);
    }
    @PutMapping("update_task")
    public Task updateTask(@RequestBody Task task){
        return service.updateTask(task);
    }

    @DeleteMapping("delete_task/{id}")
    public void deleteTask(@PathVariable Long id){
        service.deleteTask(id);
    }

}
