/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.model;

/**
 *
 * @author W10-01
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
        
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String fecha;
    private String email;
    private String recidencia; 
    private Long telefono;
    private Long dni;
    
    
    public Persona(){
        
    }
    
    public Persona(Long id,String nombre,String fecha,String email,String recidencia,Long telefono,Long dni){
        this.id =id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.email=email;
        this.recidencia=recidencia;
        this.telefono=telefono;
        this.dni=dni;
        
    }
    
}
