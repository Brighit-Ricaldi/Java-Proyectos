package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        //Hemos inicializado los atributos de la clase padre
        super(tipoEntrada, marca);
        //Inicializamos los atributos de la clase hija
        //Obtenemos un id unico de nuestro idRaton
        this.idRaton = ++Raton.contadorRatones;

    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}' + super.toString() + '}';
    }

}
