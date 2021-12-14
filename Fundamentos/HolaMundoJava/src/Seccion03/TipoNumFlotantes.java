/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion03;

/**
 *
 * @author Brighit
 */
public class TipoNumFlotantes {

    public static void main(String args[]) {
        float numeroFloat = (float) 10.0;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo float" + Float.MAX_VALUE);
        
        double numeroDouble = 12.0;
        double numeroDouble2 =1.7976931348623157E308;
        System.out.println("numeroDouble2 = " + numeroDouble2);
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo Double" + Double.MAX_VALUE);
    }
}
