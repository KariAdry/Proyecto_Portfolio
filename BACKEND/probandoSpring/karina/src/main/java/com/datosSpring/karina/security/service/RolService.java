package com.datosSpring.karina.security.service;

import com.datosSpring.karina.security.entity.RolModel;
import com.datosSpring.karina.security.enums.RolNombre;
import com.datosSpring.karina.security.repository.IRolRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepositorio iRolRepositorio;
    
    public Optional <RolModel>getReferenceByRolNombre(RolNombre rolNombre){
    return iRolRepositorio.findByRolNombre(rolNombre);
    }
    
    public void save(RolModel rolModel){
     iRolRepositorio.save(rolModel);
    }
}
