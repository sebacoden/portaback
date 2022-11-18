package com.ejemplo.SpringBoot.service;
import com.ejemplo.SpringBoot.model.Objetivo;
import com.ejemplo.SpringBoot.repository.ObjetivoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author W10-01
 */
@Service
public class ObjetivoService implements IObjetivoService{
    
    @Autowired
    public ObjetivoRepository FormacionRepo;
    
    @Override
    public List<Objetivo> verObjetivo() {
        FormacionRepo.findAll();
        return FormacionRepo.findAll();
    }

    @Override
    public void crearObjetivo(Objetivo fer) {
        FormacionRepo.save(fer);
    }

    @Override
    public void borrarObjetivo(Long id) {
        FormacionRepo.deleteById(id);
    }

    @Override
    public Objetivo buscarObjetivo(Long id) {
        return FormacionRepo.findById(id).orElse(null);
    }
    
    
}