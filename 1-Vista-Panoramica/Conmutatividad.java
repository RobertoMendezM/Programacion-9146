/*
* Programa que bajo ciertos valores muestra que la conmutatividad
* no se cumple siempre
* Probar a= 1 ; b = 10E-16 ; c = -1
*
* Curso: programacion 2021-2022
* @author Roberto Mèndez Mèndez
* @version 29/Sep/21
*/

import java.util.Scanner;

public class Conmutatividad {

    public static void main(String [] args){
        double a,b,c;
        double r1, r2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un valor: ");
        a = teclado.nextDouble();
        System.out.print("Dame un valor: ");
        b = teclado.nextDouble();
        System.out.print("Dame un valor: ");
        c = teclado.nextDouble();
        r1 = a + b + c;
        r2 = a + c + b;
        System.out.println("a + b + c =  " + r1);
        System.out.println("a + c + b =  " + r2);

        if(r1 == r2)
            System.out.print("La suma es conmutativa ");
        else
            System.out.print("La suma no es conmutativa ");
    }
}
