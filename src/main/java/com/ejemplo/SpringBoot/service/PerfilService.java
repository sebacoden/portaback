/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.service;
import com.ejemplo.SpringBoot.model.Perfil;
import com.ejemplo.SpringBoot.repository.PerfilRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService {

    @Autowired
    public PerfilRepository perfilRepo;
    
    @Override
    public List<Perfil> verPerfil() {
        perfilRepo.findAll();
        return perfilRepo.findAll();
    }

    @Override
    public void crearPerfil(Perfil perf) {
        perfilRepo.save(perf);
    }

    @Override
    public void borrarPerfil(Long id) {
        perfilRepo.deleteById(id);
    }

    @Override
    public Perfil buscarPerfil(Long id) {
        return perfilRepo.findById(id).orElse(null);
       
    }
    
    
    
}