package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3]; //así se crea un vector de tamaño tres
        System.out.println("edades = " + edades); //muestra la direccion de memoria

        edades[0] = 10; //modificamos el indice cero del vector
        System.out.println("edades 0 = " + edades[0]);

        edades[1] = 15; //modificamos el indice uno del vector
        edades[2] = 20; //modificamos el indice dos del vector

        System.out.println("edades 1 = " + edades[1]); 
        System.out.println("edades 2 = " + edades[2]);


        for (int i = 0; i < edades.length; i++) { //recorremos el vector del 0 al 2
            System.out.println("edades elemento " + i + ": " + edades[i]);
        }
    }

}
