/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion03;

/**
 *
 * @author Brighit
 */
public class TipoBoolean {

    public static void main(String args[]) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 9;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else if (edad <= 10) {
            System.out.println("Es un niño");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
