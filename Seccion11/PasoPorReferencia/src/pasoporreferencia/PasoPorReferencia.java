package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Persona persona1= new Persona();
        
        persona1.nombre="Juan";
        System.out.println("persona nombre = " + persona1.nombre);
    
        cambiaValor(persona1); //como trabajamos con objetos, si se modifica el valor ya que apunta a la misma direccion de memoria el nuevo metodo
        System.out.println("persona con nombre ya cambiado= " + persona1.nombre);
    }
    
    public static void cambiaValor(Persona persona){
        persona.nombre="Karla";
    }
  
}
