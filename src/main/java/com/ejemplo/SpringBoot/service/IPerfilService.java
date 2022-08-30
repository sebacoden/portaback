/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.service;
import com.ejemplo.SpringBoot.model.Perfil;
import java.util.List;

/**
 *
 * @author W10-01
 */
public interface IPerfilService {
  
    public List<Perfil> verPerfil ();
    public void crearPerfil (Perfil perf);
    public void borrarPerfil (Long id);
    public Perfil buscarPerfil(Long id);
    

}
