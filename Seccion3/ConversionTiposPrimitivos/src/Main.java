
import java.util.Scanner;

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
        //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20"); //va a ser de tipo int convertido de un string
        System.out.println("edad = " + edad);

        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        //Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona una edad");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

    }
}
