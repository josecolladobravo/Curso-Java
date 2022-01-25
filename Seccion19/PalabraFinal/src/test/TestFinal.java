package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10; //no se puede modificar el valor de la variable al ser final
        System.out.println("miVariable = " + miVariable);
        
        System.out.println("MI CONSTANTE: " + Persona.MI_CONSTANTE);
    }
    
}
