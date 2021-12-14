/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion04;

/**
 *
 * @author Brighit
 */
public class OperadoresDeIgualdad {

    public static void main(String args[]) {
        var a = 3;
        var b = 2;
        //si son iguales
        var c = (a == b);
        System.out.println("c = " + c);

        //Si son diferentes
        var d = (a != b);
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; //compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);//comparamos contenido de cadenass
        System.out.println("e = " + e);

        var g = a >= b; //mayor que > o el mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("El numero es impar");
        }
    var edad =15;
    var adulto = 18;
    if(edad>=adulto){
        System.out.println("Es mayor de edad");
    }else{
        System.out.println("Es menor de edad");
    }
    
    
    }

}
