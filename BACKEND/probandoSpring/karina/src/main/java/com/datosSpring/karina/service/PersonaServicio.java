package com.datosSpring.karina.service;

import com.datosSpring.karina.model.Persona;
import com.datosSpring.karina.repository.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaServicio implements IPersonaService {

    @Autowired
    public PersonaRepositorio persRepo;
    
    
    @Override
    public List<Persona> verPersonas() {
      return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public void buscarPersona(Long id) {
        persRepo.findById(id).orElse(null);
    }

   
}
