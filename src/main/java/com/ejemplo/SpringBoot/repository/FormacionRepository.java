/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.repository;
import com.ejemplo.SpringBoot.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author W10-01
 */
@Repository
public interface FormacionRepository extends JpaRepository <Formacion,Long>{
    
}