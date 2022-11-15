/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Skill;
import java.util.List;

/**
 *
 * @author W10-01
 */
public interface ISkillService {
    
    public List<Skill> verSkill();
    public void crearSkill(Skill ski);
    public void borrarSkill(Long id);
    public Skill buscarSkill(Long id);
    
}
