
package Proyecto;

public class CalcularVolumen {
    public static void main(String[] args) {
        Caja caja = new Caja();
        caja.alto = 3;
        caja.ancho =2;
        caja.profundo = 6;
        caja.calcularVolumen();
         
        int resultado = caja.calcularVolumen();
        System.out.println("resultado = " + resultado);
        
        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("Resultado caja volumen2 = " + caja2.calcularVolumen());
        
        
    }
    
}
