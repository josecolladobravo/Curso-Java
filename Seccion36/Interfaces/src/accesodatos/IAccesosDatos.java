package accesodatos;

public interface IAccesosDatos {
    int MAX_REGISTROS = 10; //contante en interface y hay que asignar valores a todos los atributos, además no tiene contructores
    
    void insertar();//se añade public y abstract de manera automatica

    void listar();
    
    void actualicar();
    
    void eliminar();

}
