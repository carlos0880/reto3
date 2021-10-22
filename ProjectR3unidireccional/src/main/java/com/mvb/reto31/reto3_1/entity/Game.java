/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvb.reto31.reto3_1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Mario Velasquez
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="game")

public class Game implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String developer;
    private int year;
    private String name;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("games")
    private Category category;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="game")
    //@OneToMany(cascade = CascadeType.ALL, mappedBy="game")
    @JsonIgnoreProperties({"game","client"})// agrego client
    private List<Message> messages;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="game")
    //@OneToMany(cascade = CascadeType.ALL, mappedBy="game")
    @JsonIgnoreProperties({"game","message"})//agrego message
    private List<Reservation> reservations;
    
    


    
}
