
package Seccion04;

public class OperadoresCondicionales {
    public static void main(String args[]){
        var a=-1;
        var min = 0;
        var max=10;
        var resultado = a>=min && a<=max;
        if(resultado){
            System.out.println("Dentro del rango");
        }else{
            System.out.println("Fuera del rango");
        }       
         var vacaciones = false;
         var diaDescando = true;
         if(vacaciones || diaDescando){
             System.out.println("El padre puede asistir al juego de su hijo");
         }else{
             System.out.println("El padre esta ocupado");
         }
    }
}
