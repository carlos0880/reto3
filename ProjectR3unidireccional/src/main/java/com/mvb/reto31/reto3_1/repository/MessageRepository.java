/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mvb.reto31.reto3_1.repository;

import com.mvb.reto31.reto3_1.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Acer
 */
public interface MessageRepository extends JpaRepository<Message,Integer>{
    
}
