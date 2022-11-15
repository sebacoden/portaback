/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.service;

/**
 *
 * @author W10-01
 */
import com.ejemplo.SpringBoot.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto ();
    public void crearProyecto (Proyecto proyec);
    public void borrarProyecto (Long id);
    public Proyecto buscarProyecto(Long id);
}
