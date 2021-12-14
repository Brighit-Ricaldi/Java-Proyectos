
package Tareas;

import java.util.Scanner;

public class DetallesLibroScanner {
    public static void main(String args[]) {
        System.out.println("Escribe el titulo del libro: ");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Escribe el nombre del autor: ");
        var autor = consola.nextLine();
        System.out.println("Resultado: " + titulo + " fue escrito por " + autor);

    }
}
