package Seccion05;

import java.util.Scanner;

public class estacion_switch {

    public static void main(String args[]) {
        int mes;
        var estacion = "Numero invalido";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero del mes");
        mes = Integer.parseInt(scanner.nextLine());
        switch (mes) {
            case 1: case 2: case 12:
                estacion ="Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
            default:
                       
                    
        }
        System.out.println("La estacion es: " + estacion );
    }

}
