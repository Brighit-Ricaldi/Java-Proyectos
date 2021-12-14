package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();

        aritmetica.a = 4;
        aritmetica.b = 5;
        aritmetica.sumar();

        var resultado = aritmetica.sumarConRetorno();
        System.out.println("Resultado desde la prueba = " + resultado);
        resultado = aritmetica.sumarConArgumentos(5, 8);
        System.out.println("resultado = " + resultado);
    }

}
