/**
 * Programa para mostrar un menú básico
 *
 * Se ejemplifica tomar un caracter de teclado
 *
 * Curso: programacion 2021-2022
 * @author Roberto Mèndez Mèndez
 * @version 4/Oct/21
 */

import java.util.Scanner;

public class Menu1 {

    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qué medida de tendencia central requieres: ");
        System.out.println("1.- Moda \n" +
                         "2.- Mediana \n" +
                         "3.- Media Aritmética \n" +
                         "4.- Media Geométrica \n" +
                         "5.- Media Armónica");
        System.out.print("Selecciona el número de operación que quieras: ");
        // Scanner no tiene nextChar()
        char seleccion = teclado.next().charAt(0);

        System.out.println("Tu selección fue: " + seleccion);

        if('1' == seleccion){
            System.out.println("Tu selección fue \"moda\" ");
        }else if ('2' == seleccion){
            System.out.println("Tu selección fue \"mediana\" ");
        }else if ('3' == seleccion){
            System.out.println("Tu selección fue \"media aritmética\" ");
        }else if ('4' == seleccion){

        } else {
            System.out.println("Tu selección fue \"media armónica\", te gusta la física ¿verdad? ");
        }
    }

}
