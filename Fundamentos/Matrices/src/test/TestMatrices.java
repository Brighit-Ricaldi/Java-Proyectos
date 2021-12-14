package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        //1er arreglo que controla los reglones
        int edades[][] = new int[3][2];

        edades[0][0] = 4;
        edades[0][1] = 3;
        edades[1][0] = 5;
        edades[1][1] = 9;
        edades[2][0] = 8;
        edades[2][1] = 10;
        System.out.println("edades = " + edades[0][0]);
        System.out.println("edades = " + edades[0][1]);
        System.out.println("edades = " + edades[1][0]);
        System.out.println("edades = " + edades[1][1]);
        System.out.println("edades = " + edades[2][0]);
        System.out.println("edades = " + edades[2][1]);

        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades = " + ren + "-" + col + ": " + edades[ren][col]);
            }

        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        imprimir(frutas);
        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("Brighit");
        personas[0][1] = new Persona("Daiani");
        personas[0][2]= new Persona("Francisco");
        personas[1][0] = new Persona("Brighit Mi Bri");
        personas[1][1] = new Persona("Fabricio");
        personas[1][2] = new Persona("Melissa");
        imprimir(personas);

    }
    //Metodo que itera cada elemento de nuestra matriz
    public static void imprimir(Object matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz = " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }

}
