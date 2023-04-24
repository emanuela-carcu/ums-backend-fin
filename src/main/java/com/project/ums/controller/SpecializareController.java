package com.project.ums.controller;

import com.project.ums.model.Specializare;
import com.project.ums.repo.SpecializareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specializare")
public class SpecializareController {

    @Autowired
    public SpecializareRepo specializareRepo;

    @PostMapping("create")
    public Specializare createSpecializare(@RequestBody Specializare specializare){
        return specializareRepo.save(specializare);
    }

    @GetMapping()
    public List<Specializare> specializari(){
        return specializareRepo.findAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteSpecializare(@PathVariable Long id) {
        specializareRepo.deleteById(id);
    }
}
