
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
  Scanner lectura = new Scanner(System.in);

        System.out.println("Proporciona una nota entre 0 y 10");

        var nota = Double.parseDouble(lectura.nextLine());

        var calificacion = "No está comprendido entre 0 y 10";



        if (nota >= 0 && nota < 6) {

            calificacion = "F";

        } else if (nota >= 6 && nota < 7) {

            calificacion = "D";

        } else if (nota >= 7 && nota < 8) {

            calificacion = "C";

        } else if (nota >= 8 && nota < 9) {

            calificacion = "B";

        } else if (nota >= 9 && nota <= 10) {

            calificacion = "A";

        }



        System.out.println("calificacion = " + calificacion);
    }
}
