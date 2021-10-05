/**
 * Programa para mostrar la esctructura básica de lectura de datos
 * de consola
 *
 *  Usando  Scanner
 *
 * Curso: programacion 2021-2022
 * Clase: 4/Oct/2021
 * @author Roberto Mèndez Mèndez
 * @version 29/Sep/21
 */


import java.util.Scanner;

public class EntradaTecladoScanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Please say me the pet's name: ");
        String pet = teclado.nextLine();
        System.out.print("Your pet names is " + pet);
    }
}
