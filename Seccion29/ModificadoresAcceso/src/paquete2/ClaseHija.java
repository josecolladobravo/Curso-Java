package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributoProtegido = " + this.atributoProtected);
        this.metodoProtected(); //desde aqui si podemos llamar al metodo protected
    }

    @Override
    public String toString() {
        return "ClaseHija{" + '}';
    }
    
    
}