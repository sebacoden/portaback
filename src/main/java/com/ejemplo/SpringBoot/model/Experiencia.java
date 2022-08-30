/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String experiencia;
    
    public Experiencia(){
        
    }
    
    public Experiencia(Long id,String experiencia){
        this.id =id;
        this.experiencia = experiencia;
       
        
    }
    //Me faltaban getters and setters
    //los agrego a mano
    
   // public long getId(){
   //     return id;
   // }
   // public long setId(long id){
   //     return this.id;
   // }
   // public String getExperiencia(){
   //     return experiencia;
   // }
   // public String setExperiencia(String experiencia){
    //    return this.experiencia;
    //}
    
   
   
    
}
