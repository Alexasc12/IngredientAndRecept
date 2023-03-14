package com.example.demo.controller;

import com.example.demo.dto.ReceptDTO;
import com.example.demo.model.Recept;
import com.example.demo.service.ReceptService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class ReceptController {

    ReceptService receptService;

    public ReceptController(ReceptService receptService) {
        this.receptService = receptService;
    }

    @GetMapping("/{id}")
    public Recept getRecept(@PathVariable("id") int id) {
        return receptService.getRecept(id);
    }

    @PostMapping()
    public ReceptDTO addRecept(@RequestBody Recept recept) {
        return receptService.postRecept(recept);
    }




}
