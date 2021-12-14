package mx.com.gm.ventas;

public class Producto {

    //FINAL->no podemos modificar su valor una vez asignado
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        //Inicializamos el id producto, por cada objeto que se cree se autoincrementa
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        //Llamada al constructor vacio
        this();
        //Inicializamos los atributos
        this.nombre = nombre;
        this.precio = precio;

    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
