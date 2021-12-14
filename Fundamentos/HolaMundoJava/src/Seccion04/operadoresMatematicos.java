package Seccion04;

import java.util.Scanner;

public class operadoresMatematicos {

    public static void main(String args[]) {
        int a, b;
        var Scanner = new Scanner(System.in);
        System.out.println("Ingresa primer valor: ");
        a = Integer.parseInt(Scanner.nextLine());
        System.out.println("Ingresa segundo valor");
        b = Integer.parseInt(Scanner.nextLine());
        var resultado = a + b;
        System.out.println("La suma de a y b es: " + resultado);

        resultado = a - b;
        System.out.println("La resta de a y b es: " + resultado);

        resultado = a * b;
        System.out.println("La multiplicacion de a y b es:" + resultado);

        resultado = a / b;
        System.out.println("La division de a y b es: " + resultado);

        resultado = a % b;
        System.out.println("El modulo de a y b es: " + resultado);

        if (a % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }

}
