package clases;


public class Persona {
    //Atributos de la clase
    public String nombre; //mala practica el poner public aquí, pero solo lo hacemos ahora para poder acceder en todos los paquetes, mas adelante lo aprenderemos bien
    public String apellido;
    
    //Metodos de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    

}
