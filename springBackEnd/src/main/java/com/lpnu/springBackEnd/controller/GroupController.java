package com.lpnu.springBackEnd.controller;

import com.lpnu.springBackEnd.model.Group;
import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.model.Task;
import com.lpnu.springBackEnd.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/groups")
public class GroupController {
    private final GroupService service;
    @GetMapping
    public List<Group> findAll(){
        return service.findAll();
    }
    @GetMapping("id/{id}")
    public Group findById(@PathVariable Long id){
        return service.findById(id);
    }
    @GetMapping("name/{name}")
    public Group findByName(@PathVariable String name){
        return service.findByName(name);
    }
    @PostMapping("save_group")
    public Group saveGroup(@RequestBody Group group){
        return service.saveGroup(group);
    }
//@GetMapping("lectures")// можливо тут потрібно додати id групи, список якої потрібно дістати
////або просто через findByID дістати групу, а потім через геттер список лекцій
//public List<Lecture> getAllLectures(){
//        return  service.getAllLectures();
//}
    @DeleteMapping("delete_group/{id}")
    public void deleteGroup(@PathVariable Long id){
        service.deleteGroup(id);
    }

}
