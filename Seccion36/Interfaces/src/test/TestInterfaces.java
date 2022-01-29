package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesosDatos datos = new ImplementacionMySql();
        datos.listar(); //se ejecuta el de MySql
        imprimir(datos); //se ejecuta el de MySql polimorfismo
        
        datos = new ImplementacionOracle();
        datos.listar(); //se ejecuta el de Oracle
        imprimir(datos); //se ejecuta el de Oracle polimorfismo
        
        
    }
    
    public static void imprimir(IAccesosDatos datos){ //polimorfismo
        datos.listar();
    }
    
}
