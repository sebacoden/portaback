/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.Controller;
//package com.ejemplo.SpringBoot.FormacionController;

import com.ejemplo.SpringBoot.model.Formacion;
import com.ejemplo.SpringBoot.service.IFormacionService;
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
public class FormacionController {
    
    @Autowired
    private IFormacionService FormServ;
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/new/formacion")
    public void agregarFormacion (@RequestBody Formacion form){
        FormServ.crearFormacion(form);
        
    }    
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/ver/formacion")
    @ResponseBody
    public List<Formacion> verFormacion (){
        return FormServ.verFormacion();
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @DeleteMapping ("/delete-formacion/{id}")
    public void borrarFormacion (@PathVariable Long id){
        FormServ.borrarFormacion(id);
        
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @PutMapping ("/updatefor/{id}")
    public void updateFormacion (@PathVariable Long id , @RequestBody Formacion exp){
     
      Formacion myformacion = FormServ.buscarFormacion(id);
      FormServ.crearFormacion(exp);

    }

   
}


