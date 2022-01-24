
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
        var condicion = false;

        if (condicion) {
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }

        var numero = 3;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "numero 1";
        } else if (numero == 2) {
            numeroTexto = "numero 2";
        } else if (numero == 3) {
            numeroTexto = "numero 3";
        } else if (numero == 4) {
            numeroTexto = "numero 4";
        } else {
            numeroTexto = "numero no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);
        
        //ejercicio estacion del año
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un mes del anio");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion="estacion desconocida";
        
        if(mes==1 || mes==2 || mes==12){
            estacion="invierno";
        }else if(mes==3 || mes==4 || mes==5){
            estacion="primavera";
        }else if(mes==6 || mes==7 || mes==8){
            estacion="verano";
        }else if(mes==9 || mes==10 || mes==11){
            estacion="otonio";
        }else{
            estacion="no has proporcionado ningun mes valido";
        }
        
        System.out.println("estacion = " + estacion);

    }
}
