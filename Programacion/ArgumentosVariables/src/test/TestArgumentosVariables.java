package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(2, 4, 6);
        imprimirNumeros(1, 3, 5);
        variosParametros("Brighit", 0, 4, 3);
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);

        }
    }
}
