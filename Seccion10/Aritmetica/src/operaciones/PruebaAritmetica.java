package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //Variables locales
        var a=10;
        var b=2;
        //miMetodo();
        
        Aritmetica aritmetica2 = new Aritmetica();
        System.out.println("aritmetica2 valor a = " + aritmetica2.a);
        System.out.println("aritmetica2 valor b = " + aritmetica2.b);
    
        Aritmetica aritmetica3 = new Aritmetica(10,5);
        System.out.println("aritmetica3 valor a = " + aritmetica3.a);
        System.out.println("aritmetica3 valor b = " + aritmetica3.b);
    }
    
    public static void miMetodo(){
        //a=10; La variable a, está fuera del alcance donde fue definicda
        System.out.println("otro metodo");
    }

}
