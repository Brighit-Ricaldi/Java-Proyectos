package Clases.pasoporvalor;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre="Brighit";
        System.out.println("persona nombre = " + persona1.nombre);
        
        persona1 = cambioValor(persona1);
        System.out.println("Persona cambio de valor = " + persona1.nombre);
    }
    public static Persona cambioValor(Persona persona){
        if(persona == null){
            return null;
        }
        persona.nombre = "Damiana";
        
        return persona;
    }
}
