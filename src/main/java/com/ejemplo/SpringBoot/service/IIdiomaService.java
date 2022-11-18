/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idioma;
import java.util.List;

/**
 *
 * @author W10-01
 */
public interface IIdiomaService {
     public List<Idioma> verIdioma ();
    public void crearIdioma (Idioma perf);
    public void borrarIdioma (Long id);
    public Idioma buscarIdioma(Long id);
}
