package domain;

public enum TipoEscritura { //Asi se hace u enum con atributos, constructor y get
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
