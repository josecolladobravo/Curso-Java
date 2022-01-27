package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
      Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles()); //metodo de la clase Empleado(Padre) o de la clase Gerente(hija) si está @override
    }
}
