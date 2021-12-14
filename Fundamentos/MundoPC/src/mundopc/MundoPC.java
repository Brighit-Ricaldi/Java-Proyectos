package mundopc;

import mx.com.gm.mundopc.Computadora;
import mx.com.gm.mundopc.Monitor;
import mx.com.gm.mundopc.Orden;
import mx.com.gm.mundopc.Raton;
import mx.com.gm.mundopc.Teclado;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor ("HP", 13);
        Teclado tecladoHP = new Teclado ("bluetooth", "HP");
        Raton ratonHP = new Raton ("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor ("Gamer", 13);
        Teclado tecladoGamer = new Teclado ("bluetooth", "Gamer");
        Raton ratonGamer = new Raton ("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer,tecladoHP, ratonGamer);
        
        
        Orden orden = new Orden();
        orden.agregarComputadora(computadoraHP);
        orden.agregarComputadora(computadoraGamer);
        orden.mostrarOrden();
    }
}
