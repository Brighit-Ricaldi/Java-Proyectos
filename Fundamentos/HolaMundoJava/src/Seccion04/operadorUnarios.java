/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion04;

/**
 *
 * @author Brighit
 */
public class operadorUnarios {
    
    public static void main(String args[]) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;//convirtiendo a false solo aplica a valores vooleanos
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //INCREMENTO
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2.Posincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;//primero se utiliza el valor y despues se incrementa
        System.out.println("g = " + g);//teniamos pendiente un incremento
        System.out.println("h = " + h);

        //DECREMENTO
        //1.predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i); //ya que decrementada
        System.out.println("j = " + j);

        //2.postdecremento
        var k = 4;
        var l = k--;//primero se usa el valir de la variable y queda pendiente decremento
        System.out.println("k = " + k);// tenia pendiente un decremento
        System.out.println("l = " + l);
    }
    
}
