package com.datosSpring.karina.security.service;

import com.datosSpring.karina.security.entity.Usuario;
import com.datosSpring.karina.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional

public class UsuarioService {
  @Autowired
  IUsuarioRepository IusuarioRepository;
  

  public Optional<Usuario>getReferenceByNombreUsuario(String nombreUsuario){
    return IusuarioRepository.findByNombre_Usuario(nombreUsuario);
}
  
   public boolean existsByNombreUsuario(String nombreUsuario){
    return IusuarioRepository.existsByNombre_Usuario(nombreUsuario);
    }  
    
   public boolean existsByEmail(String email){
    return IusuarioRepository.existsByEmail(email);
    }
   
   public void save(Usuario usuario){
   IusuarioRepository.save(usuario);
   }

    
}
