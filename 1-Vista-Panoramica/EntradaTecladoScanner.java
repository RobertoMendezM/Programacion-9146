/*
 * Programa para mostra la esctructura básica de entrada de datos
 * de consola
 *
 *  Uaando  Scanner
 *
 * Curso: programacion 2021-2022
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
