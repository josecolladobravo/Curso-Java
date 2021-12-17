//Mi clase en Java
public class VariablesEnJava {
    public static void main(String[] args) {
        //definimos la variable 
        int miVariableEntera = 10;
        System.out.println("La variable vale : " + miVariableEntera);
        
        //modificamos el valor de la variable
        miVariableEntera = 5; //no indicamos el tipo de dato porque ya se especifico el tipo de dato.
        
        System.out.println("El valor tras modificar la variable es de : " + miVariableEntera);
        
        String miVariableCadena = "Hola, ¿cómo estás?";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Estoy muy bien, gracias";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 10;
        
    }
}
