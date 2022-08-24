package com.datosSpring.karina.service;

import com.datosSpring.karina.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona pers);
    
    public void borrarPersona(Long id);
    
    public void buscarPersona(Long id);
    
    
    
}
