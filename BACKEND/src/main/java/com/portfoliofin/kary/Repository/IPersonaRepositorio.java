package com.portfoliofin.kary.Repository;

import com.portfoliofin.kary.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona, Long> {
    
}
