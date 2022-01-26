package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;  //asi rellenamos la matriz
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        
        for (int fil = 0; fil < edades.length; fil++) {
            for (int col = 0; col < edades[col].length; col++) {
                System.out.println("edades " + fil + "-" + col + ": " + edades[fil][col]);
            }
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora"}};
        imprimir(frutas);

        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla"); 
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){ //metodo que nos permite mostrar la matriz. 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + " es = " + matriz[i][j]);
            }
        }
    }
  
}
