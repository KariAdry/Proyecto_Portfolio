
package com.portfoliofin.kary.Interface;


import com.portfoliofin.kary.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //trae una lista de personas
  public List<Persona> getPersona();  
  
  //guarda personas
  public void savePersonas(Persona persona);
  
  //busca persona mediante el id
  
  public Persona findPersona(Long id);
  
  //elimina una persona mjediante el id
  
  public void eliminaPersona(Long id);
  
  
  
  
}
