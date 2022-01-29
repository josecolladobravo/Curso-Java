package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        //polimorfimo es multiple comportamientos

        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {  //primero hay que preguntar las menos genericas y después las mas genericas
            System.out.println("Es de tipo Genrente");
            ((Gerente) empleado).getDepartamento();//hay que cambiar el tipo. Así se cambio el tipo de un objeto a otro objeto
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
