package Seccion03;
//TIPOS PRIMITIVOS EN  JAVA
//TIPOS NUMERICOS ENTEROS
public class TiposNumEnteros {

    public static void main(String args[]) {
        /*
        tipos primitivos enteros: byte, short, int, long
         */

        byte numeroByte = 10;
        byte numeroByte2 = (byte) 129;
        System.out.println("Valor numerico: " + numeroByte);
        System.out.println("Valor numerico: " + numeroByte2);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = 20;
        short numeroShort2 = (short) 32769;
        System.out.println("numeroShort2 = " + numeroShort2);
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El valor minimo de short es: " + Short.MIN_VALUE);
        System.out.println("El valor maximo de short es: " + Short.MAX_VALUE);

        int numeroInt = 2345;
        int numeroInt2 = (int) -2147483648L;
        System.out.println("numeroInt2 = " + numeroInt2);
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El valor minimo de int es: " + Integer.MIN_VALUE);
        System.out.println("El valor maximo de int es: " + Integer.MAX_VALUE);

        long numeroLong = 1234;
        long numeroLong2 = (long) 9223372036854775808F;
        long numeroLong3 = 9223372036854775807L;
        System.out.println("numeroLong3 = " + numeroLong3);
        System.out.println("numeroLong2 = " + numeroLong2);
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El valor minimo de Long es: " + Long.MIN_VALUE);
        System.out.println("El valor maximo de Long es: " + Long.MAX_VALUE);
    }
}
