/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author W10-01
 */
public class Idioma {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String idioma;
    
    public Idioma(){
        
    }
    
    public Idioma(Long id,String idioma){
        this.id =id;
        this.idioma = idioma;
        }
}
