package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona = new Persona("Brighit", 5000.00, false);
//        System.out.println("Persona nombre sin cambio: " + persona.getNombre());
        persona.setNombre("Brighit Damiana");
        persona.setSueldo(4560.65);
        persona.setEliminado(true);
        System.out.println("Persona" + persona.toString());

//        System.out.println("Persona nombre con cambio: " + persona.getNombre());
//        System.out.println("Persona sueldo: " + persona.getSueldo());
//        System.out.println("Persona eliminado: " + persona.isEliminado());

        Persona persona2 = new Persona("Daiani", 565.66, true);
        persona2.setNombre("Daiani Karoline");
        persona2.setSueldo(456.988);
        persona2.setEliminado(false);
        
        System.out.println("Persona 2: "  + persona2.toString());

//        System.out.println("Persona 2 nombre: " + persona2.getNombre());
//        System.out.println("Persona 2 sueldo: " + persona2.getSueldo());
//        System.out.println("Persona 2 eliminado: " + persona2.isEliminado());

    }
}
