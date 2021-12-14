package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    //Estamos declarando el arreglo
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    //Constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        //Instancias nuestro arreglo de tipo productos
        this.productos = new Producto[Orden.MAX_PRODUCTOS];

    }

    //Metodo
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;

        } else {
            System.out.println("Se ha superado maximo de productos" + Orden.MAX_PRODUCTOS);
        }
    }

    //Metodo
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total = total + producto.getPrecio();
        }
        return total;
    }

    //Metodo
    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Producto de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
            
        }
    }

}
