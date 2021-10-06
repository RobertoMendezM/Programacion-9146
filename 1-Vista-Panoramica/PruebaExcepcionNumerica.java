/**
 * Programa que ejemplifica manejo de 'excepciones' y como opera al clase padre
 *
 * Usa:  -> InputMismatchException, NumberFormatException,InterruptedException
 *       -> Thread.sleep(500)
 * -) Se utiliza  NoSuchElementException, para ejemplificar como la clase padre cacha
 * excepciones de la clase hijo, en este caso InputMismatchException,
 * -) Se utiliza un ciclo para que en caso de cometer un error vuelva a pedir los datos.
 *
 * Curso: programacion 2021-2022
 * Clase: 6/Oct/2021
 * @author Roberto Mèndez Mèndez
 * @version 6/Oct/21
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class PruebaExcepcionNumerica {

    public static void main(String [] args)  {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        int ingresa = 1;
        do {
            try {
                Thread.sleep(500);
                System.out.println("\n\t INGRESA LOS SIGUIENTES DATOS: \n");
                System.out.print("Da el valor de a: ");
                a = teclado.nextInt();
                System.out.print("Da el valor de b: ");
                b = teclado.nextInt();
                double c = a / b;
                System.out.print("Dime tu edad: " );
                String nombre = teclado.next();
                int d = Integer.parseInt(nombre);
                break;

            }catch (InputMismatchException e) {
                System.err.println("Formato de número incorrecto");

                System.err.println("división entre 0");

            } catch (NumberFormatException e) {
                System.err.println("Parse incorrecto. No diste tu edad o el formato es incorrecto");

            } catch (InterruptedException e){
                System.err.print("Falla al utilizar Time.sleep");
            }
        }while( true );
    }
}
