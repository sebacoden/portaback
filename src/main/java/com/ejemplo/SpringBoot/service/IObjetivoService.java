/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.service;
import com.ejemplo.SpringBoot.model.Objetivo;
import java.util.List;

/**
 *
 * @author W10-01
 */
public interface IObjetivoService {
    public List<Objetivo> verObjetivo ();
    public void crearObjetivo (Objetivo perf);
    public void borrarObjetivo (Long id);
    public Objetivo buscarObjetivo(Long id);
}
