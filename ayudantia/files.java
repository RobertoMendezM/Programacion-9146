/**
 * files
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class files{

    public static void main(String[] args) {
        try{
            File miArchivo = new File("datos.csv");
            Scanner scanner = new Scanner(miArchivo);
            while(scanner.hasNextLine()){
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("El archivo que intentas leer no existe.");
            //e.printStackTrace();
        }
            
        
    }
}