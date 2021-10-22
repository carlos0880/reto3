/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvb.reto31.reto3_1.controller;

import com.mvb.reto31.reto3_1.entity.Score;
import com.mvb.reto31.reto3_1.service.ScoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Acer
 */
@RestController 
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService service;
    
    @GetMapping("/all")
    public List<Score> findAllScore(){
        return service.getScoreAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addScore(@RequestBody Score score){
        service.saveScoreAll(score);
        return ResponseEntity.status(201).build();
    }
    
    /*@PutMapping("/update")
    public ResponseEntity updateScore(@RequestBody Score score){
        service.updateScore(score);
        return ResponseEntity.status(201).build();
    }    

    @DeleteMapping("/delete")    
        public ResponseEntity deleteScore(@RequestBody Score score){
        service.deleteScore(score.getId());
        return ResponseEntity.status(204).build();
    }*/
}
