package caja;


public class Caja {
    
    //Atributos
    int ancho, alto, profundo;
    
    //Constructor por defecto
    public Caja(){
        System.out.println("Ejecutando el constructor por defecto");
    }
    
    //Constructor parametrizado
    public Caja(int ancho, int alto, int profundo){
        System.out.println("Ejecuntando el constructor parametrizado");
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    
    public int calcularVolumen(){
        return this.ancho*this.alto*this.profundo;
    }
    
    
}
