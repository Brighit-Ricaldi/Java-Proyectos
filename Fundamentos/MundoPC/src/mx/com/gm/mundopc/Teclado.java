package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;
    //CONSTRUCTOR
    public Teclado(String tipoEntrada, String marca) {
        //Hemos inicializado los atributos de la clase padre
        super(tipoEntrada, marca);
        //Inicializamos los atributos de la clase hija
        //Obtenemos un id unico de nuestro idRaton
        this.idTeclado = ++Teclado.contadorTeclados;

    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado+ '}' + super.toString() + '}';
    }

}
