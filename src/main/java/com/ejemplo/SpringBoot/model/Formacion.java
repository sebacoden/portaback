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
        
/**
 *
 * @author W10-01
 */


@Getter @Setter
@Entity
public class Formacion {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String datos;
    
    public Formacion(){
        
    }
    
    public Formacion(Long id,String datos){
        this.id =id;
        this.datos = datos;
        }
    
}

    

