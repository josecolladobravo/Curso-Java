package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico"); //Podemos crear un obejto de tipo Clase1 porque es publico
        System.out.println("clase1 = " + clase1.atributoPublico); //Podemos acceder al atributo atributoPublico porque es publico

        clase1.metodoPublico(); //Podemos acceder al metodo porque es publico
        //clase1.metodoProtected(); //No podemos acceder porque es protected
        
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
    
}
