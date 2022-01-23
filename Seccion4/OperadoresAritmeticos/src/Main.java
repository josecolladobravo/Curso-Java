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
        int a=3, b=2;
        var resultado = a + b; //operador aritmetico +
        System.out.println("resultado de la sumna = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado de la multiplicacion = " + resultado);
        
        var resultado2 = 3.0 / b;
        System.out.println("resultado de la division = " + resultado2);
        
        resultado = a % b; //muestra el resto de la division
        System.out.println("resultado del modulo = " + resultado);
        
        if(a%2==0){
            System.out.println("la variable a es par");
        }else{
            System.out.println("la variable es numero impar");
        }
        
    }
}
