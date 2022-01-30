package test;

import domain.*;


public class TestSobreescritura {
    public static void main(String[] args) {
        //polimorfimo es multiple comportamientos
        
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
//        System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente); //usa el obtenerDetalles ya que apunta a una referencia de la clase hija y porque exite una relacion de herencia entre Empleado y Gerente
    }
    
    public static void imprimir(Empleado empleado){ //el Empleado que se le pasa tambien puede actuar como Gerente
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
