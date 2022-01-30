package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        //especificamos que sera una lista de strings
        List<String> miLista = new ArrayList<>(); //similar a un array. pero con la ventaja de que puede aumentar dinamicamente
        miLista.add("Lunes"); //vamos aniadiendo elementos a la lista
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");//se pueden duplicar elementos

//        String elemento = miLista.get(0);
//        System.out.println("elemento de una lista de strings = " + elemento);
//        imprimir(miLista);
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//
//        miLista.forEach(elemento -> { //otra forma de iterar una lista
//            System.out.println("elemento = " + elemento);
//        });

        //especificamos que es un Set de strings
        Set<String> miSet = new HashSet<>(); //no respeta el orden
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes"); //en el set no se pueden duplicar los elementos
//        imprimir(miSet);

    Map<String, String> miMapa = new HashMap<>(); //creacion de un map
    miMapa.put("valor1", "Juan"); //como aniadir un valor a un mapa, a la izquierda la key a la derecha el valor
    miMapa.put("valor2", "Karla");
    miMapa.put("valor3", "Rosario");
    miMapa.put("valor3", "Carlos"); //se sustituye el ultimo valor que tenga la misma clave
    
//    String elementoMapa = miMapa.get("valor1"); //saca el valor asociado a la key
//    System.out.println("elemento = " + elementoMapa);
    
//        System.out.println(miMapa.keySet());
//        imprimir(miMapa.keySet()); //muestra las keys
//        imprimir(miMapa.values()); //muestra los valores
            System.out.println("ve descomentando lo que quieras ejecutar");
    }

    public static void imprimir(Collection<String> coleccion) { //metodo generico para imprimir las List, Set y Map
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
