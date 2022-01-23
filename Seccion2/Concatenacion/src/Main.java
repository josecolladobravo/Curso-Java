
public class Main {
    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = titulo + " " + usuario ; 
        
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); //se realiza la suma de numeros
        System.out.println(i + j + usuario); //primero se hace la suma, despues concatena el usuario
        System.out.println(usuario + i + j); //primero pone el usuario y despues concatena 3 y 4. Cuidado con el oreden
        System.out.println(usuario + (i + j)); //los parentesis añade prioridad, primero hace los parentesis
        
        
        
    }
}
