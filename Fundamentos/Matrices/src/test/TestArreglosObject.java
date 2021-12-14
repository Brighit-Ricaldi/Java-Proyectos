package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona persona[] = new Persona[2];

        persona[0] = new Persona("Brighit");
        persona[1] = new Persona("Damiana");
        System.out.println("Persona 0 " + persona[0]);
        System.out.println("Persona 1 " + persona[1]);

        for (int i = 0; i < persona.length; i++) {
            System.out.println("persona " + i + "=" + persona[i]);
        }
    }
}
