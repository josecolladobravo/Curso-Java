package caja;


public class PruebaCaja {
    public static void main(String[] args) {
        
        //Primera Caja por con constructor por defecto
        Caja caja1 = new Caja();
        caja1.ancho=3;
        caja1.alto=2;
        caja1.profundo=6;
        
        int resultadoCaja1 = caja1.calcularVolumen();
        System.out.println("resultadoCaja1 = " + resultadoCaja1);
        
        //Segunda caja con un constructor parametrizado
        Caja caja2 = new Caja(3,2,6);
        int resultadoCaja2 = caja2.calcularVolumen();
        System.out.println("resultadoCaja2 = " + resultadoCaja2);
    }
 
}
