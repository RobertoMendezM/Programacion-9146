/**
 * Programa para mostrar la esctructura básica de entrada de datos
 * de consola
 *
 *  Usando: InputStreamReader y BufferedReader
 *  Detalles: Requiere try-catch
 * Con este programa ejemplificamos además el alcance de una variable
 *
 * Curso: programacion 2021-2022
 * Clase: 4/Oct/21
 * @author Roberto Méndez Méndez
 * @version 29/Sep/21
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class EntradaTeclado {

    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(isr);
        // Se debe declarar aquí para evitar un error
        String carrera = "";

        System.out.print("En que carrera estás: ");
        try {
            carrera = teclado.readLine();
            // String carrera = ...   marcaría un error al declararlo aquí adentro
        }catch(IOException e){
            System.err.println("Algo salió mal con la lectura de datos");
        }

        System.out.println("Tu estudias" + carrera );
    }
}
