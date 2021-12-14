
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona = new Persona("Brighit Ric");
//        System.out.println("persona" + persona);
        
        //Creando 2 objeto 
        Persona persona2 = new Persona("Briiii");
//        System.out.println("persona2 = " + persona2);
        imprimir(persona);
        imprimir(persona2);
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){
        imprimir(new Persona("Damiana"));
        return this.contador =10;
    }
}
