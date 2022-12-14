/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
        
/**
 *
 * @author W10-01
 */

@Getter @Setter
@Entity
public class Perfil{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column(length = 1300)    
    private String perfil;
    

    
    
    
    public Perfil(){
        
    }
    
    public Perfil(Long id,String perfil){
        this.id =id;
        this.perfil = perfil;
        
    }
    
}


