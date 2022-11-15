/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.SpringBoot.Controller;


import com.ejemplo.SpringBoot.model.Skill;
import com.ejemplo.SpringBoot.service.ISkillService;
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
//cambiar la url para produccion 

@RestController
@CrossOrigin(origins ="https://portafront.web.app")
public class SkillControler {
    
    @Autowired
    private ISkillService SkillServ;
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PostMapping ("/new/skill")
    public void agregarSkill (@RequestBody Skill ski){
        SkillServ.crearSkill(ski);  
    }    
     
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skill> verSkills (){
        return SkillServ.verSkill();
    }
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @DeleteMapping ("/delete-skill/{id}")
    public void borrarSkill (@PathVariable Long id){
        SkillServ.borrarSkill(id);
    }
   
    
    @CrossOrigin(origins ="https://portafront.web.app")
    @PutMapping ("/update-skill/{id}")
    public void updateSkill (@PathVariable Long id , @RequestBody Skill ski){
     
      Skill mypersona = SkillServ.buscarSkill(id);
      
     SkillServ.crearSkill(mypersona);

    }

   
}
