package Tareas;

public class Saludo {

    public static void main(String args[]) {
        //NOTACION DE CAMELLO O NOTACION DE ALTAS DE Y BAJAS
        //la 1era letra con minuscula
        //y la inicial de cada palabra con mayuscula
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos desde Yauyos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios,nos vamos a Cañete";
        System.out.println(miVariableCadena);

        //var -Inferencia de tipos de JAVA
        var miVariableEntera2 = 109;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Mi variable cadena con Var";
        System.out.println(miVariableCadena2);
        //concatenacion de cadenas +
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var áVariable = 4; //no se recomienda utilizar
        //var #miVariable =5; no se permiten caracteres especiales

    }
}
