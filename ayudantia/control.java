import java.util.Scanner;

public class control {


    public static void miMetodo(int var) {
        //
        System.out.println("a es igual a " + var); 
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int contador = 0;
        if(a == 1){
            //Codigo. 
           //Primer funcion
           miMetodo(1);
        }
        else if (a == 2){
            // Mas codigo
            System.out.println("a es 2");
            
        }
        else if ( a == 5){
            
            int x = 1;
            for(int i = 0; i<=10; i++){
                System.out.println(i);

            }

            while(x <= 4){
                System.out.println(x);
                x++;
            }
            int dia = 1;
            String diaCadena;
            switch(dia){
                case 1 :
                    System.out.println("Lunes");
                    dia++;
                    
                    
                case 2 :
                    //Codigo
                    System.out.println("Martes");
                    
                case 3 :
                    //Codigo
                    System.out.println("Miercoles");
                    break;
                    
                default :
                    
                    System.out.println("Dia invalido");
                    //Codigo
                    break;
            }
            
            
           // System.out.println("Son "+ contador + " numeros");
            
            
        } 

    }
}
