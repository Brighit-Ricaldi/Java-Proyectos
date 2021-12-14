
package Seccion05;

import java.util.Scanner;


public class sentencia_switch {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int numero =2;
        var numeroTexto = "Valor desconocido";
        
        System.out.println("Ingrese numero a validar");
        numero = Integer.parseInt(scanner.nextLine());
        switch(numero){
            case 1: 
                numeroTexto = "Numero uno";
                break;
            case 2: 
                numeroTexto ="Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                        
        
        }
        System.out.println("El valor del texto es:  = " + numeroTexto);
    }
}
