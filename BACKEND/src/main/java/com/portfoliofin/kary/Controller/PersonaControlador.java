
package com.portfoliofin.kary.Controller;

import com.portfoliofin.kary.Entity.Persona;
import com.portfoliofin.kary.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

    @GetMapping ("/hola/{nombre}")
    
    public String decirHola(@PathVariable String nombre){
     
        return"Hola mundo " + nombre;
}
    @GetMapping("/chau")
    public String decirChau(@RequestParam String nombre,
                            @RequestParam String apellido){
        return "Chau mundo " + nombre  +  " apellido: " +  apellido;
    }
}*/
@RestController
public class PersonaControlador {
   @Autowired IPersonaService ipersonaService;
  
   @GetMapping("/personas/traer")
   public List<Persona> getPersona(){
   return ipersonaService.getPersona();
   }
   
   @PostMapping("/personas/crear")
   public String Persona (@RequestBody Persona persona){
   ipersonaService.savePersonas(persona);
   return "La persona esta correctamente creada";
   }
   
   @DeleteMapping("/personas/borrar/{id}")
   public String deletePersona(@PathVariable Long id){
   ipersonaService.eliminaPersona(id);
   return"La persona fue eliminada satisfactoriamente";
   }
   
   @PutMapping("/personas/editar/{id}")
   public Persona editPersona (@PathVariable Long id,
                               @RequestParam ("nombre")String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("email")String nuevoEmail,
                               @RequestParam ("img") String nuevaImagen){
  Persona persona = ipersonaService.findPersona(id);
  
  persona.setNombre(nuevoNombre);
  persona.setApellido(nuevoApellido);
  persona.setEmail(nuevoEmail);
  persona.setImg(nuevaImagen);
  
  ipersonaService.savePersonas(persona);
  return persona;
   }
}


 