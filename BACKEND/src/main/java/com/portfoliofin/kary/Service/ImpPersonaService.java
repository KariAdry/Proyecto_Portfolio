
package com.portfoliofin.kary.Service;

import com.portfoliofin.kary.Entity.Persona;
import com.portfoliofin.kary.Interface.IPersonaService;
import com.portfoliofin.kary.Repository.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
 @Autowired IPersonaRepositorio ipersonaRepositorio;
    //persona es una variable del objeto Persona
   //iperonaRepositorio tambien es una variable de IPersonaRepositorio
 //si no tengo la palabra void, tengo quecolocar un returnpara que me retorne algo
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepositorio.findAll();
        return persona;
    }

    @Override
    public void savePersonas(Persona persona) {
       ipersonaRepositorio.save(persona);
    }
//aqui le digo que busque una persona por id,si no la encuentra que me retorne null
    @Override
    public Persona findPersona(Long id) {
        Persona persona =ipersonaRepositorio.findById(id).orElse(null);
       return persona;
    }

    @Override
    public void eliminaPersona(Long id) {
        ipersonaRepositorio.deleteById(id);
    }
    
}
