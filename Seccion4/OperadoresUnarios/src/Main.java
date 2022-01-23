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
        int a=3;
        int b=-a; //invierte el valor de a
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c=true;
        var d=!c; //invierte el valor de c
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //1.preicremento (simbolo antes de la variable)
        var e=3;
        var f= ++e;//primero se incrementa y luego se asigna
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.postincremento (simbolo despues de la variable
        var g=5;
        var h=g++;//primero asigna y luego se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1.predecremento
        var i=2;
        var j= --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //2.postdecremento
        var k=4;
        var l= k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
