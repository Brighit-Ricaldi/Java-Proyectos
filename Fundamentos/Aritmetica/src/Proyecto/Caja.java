
package Proyecto;

public class Caja {
    int ancho;
    int alto;
    int profundo;
   int volumen;
    
    public Caja(){
        System.out.println("Constructor vacio");
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){
        volumen=ancho*alto*profundo;
        return volumen;
    }
    
}
