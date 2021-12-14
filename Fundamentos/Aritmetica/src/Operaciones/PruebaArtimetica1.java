package Operaciones;

public class PruebaArtimetica1 {

    public static void main(String[] args) {

        //Variables locales
        var a = 2;
        var b = 4;
        miMetodo();
        Aritmetica aritmetica = new Aritmetica();

        //Constructor vacios
        System.out.println("Aritmetica a: " + aritmetica.a);
        System.out.println("Aritmetica b: " + aritmetica.b);

        //Constructores sobrecargados - > con parametros
        Aritmetica aritmetica1 = new Aritmetica(5, 8);
        System.out.println("Aritmetica a: " + aritmetica1.a);
        System.out.println("Aritmetica b: " + aritmetica1.b);
        
        aritmetica = null;
        System.gc();

    }
    public static void miMetodo(){
        System.out.println("Otro metodo");
    }

}
