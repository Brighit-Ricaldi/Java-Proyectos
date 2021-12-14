package Seccion06;

public class Etiquetas {
    public static void main(String args[]) {
        
        inicio:
        for (var contador = 0; contador < 10; contador++) {
            if (contador % 2 != 0) {
                continue inicio;//va a la etiqueta que se agrego
            }
            System.out.println("contador = " + contador);
        }
    }
}
