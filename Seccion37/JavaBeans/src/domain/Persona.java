package domain;

import java.io.Serializable;

//clase JavaBeans
public class Persona implements Serializable{ //implements Serializable para poder usar la clase con las tecnologias
    private String nombre;
    private String apellido;
    
    public Persona(){//necesita un constructor vacio para que las tecnologias avanzadas hagan uso de el
        
    }
    
    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
