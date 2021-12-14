package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        //Acceder los elementos del arreglo luego lo modificaremos
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        edades[1] = 3;
        System.out.println("edades = " + edades[1]);
        edades[2] = 7;
        System.out.println("edades = " + edades[2]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento = " + i + ": " + edades[i]);
        }
        
        //Inicilizamos los arreglos 
        
        String frutas[]= {"Naranja", "Platano", "Uva"};
        //Imprimimos arreglo que ocuapa un lugar en el espacio de memoria
        System.out.println("Frutas = " + frutas);
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
            
        }
    }
}
