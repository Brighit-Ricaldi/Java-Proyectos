

import java.util.Scanner;

public class mayor_numeros {
    public static void main(String args[]){
    int num1;
    int num2;
    
    Scanner scanner = new Scanner (System.in);
    
        System.out.println("Ingrese primer valor");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese segundo valor");
        num2= Integer.parseInt(scanner.nextLine());
        System.out.println("El signo mayor es: ");
        System.out.println(num1>num2 ? num1: num2 );
    }

}
