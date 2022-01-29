package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO); //se puede asignar referencia de objetos de la clase hija a la objetos de la clase padre
        System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());//se ejecuta el de la clase hija debido al polimorfismo de objetos
        
        //downcasting de padre a hija
        //((Escritor)empleado).getTipoEscritura(); //convertimos el tipo empleado a tipo escritor
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //upcasting de hija a padre
        Empleado empleado2 = escritor; 
        empleado2.obtenerDetalles();
        System.out.println("empleado2 = " + empleado2.obtenerDetalles());
    }
    
}
