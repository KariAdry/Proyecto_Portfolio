package com.datosSpring.karina.security.repository;

import com.datosSpring.karina.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
   Optional<Usuario>findByNombre_Usuario(String nombre_usuario); 
   
   boolean existsByNombre_Usuario(String nombre_usuario);
   
   boolean existsByEmail(String email);
   
   
   
}
