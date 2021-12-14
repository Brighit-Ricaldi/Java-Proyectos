package Seccion05;

import java.util.Scanner;

public class estaciones {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int mes;
        System.out.println("Ingrese un numero");
        mes = Integer.parseInt(scanner.nextLine());
        var estacion = "La estacion es desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invitacion";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
    }
}
