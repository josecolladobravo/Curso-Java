package test;

import datos.*;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao= new PersonaDAO();
        
        
        
        //Insertando un nuevo objeto de tipo Persona
        Persona personaNueva = new Persona("Miguel", "Ruiz", "mruiz@mail.com", "234342");
        personaDao.insertar(personaNueva);
        

        
        //Actualizar
        Persona persona2 = new Persona(4, "Carlitos", "Garcia", "cgarcia@mail.com", "456789023");
        personaDao.actualizar(persona2);
        

        
        //borrar
        Persona persona3 = new Persona(1);
        personaDao.borrar(persona3);
        
        List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
