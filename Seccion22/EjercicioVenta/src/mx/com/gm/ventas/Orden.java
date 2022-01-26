package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[]; //se inicializa en el constructor de la clase
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto; //aquí se añade productos al vector de productos
        }else{
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
       double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            //Producto producto = this.productos[i]; primera forma de hacerlo con dos lineas
            //total += producto.getPrecio();//total = total + producto.getPrecio();
            total += productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Total de la orden: $" + calcularTotal());
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
    
}
