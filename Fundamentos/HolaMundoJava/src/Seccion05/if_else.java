package Seccion05;

import java.util.Scanner;

public class if_else {

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner (System.in);
        
        int condicion;
        int numero;
        System.out.println("Ingrese numero randon");
        condicion = Integer.parseInt(scanner.nextLine());
        if (condicion == 2){
            System.out.println("La condicion es verdadera");
        }else{
            System.out.println("La condicion en falsa");
        }
        System.out.println("Ingrese numero");
        numero = Integer.parseInt(scanner.nextLine());
        if (numero ==2){
            System.out.println("Numero dos");
        }else if (numero ==3){
            System.out.println("Numero tres");
        }else if(numero ==4){
            System.out.println("Numero cuatro");
        }else{
            System.out.println("Numero no encontrado");
        }
        
        
        

    }

}
