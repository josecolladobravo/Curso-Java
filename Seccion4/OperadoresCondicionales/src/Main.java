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
        var a=11;
        var valorMinimo=0;
        var valorMaximo=10;
        
        var resultado = a>=0 && a<=10;
        System.out.println("resultado = " + resultado);
        if(resultado)
            System.out.println("dentro de rango");
        else
            System.out.println("fuera de rango");
        
        var vacaciones=true;
        var diaDescanso=false;
        
        if(vacaciones||diaDescanso) //si los dos son falsos se ejecuta el else, solo es true si alguna de las dos partes es true
            System.out.println("el padre puede ir a ver a su hijo");
        else
            System.out.println("el padre está trabajando");
        
    }
}
