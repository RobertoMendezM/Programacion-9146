
import java.util.ArrayList;
import java.util.Arrays;
/**
 * estudiante
 */
public class Profesor extends Persona {
    public String telefono = "451";

    public class Ayudante{
        Profesor profe1 = new Profesor();

        public static void main(String[] args){
            System.out.println(profe1.getNombre());

        }

        
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println(persona1.getNombre());
        persona1.setNombre("Dionsio");
        System.out.println(persona1.getNombre());
        System.out.println("########");
        
        
        Profesor profe1 = new Profesor();
        System.out.println(profe1.getNombre() + " Pase = " + profe1.comprarPaseEstacionamiento());
        profe1.setCorreo("profe1@a.com");
        profe1.correo = "profe1correo2@a.com";

        System.out.println(profe1.getCorreo());

    }
}