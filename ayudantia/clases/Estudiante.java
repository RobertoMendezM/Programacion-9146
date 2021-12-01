
import java.util.ArrayList;
import java.util.Arrays;
/**
 * estudiante
 */
public class Estudiante {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println(persona1.getNombre());
        persona1.setNombre("Dionisio");
        System.out.println(persona1.getNombre());
        System.out.println("########");
        persona1 = new Persona("Eduardo", "lalo@gmail.com", "55555555", "materias.txt");
        Persona persona2 = new Persona("Eduardo","lalo@gmail.com","55555555","materias.txt");
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getCorreo());
        System.out.println(persona2.getTelefono());
        System.out.println(persona2.materias);
        System.out.println("########");
        System.out.println(Arrays.toString(auxiliar(persona1.getNombre())));
        String a= new String("a");
        String b = new String("a");
        if(a.equals(b)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");

        }

        
    }

    public static String[] auxiliar(String a) {

        String[] arreglo = a.split("");
        return arreglo;

        
    }
    
}