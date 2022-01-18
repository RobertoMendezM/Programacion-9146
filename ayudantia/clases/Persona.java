import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.util.ArrayList;


public class Persona {
    private String nombre;
    protected String correo;
    public String telefono;
    public ArrayList<String> materias;

    // Constructores
    public Persona(){
        this.nombre = "Anonimo";
        this.correo = "";
        this.telefono = "";
        this.materias = new ArrayList<String>();
    }

    protected Persona(String nombre, String correo, String telefono,String archivo) {
        Random rand = new Random();
        this.nombre = nombre + rand.nextInt(100);
        this.correo = correo;
        this.telefono = telefono;

        try {
            Scanner sc = new Scanner(new File(archivo));
            this.materias = new ArrayList<String>();
            while(sc.hasNext()){
                materias.add(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("No encontre el archivo.");
        }
        


    }


    // getter de Nombre
    public String getNombre(){
        return "La persona se llama " + this.nombre;
    }

    public String getCorreo(){
        return this.correo;
    }

    public String getTelefono(){
        return this.telefono;
    }

    //public  (){
     //   return this.telefono;
    //}

    // setter de Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // setter de correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }


    // Comportamiento a partir de aqui

    protected int comprarPaseEstacionamiento(){
        Random rand = new Random();
        int n = rand.nextInt(100);
        return n;
    }


}
