
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto = new Producto("Vestido", 20.00);
        Producto producto2 = new Producto("Pantalon", 50.00);
        
        Orden orden = new Orden();
        orden.agregarProducto(producto);
        orden.agregarProducto(producto2);
        orden.mostrarOrden();
    }
    
}
