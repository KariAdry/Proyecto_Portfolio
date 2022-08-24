package com.datosSpring.karina.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)       
            
    Long id;
    
    String nombre;
    String apellido;
    String img;
    
    public Persona(){
                }
    
    public Persona(Long id, String nombre, String apellido, String img){
      
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }
}
