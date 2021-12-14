package Tareas;

import java.util.Scanner;

public class Tarea_Rectangulo {
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el alto del rectangulo");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el ancho del rectangulo");
        int ancho = Integer.parseInt(scanner.nextLine());
        
        int area = alto * ancho;
        int perimetro = alto + ancho;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        
    }

}
