package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);

        System.out.println("continente numero 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises en el 4 continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("continente numero 1: " + Continentes.AFRICA);
        System.out.println("Numero de paises en el 1 continente: " + Continentes.AFRICA.getPaises());
    }
    
    public static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("primer dia de la semana");
                break;
            case MARTES:
                System.out.println("segundo dia de la semana");
                break;
        }
    }
  
}
