/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.service;
import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository ExperienciaRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        ExperienciaRepo.findAll();
        return ExperienciaRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        ExperienciaRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        ExperienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return ExperienciaRepo.findById(id).orElse(null);
       
    }
  
    
    
    
    
   
}
