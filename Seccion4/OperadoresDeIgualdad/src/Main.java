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
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = (a != b);
        System.out.println("d = " + d);

        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var e = (cadena1 == cadena2);
        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2);//comprobamos el contenido de cadenas
        System.out.println("f = " + f);

        var g = a >= b; //a es mayor o igual que b
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("a es un numero par");
        } else {
            System.out.println("a es numero impar");
        }

        var edad=17;
        var adulto=18;
        if(edad>=adulto)
            System.out.println("es mayor de edad");
        else
            System.out.println("no es mayor de edad");
    }
}
