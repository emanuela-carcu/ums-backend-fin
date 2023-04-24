package com.project.ums.controller;

import com.project.ums.model.Student;
import com.project.ums.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StudentController {

    @Autowired
    public StudentRepo studentRepo;

    @PostMapping("create")
    public Student createStudent(@RequestBody Student studentel){
        return studentRepo.save(studentel);
    }

    @GetMapping()
    public List<Student> students(){
        return studentRepo.findAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepo.deleteById(id);
    }


}
