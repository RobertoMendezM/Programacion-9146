/*
 * Programa para mostra la esctructura b[asica de entrada de datos
 * de consola
 *
 *  Uaando: InputStreamReader y BufferedReader
 *  Detalles: Requiere try-catch
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


        System.out.print("En que carrera estás: ");
        try {
            String carrera = teclado.readLine();
        }catch(IOException e){
            System.err.println("Algo salió mal con la lectura de datos");
        }

        //System.out.println("Tu estudias" + carrera );
    }
}
