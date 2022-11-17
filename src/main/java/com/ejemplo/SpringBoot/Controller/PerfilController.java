/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.Controller;
//package com.ejemplo.SpringBoot.PerfilController;

import com.ejemplo.SpringBoot.model.Perfil;
import com.ejemplo.SpringBoot.service.IPerfilService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author W10-01
 */

@RestController
@CrossOrigin(origins ="https://portafront.web.app")
public class PerfilController {
    
    @Autowired
    private IPerfilService perfilServ;
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/new/perfil")
    public void agregarPerfil (@RequestBody Perfil perf){
        perfilServ.crearPerfil(perf);
    }    
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/ver/perfil")
    @ResponseBody
    public List<Perfil> verPerfil (){
        return perfilServ.verPerfil();
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @DeleteMapping ("/delete-perfil/{id}")
    public void borrarPerfil (@PathVariable Long id){
        perfilServ.borrarPerfil(id);        
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/updateper/{id}")
    public void updatePerfil (@PathVariable Long id , @RequestBody Perfil perf){
      Perfil myperfil = perfilServ.buscarPerfil(id);
      myperfil = perf;
      perfilServ.crearPerfil(myperfil);

    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/get-perfil/{id}")
    public Perfil getFormacion (@PathVariable Long id){
         Perfil myfor=perfilServ.buscarPerfil(id);
         return myfor;
    }
}
