package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2]; //deine un vector de tipo personas
        
        personas[0] = new Persona("Jose");
        personas[1] = new Persona("Carlos");
        
        System.out.println("personas 0 = " + personas[0]); //hay que crear el metodo toString para que muestre a la persona y no la direccion de memoria 
        System.out.println("personas 1 = " + personas[1]);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);        
        }
        
        String frutas[] = {"naranja", "platano", "uva"}; //otra forma de crear un vector
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);
        }
    }
}
