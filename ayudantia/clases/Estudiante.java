

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
        Persona persona2 = new Persona("Eduardo","lalo@gmail.com","55555555","materias.txt");
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getCorreo());
        System.out.println(persona2.getTelefono());
        System.out.println(persona2.materias);


        
    }
    
}