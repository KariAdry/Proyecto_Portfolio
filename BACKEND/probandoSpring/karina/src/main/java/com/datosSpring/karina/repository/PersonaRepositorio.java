package com.datosSpring.karina.repository;

import com.datosSpring.karina.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PersonaRepositorio extends JpaRepository<Persona,Long>{
   
    
    
    
}
