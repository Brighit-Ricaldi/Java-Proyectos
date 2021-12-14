package Seccion06;

public class Palabra_break {

    public static void main(String args[]) {
        for (var contador = 0; contador < 10; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break;
            }
        }

//        for (var contador = 0; contador < 10; contador++) {
//            if (contador % 2 != 0) {
//                continue;//ir a la siguiente iteracion
//            }
//            System.out.println("contador = " + contador);
//        }

    }

}
