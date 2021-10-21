import java.util.Arrays;
import java.util.ArrayList;

public class listasArreglos {
    public static void main(String[] args) {
        
        //###########   ARRAYS ######################3
        String[] tiendita = new String[5];
        tiendita[0] = "pan";
        tiendita[1] = "jamon";
        tiendita[2] = "leche";
        tiendita[3] = "huevos";
        tiendita[4] = "galletas";
        tiendita[4] = "";
        
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 5;
        numeros[2] = 23;
        numeros[0] = -1;
        
        System.out.println(tiendita.length);
        
        for(int i = 0 ; i < tiendita.length ; i++){
            System.out.println(tiendita[i]);
        }
        
        
        int[] numeros2 = new int[30];
        
        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = i*i;
        }
        
        System.out.println(Arrays.toString(numeros2));
        System.out.println(numeros2);
        
        //###########   ARRAYLIST ######################3
        

        ArrayList<String> listaUtiles = new ArrayList<>();
        listaUtiles.add("lapiz");
        listaUtiles.add("goma");
        listaUtiles.add("cuaderno");
        listaUtiles.add("regla");

        System.out.println(listaUtiles);
        System.out.println(listaUtiles.size());
        
        
        System.out.println(listaUtiles.get(1));
        listaUtiles.remove(1);
        System.out.println(listaUtiles);
        
        listaUtiles.clear();
        System.out.println(listaUtiles);


        listaUtiles.add("pluma");
        System.out.println(listaUtiles.isEmpty());




        




    }
}
