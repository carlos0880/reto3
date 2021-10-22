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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Mario Velasquez
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="client")
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    private String name;
    private String email;
    private String password;
    private int age;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="client")
    //@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    @JsonIgnoreProperties("client")
    private List<Message> messages;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="client")
    //@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    @JsonIgnoreProperties("client")
    private List<Reservation> reservations;
}
