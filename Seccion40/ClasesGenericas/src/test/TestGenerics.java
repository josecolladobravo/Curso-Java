package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoTipoInt = new ClaseGenerica(15); //esto llama al constructor de la clase. El tipo de la clase es dinamica
        objetoTipoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoTipoString = new ClaseGenerica("Juan");
        objetoTipoString.obtenerTipo();
                
    }
}
