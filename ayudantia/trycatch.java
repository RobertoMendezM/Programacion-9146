import java.util.Scanner;

public class estructuras {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String cadena = ""; 

        try{
            
            cadena = reader.nextLine();

            int numero = Integer.parseInt(cadena);

            System.out.println(numero);
        }
        catch (Exception mierror){
            
            System.out.println(mierror);
            System.out.println("El dato introducido no es un numero.");
        }
        
        System.out.println("Ya estoy fuera del try");

        
       
    }
}
