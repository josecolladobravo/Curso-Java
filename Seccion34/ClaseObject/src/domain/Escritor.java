package domain;

public class Escritor extends Empleado { //clase hija
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);//hay que llamar al construtor de la clase padre
        this.tipoEscritura=tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
       return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}' + " " + super.toString();
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
