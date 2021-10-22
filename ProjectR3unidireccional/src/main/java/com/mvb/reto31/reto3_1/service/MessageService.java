/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvb.reto31.reto3_1.service;

import com.mvb.reto31.reto3_1.entity.Message;
import com.mvb.reto31.reto3_1.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;
    
    public Message saveMessageAll(Message message){
        return repository.save(message);
    }

    public List<Message> getMessageAll(){
        return repository.findAll();
    }

    public Message updateMessage(Message message){
        Message existeMessage=repository.findById(message.getIdMessage()).orElse(null);
        //existeMessage.setId(message.getId());
        existeMessage.setMessageText(message.getMessageText());
        return repository.save(existeMessage);
    }

    public String deleteMessage(int id){
        repository.deleteById(id);
        return "Item Removido"+id;
    }
}
