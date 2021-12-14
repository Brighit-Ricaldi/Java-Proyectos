/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion03;

import java.util.Scanner;

/**
 *
 * @author Brighit
 */
public class ConversionTipos {

    public static void main(String args[]) {
        //Conversion de String a Int
        var edad = Integer.parseInt("20");
        var edad1 = "20";
        System.out.println("edad1 = " + (edad1 + 1));
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "Hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }

}
