package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList(); //similar a un array. pero con la ventaja de que puede aumentar dinamicamente
        miLista.add("Lunes"); //vamos aniadiendo elementos a la lista
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");//se pueden duplicar elementos

//        imprimir(miLista);
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//
//        miLista.forEach(elemento -> { //otra forma de iterar una lista
//            System.out.println("elemento = " + elemento);
//        });

        Set miSet = new HashSet(); //no respeta el orden
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes"); //en el set no se pueden duplicar los elementos
//        imprimir(miSet);

    Map miMapa = new HashMap(); //creacion de un map
    miMapa.put("valor1", "Juan"); //como aniadir un valor a un mapa, a la izquierda la key a la derecha el valor
    miMapa.put("valor2", "Karla");
    miMapa.put("valor3", "Rosario");
    
    String elemento = (String)miMapa.get("valor1"); //saca el valor asociado a la key
    System.out.println("elemento = " + elemento);
    
        System.out.println(miMapa.keySet());
        imprimir(miMapa.keySet()); //muestra las keys
        imprimir(miMapa.values()); //muestra los valores

    }

    public static void imprimir(Collection coleccion) { //metodo generico para imprimir las List, Set y Map
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
