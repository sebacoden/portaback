/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Idioma;
import com.ejemplo.SpringBoot.service.IIdiomaService;
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
public class IdiomaController {
    @Autowired
    private IIdiomaService perfilServ;
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/new/idioma")
    public void agregarIdioma (@RequestBody Idioma idiom){
        perfilServ.crearIdioma(idiom);
    }    
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/ver/idioma")
    @ResponseBody
    public List<Idioma> verIdioma (){
        return perfilServ.verIdioma();
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @DeleteMapping ("/delete-idioma/{id}")
    public void borrarIdioma (@PathVariable Long id){
        perfilServ.borrarIdioma(id);        
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @PutMapping ("/update-idioma/{id}")
    public void updateIdioma (@PathVariable Long id , @RequestBody Idioma perf){
      Idioma myperfil = perfilServ.buscarIdioma(id);
      myperfil = perf;
      perfilServ.crearIdioma(myperfil);

    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/get-idioma/{id}")
    public Idioma getIdioma (@PathVariable Long id){
         Idioma myfor=perfilServ.buscarIdioma(id);
         return myfor;
    }
}
