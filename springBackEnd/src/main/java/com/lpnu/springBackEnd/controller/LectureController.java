package com.lpnu.springBackEnd.controller;

import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.service.LectureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/lectures")
public class LectureController {
    private LectureService service;

    @GetMapping
    public List<Lecture> findAll(){
       return service.findAll();
    }
    @GetMapping("id/{id}")
    public Lecture findById(@PathVariable Long id){
        return service.findById(id);
    }
    @GetMapping("gr/{group}")
    public Lecture findByGroupName(@PathVariable String group){
       return service.findByGroupName(group);
    }
    @GetMapping("grs/{group}")
    public List<Lecture>  findAllByGroupName(@PathVariable String group){
        return service.findAllByGroupName(group);
    }
    @GetMapping("gr/{group}/{dayOfWeek}")
    public List<Lecture>  findAllByGroupNameAndDayOfWeek(@PathVariable String group, @PathVariable String dayOfWeek){
        return service.findAllByGroupNameAndDayOfWeek(group, dayOfWeek);
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
