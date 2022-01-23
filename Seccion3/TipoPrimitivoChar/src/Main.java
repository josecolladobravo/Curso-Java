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
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021'; //indica que vamos a usar el sistema unicode
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varcharSimbolo = '!';
        System.out.println("varcharSimbolo = " + varcharSimbolo);

        var varChar1 = '\u0021'; //indica que vamos a usar el sistema unicode
        System.out.println("varChar1 = " + varChar1);

        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2); //al ser el 33 un int, lo detecta como un numero y no como una !

        var varcharSimbolo3 = '!';
        System.out.println("varcharSimbolo3 = " + varcharSimbolo3);
        
        int variableEnteraSimbolo  = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo); //muestra el 33 pues convierte la ! en un numero segun el sistema unicode
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        
    }

}
