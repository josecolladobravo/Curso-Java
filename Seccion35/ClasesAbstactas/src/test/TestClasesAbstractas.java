package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //no se pueden crear objetos de la clase abstracta
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        
        figura.dibujar();//toma prioridad el de menor jerarquia
        
    }
    
}
