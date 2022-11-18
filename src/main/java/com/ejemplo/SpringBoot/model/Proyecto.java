/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.model;

/**
 *
 * @author W10-01
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
        
@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
            
    
    private String descripcion;
    
    @Column(length = 1300)
    private String fecha;
   
     public Proyecto(){
        
    }
    
    public Proyecto(Long id,String descripcion,String fecha){
        this.id =id;
        this.descripcion = descripcion;
        this.fecha = fecha;
               
    }
}
