/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion04;

/**
 *
 * @author Brighit
 */
public class OperadorTemario {
    public static void main(String args[]){
    var resultado = (3>2)?"verdadero": "falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 33;
        resultado = (numero % 2==0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
        
        var x=5;
        var y=10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
    
}
