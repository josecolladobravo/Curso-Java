package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentaTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        
        Orden orden1  = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Producto producto3 = new Producto("Reloj", 1500);
        Orden orden2 = new Orden();
        
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        
        orden2.mostrarOrden();
    }
}
