package domain;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre,sueldo);//inicializando el contructor de la clase padre
        this.departamento=departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        System.out.println("Obteniendo detllalles desde la clase hija: ");  
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }
    
}
