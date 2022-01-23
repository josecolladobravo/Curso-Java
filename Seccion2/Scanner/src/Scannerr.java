
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josec
 */
public class Scannerr {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner (System.in);
        var usuario = consola.nextLine(); //se detiene hasta que el usuario escribe algo
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe un titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: \"" + titulo + " " + usuario + "\"");
        
    }
}
