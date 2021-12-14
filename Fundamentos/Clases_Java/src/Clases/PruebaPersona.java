package Clases;

public class PruebaPersona {
    //PARA QUE SE PUEDA EJECUTAR NUESTRO CODIGO
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.nombre= "Juan";
        persona.apellido= "Rojas";
        persona.desplegarInformacion();
        
        Persona person = new Persona();
        System.out.println("person = " + person);
        System.out.println("persona = " + persona);
        
        person.desplegarInformacion();
        person.apellido = "Ricaldi";
        person.nombre = "Brighit";
        person.desplegarInformacion();
        
        
    }
}
