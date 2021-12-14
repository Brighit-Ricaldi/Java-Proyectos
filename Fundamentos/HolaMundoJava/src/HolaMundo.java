
public class HolaMundo {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = usuario + " es " + titulo;
        System.out.println("La concatenacion es = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);
        System.out.println(i + j + usuario);//Evaluacion de izq a derecha realiza suma
        System.out.println(titulo + " " + i + j + " " + usuario); //contexto cadena, toda la sum es una cadena
        System.out.println(usuario + (i + j)); //uso de parentesis modifican la prioridad

    }
}
