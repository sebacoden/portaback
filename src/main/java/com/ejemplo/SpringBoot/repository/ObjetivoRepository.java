/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Objetivo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author W10-01
 */
public interface ObjetivoRepository extends JpaRepository <Objetivo,Long>{
    
}
