package Operaciones;

public class Aritmetica {

    int a;
    int b;
    int resultado;

    //SOY UN CONSTRUCTOR VACIO :)
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor con argumentos");
    }

    //Metodo 
    public void sumar() {
        resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
//        return a + b;
        return this.sumarConRetorno();

    }
}
