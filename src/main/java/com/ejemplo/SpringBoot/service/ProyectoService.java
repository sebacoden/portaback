/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.service;

/**
 *
 * @author W10-01
 */
import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.repository.PersonaRepository;
import com.ejemplo.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyecRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
        proyecRepo.findAll();
        return proyecRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyec) {
        proyecRepo.save(proyec);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyecRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto (Long id) {
        return proyecRepo.findById(id).orElse(null);
       
    }
}
