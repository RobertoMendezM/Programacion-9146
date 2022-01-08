/**
 * Curso: Programación
 *
 * Temas: Arreglos Multidimensionales
 *
 * Fecha: 7/ Dic/ 21
 */

public class UsaArregloMulti {

    public static void main(String [] dat){

        double [][] lugares ;
        lugares = new double [15][3];

        ManejoArregloMultidimensional mam = new ManejoArregloMultidimensional();

        int[][]  predefinido = {
                                { 38, 2, -5, 9},
                                {-6, 55, 8, 51}
                            };

        char[][] curso = {
                                {'C', 'U', 'R','S','0'}, // 5 columnas
                                {'D','E'},               // 2 columnas
                                {'P','R','O','G','R','A','M','A','C','I','O','N'} // 12 columns
                            };

        lugares[0][1] = 4.7;
        lugares[12][0] = -12;



        for (int renglon = 0; renglon < curso.length; renglon++)
        {
            for (int columna = 0; columna < curso[renglon].length ; columna++)
            {
                System.out.print( curso[renglon][columna]);
            }
            System.out.println();
        }


        mam.llenaDatos(2,2);
    }

}
