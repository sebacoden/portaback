/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Formacion;
import com.ejemplo.SpringBoot.repository.FormacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author W10-01
 */

@Service
public class FormacionService implements IFormacionService {
    
    @Autowired
    public FormacionRepository FormacionRepo;
    
    @Override
    public List<Formacion> verFormacion() {
        FormacionRepo.findAll();
        return FormacionRepo.findAll();
    }

    @Override
    public void crearFormacion(Formacion fer) {
        FormacionRepo.save(fer);
    }

    @Override
    public void borrarFormacion(Long id) {
        FormacionRepo.deleteById(id);
    }

    @Override
    public Formacion buscarFormacion(Long id) {
        return FormacionRepo.findById(id).orElse(null);
    }
    
    
    
}