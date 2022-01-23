/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josec
 */
public class Main {

    public static void main(String[] args) {
        /*
            tipos primitivos de tipo flotante: float y double
         */

        float numeroFloat = (float) 10.0; // si tiene '.' significa que es de tipo double. el 10.0 es un tipo double pero con (float) lo forzamos a que sea float
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor maximo del tipo float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo del tipo float: " + Float.MIN_VALUE);

        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor maximo del tipo double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo del tipo double: " + Double.MIN_VALUE);
    }

}
