/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.service;
import com.ejemplo.SpringBoot.model.Formacion;
import java.util.List;

/**
 *
 * @author W10-01
 */
public interface IFormacionService {
   
    public List<Formacion> verFormacion ();
    public void crearFormacion (Formacion For);
    public void borrarFormacion(Long id);
    public Formacion buscarFormacion(Long id);
 
}
