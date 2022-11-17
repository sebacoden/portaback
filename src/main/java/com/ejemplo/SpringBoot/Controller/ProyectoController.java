/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.Controller;

/**
 *
 * @author W10-01
 */

//import com.ejemplo.SpringBoot.model.Perfil;
//import com.ejemplo.SpringBoot.service.IPerfilService;
import com.ejemplo.SpringBoot.model.Perfil;
import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.service.IPerfilService;
import com.ejemplo.SpringBoot.service.IProyectoService;
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
public class ProyectoController {
    @Autowired
    private IProyectoService proyecServ;
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto proyec){
        proyecServ.crearProyecto(proyec);
    }    
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto (){
        return proyecServ.verProyecto();
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @DeleteMapping ("/delete-proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proyecServ.borrarProyecto(id);        
    }
    @CrossOrigin(origins ="https://portafront.web.app")
    @PutMapping ("/update-proyecto/{id}")
    public void updateProyecto (@PathVariable Long id , @RequestBody Proyecto proyec){
      Proyecto myperfil = proyecServ.buscarProyecto(id);
      myperfil = proyec;
      proyecServ.crearProyecto(myperfil);
    }

    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/get-proyecto/{id}")
    public Proyecto getProyecto (@PathVariable Long id){
         Proyecto myfor = proyecServ.buscarProyecto(id);
         return myfor;
    }


}
