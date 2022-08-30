/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.Controller;
//package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.service.IExperienciaService;
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


@RestController
@CrossOrigin(origins ="https://portafront.web.app")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService ExperienciaServ;
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        ExperienciaServ.crearExperiencia(exp);
        
    }    
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia (){
        return ExperienciaServ.verExperiencia();
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @DeleteMapping ("/delete-experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        ExperienciaServ.borrarExperiencia(id);
        
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @PutMapping ("/updateexp/{id}")
    public void updateExperiencia (@PathVariable Long id , @RequestBody Experiencia exp){
     
      Experiencia myexperiencia = ExperienciaServ.buscarExperiencia(id);
      
      ExperienciaServ.crearExperiencia(myexperiencia);

    }

}
