/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idioma;
import com.ejemplo.SpringBoot.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author W10-01
 */
@Service
public class IdiomaService implements IIdiomaService{
    
    @Autowired
    public IdiomaRepository FormacionRepo;
    
    @Override
    public List<Idioma> verIdioma() {
        FormacionRepo.findAll();
        return FormacionRepo.findAll();
    }

    @Override
    public void crearIdioma(Idioma fer) {
        FormacionRepo.save(fer);
    }

    @Override
    public void borrarIdioma(Long id) {
        FormacionRepo.deleteById(id);
    }

    @Override
    public Idioma buscarIdioma(Long id) {
        return FormacionRepo.findById(id).orElse(null);
    }
    
    
}
