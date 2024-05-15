package com.lpnu.springBackEnd.controller;

import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.service.LectureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/backend")
public class LectureController {
    private LectureService service;

    @GetMapping
    public List<Lecture> findAll(){
       return service.findAll();
    }
    @GetMapping("id/{id}")
    public Optional<Lecture> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @GetMapping("gr/{group}")
    public Lecture findByGroupName(String group){
        Lecture lecture = service.findByGroupName(group);
        return lecture;
    }
    @PostMapping("save_lecture")
    public Lecture saveLecture(@RequestBody Lecture lecture){
        return service.addLecture(lecture);
    }
    @PutMapping("update_lecture")
    public Lecture updateLecture(@RequestBody Lecture lecture){
        return service.updateLecture(lecture);
    }
    @DeleteMapping("delete_lecture/{id}")
    public void deleteLecture(@PathVariable Long id){
         service.deleteLecture(id);
    }
}
