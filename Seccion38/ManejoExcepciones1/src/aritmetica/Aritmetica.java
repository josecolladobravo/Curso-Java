package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador)throws OperacionExcepcion{//hay que poner throws para indicar que posiblemente el metodo puede arrojar una excepcion
        if(denominador==0){
            throw new OperacionExcepcion("no se puede la division entre cero");
        }
        
        return numerador/denominador;
    }
}
