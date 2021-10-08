import java.util.Scanner;

public class estructuras {

    public static String miGlobal = "Adios";

    public static String miMetodo(){
        String var = "Hola";
        System.out.println("Mi metodo -> " + var);
        System.out.println("Mi metodo -> " + miGlobal);
        return var;
    }
    public static void main(String[] args) {
        String resultado = miMetodo();
        System.out.println("main -> " + resultado);
        System.out.println("main -> " + miGlobal);
    
       
    }
}
