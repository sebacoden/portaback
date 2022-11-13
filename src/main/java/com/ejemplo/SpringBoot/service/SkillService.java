/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.service;

/**
 *
 * @author W10-01
 */
import com.ejemplo.SpringBoot.model.Skill;
import com.ejemplo.SpringBoot.repository.SkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class SkillService implements ISkillService{
   
    @Autowired
    public SkillRepository SkillRepo;
    
    @Override
    public List<Skill> verSkill() {
        SkillRepo.findAll();
        return SkillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill per) {
        SkillRepo.save(per);
    }

    @Override
    public void borrarSkill(Long id) {
        SkillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return SkillRepo.findById(id).orElse(null);
       
    }
    
    
}
