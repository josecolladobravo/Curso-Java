package paquete1;

public class Clase1 { //public en la clase
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtected = "Valor atributo protected";
    
    public Clase1(String arg){
        System.out.println("Constructor publico");
    }
    
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    
    public void metodoPublico(){
        
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
