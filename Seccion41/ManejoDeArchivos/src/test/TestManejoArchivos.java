/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static manejoArchivos.ManejoArchivos.anexarArchivo;
import static manejoArchivos.ManejoArchivos.crearArchivo;
import static manejoArchivos.ManejoArchivos.escribirArchivo;
import static manejoArchivos.ManejoArchivos.leerArchivo;

/**
 *
 * @author Josec
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        
//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "adios");

          leerArchivo(nombreArchivo);
    }
}
