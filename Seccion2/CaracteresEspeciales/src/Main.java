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
        var nombre = "Karla";
        
        System.out.println("Nueva linea: \n" + nombre); // \n da un salto de linea
        System.out.println("Tabulador: \t" + nombre); // \t pone un tabulador
        System.out.println("Retroceso: \b" + nombre); // \b retrocede un espacio
        System.out.println("Comilla simple: \'" + nombre + "\'"); // \' pone comillas simples
        System.out.println("Comilla doble : \"" + nombre + "\""); // \" pone comillas dobles. Es necesario poner \ para no romper la cadena
    }
}
