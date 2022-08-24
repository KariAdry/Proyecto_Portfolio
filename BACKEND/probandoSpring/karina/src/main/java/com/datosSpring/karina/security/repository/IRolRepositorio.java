package com.datosSpring.karina.security.repository;

import com.datosSpring.karina.security.entity.RolModel;
import com.datosSpring.karina.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRolRepositorio extends JpaRepository<RolModel,Integer>{
   Optional<RolModel>findByRolNombre(RolNombre rolNombre); 
}
