/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Objetivo;
import com.ejemplo.SpringBoot.model.Perfil;
import com.ejemplo.SpringBoot.service.IObjetivoService;
import com.ejemplo.SpringBoot.service.IPerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author W10-01
 */

@RestController
@CrossOrigin(origins ="https://portafront.web.app")
public class ObjetivoController {
    
    @Autowired
    private IObjetivoService perfilServ;
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/new/objetivo")
    public void agregarObjetivo (@RequestBody Objetivo perf){
        perfilServ.crearObjetivo(perf);
    }    
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/ver/objetivo")
    @ResponseBody
    public List<Objetivo> verObjetivo (){
        return perfilServ.verObjetivo();
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @DeleteMapping ("/delete-objetivo/{id}")
    public void borrarObjetivo (@PathVariable Long id){
        perfilServ.borrarObjetivo(id);        
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @PutMapping ("/update-objetivo/{id}")
    public void updatePerfil (@PathVariable Long id , @RequestBody Objetivo perf){
      Objetivo myperfil = perfilServ.buscarObjetivo(id);
      myperfil = perf;
      perfilServ.crearObjetivo(myperfil);

    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/get-objetivo/{id}")
    public Objetivo getObjetivo (@PathVariable Long id){
         Objetivo myfor=perfilServ.buscarObjetivo(id);
         return myfor;
    }
}
