package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    //Constructor parametrizado
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("ejecuanto constructor con argumentos");
    }

    //Metodo
    public void sumar() { //definimos el metodo sumar
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
        //int resultado = a + b;
        //return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b) {
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b;
        //return a+b;
        return this.sumarConRetorno();
    }
    

    
}
