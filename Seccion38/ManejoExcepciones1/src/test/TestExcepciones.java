package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
        resultado =Aritmetica.division(10, 0);
        }catch(OperacionExcepcion e){//poniendo primero las excepciones de menor jerarquia se pueden anidar los catch
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un error de tipo Exception: ");
            e.printStackTrace(System.out); //para mostrar la pila por consola
            System.out.println(e.getMessage()); //muestra el mensaje no solo la pila
        }finally{ //este bloque es opcional. siempre se ejecuta. es util por si queremos finalizar procesos.
            System.out.println("Se reviso la divion entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
