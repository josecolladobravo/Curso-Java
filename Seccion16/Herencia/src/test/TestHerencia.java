/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;
import java.util.Date;

/**
 *
 * @author Josec
 */
public class TestHerencia {
    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Juan",5000.0);
//        System.out.println("empleado1 = " + empleado1);
        
        Date fecha1 = new Date(121,5,3,10,5,6);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Saturno 15");
        System.out.println("cliente1 : " + cliente1.toString());
    }
}
