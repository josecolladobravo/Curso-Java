package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 3;
        aritmetica1.b = 2;

        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);

        int resultadoArgumentos = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultadoArgumentos);

        Aritmetica aritmetica2 = new Aritmetica();
        System.out.println("aritmetica2 valor a = " + aritmetica2.a);
        System.out.println("aritmetica2 valor b = " + aritmetica2.b);
    
        Aritmetica aritmetica3 = new Aritmetica(10,5);
        System.out.println("aritmetica3 valor a = " + aritmetica3.a);
        System.out.println("aritmetica3 valor b = " + aritmetica3.b);
    }

}
