package excepciones;

public class OperacionExcepcion extends Exception { //tiene que extender de una clase padre de Excepciones, si ponemos RuntimeException no necesita ser procesado por un try y catch
    public OperacionExcepcion(String mensaje){ //constructor que le pasa el mensaje que queremos mostrar
        super(mensaje); //mensaje que queremos propagar
    }
}

//se comenta que es mejor heredar de RuntimeException antes que de Exception porque asi queda el codigo mas limpio
