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
        var numero=2;
        var numeroTexto="valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto="numero 1";
                break;
            case 2:
                numeroTexto="numero 2";
                break;
            case 3:
                numeroTexto="numero 3";
                break;
            case 4:
                numeroTexto="numero 4";
                break;
            default:
                numeroTexto="caso no encontrado";             
        }
        
        System.out.println("numeroTexto = " + numeroTexto);

        
        //ejercicio estacion
        
        var mes=1;
        var estacion="estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion="invierno";
                break;
            case 3: case 4: case 5:
                estacion="primavera";
                break;
            case 6: case 7: case 8:
                estacion="verano";
                break;
            case 9: case 10:  case 11:
                estacion="otonio";
                break;
        }
        
        System.out.println("estacion = " + estacion);
    }
}
