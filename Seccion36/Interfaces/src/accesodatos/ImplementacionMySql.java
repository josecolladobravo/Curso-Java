package accesodatos;

public class ImplementacionMySql implements IAccesosDatos { //usar implements para implementar una interface

    @Override
    public void insertar() {
        System.out.println("insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde MySql");
    }

    @Override
    public void actualicar() {
        System.out.println("actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySql");
    }
    
}
