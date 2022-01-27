package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[]; //importante inicializar en el constructor por defecto
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS]; //así se inicializa, importante aprenderlo
    }
    
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("El vector de computadoras está lleno");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("ID ORDEN: " + this.idOrden);
        System.out.println("La computadoras de esta orden son: ");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
    
    
}
