/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvb.reto31.reto3_1.service;

import com.mvb.reto31.reto3_1.entity.Game;
import com.mvb.reto31.reto3_1.repository.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mario Velasquez
 */
@Service
public class GameService {
    @Autowired
    private GameRepository repository;
    
    public Game saveGameAll(Game game){
        return repository.save(game);
    }
    
    public List<Game> getGameAll(){
        return repository.findAll();
    }
    
    public Game UpdateGame(Game game){
        Game existeGame=repository.findById(game.getId()).orElse(null);
        existeGame.setDeveloper(game.getDeveloper());
        existeGame.setYear(game.getYear());
        return repository.save(existeGame);
    }
    
    public String deleteGame(int id){
        repository.deleteById(id);
        return "Item Removido"+id;
    }
}
