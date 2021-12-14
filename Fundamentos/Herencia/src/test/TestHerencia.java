
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Brighit",7000.00);
        System.out.println("empleado = " + empleado);
        
//        var fecha = new Date();
//        Cliente cliente = new Cliente(fecha, true, "Brighit", 'F', 21, "Zona I");
//        System.out.println("cliente = " + cliente);
        
    }
}
