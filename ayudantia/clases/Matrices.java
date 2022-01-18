import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int x = 4 ;
        int[][] numeros = new int[x][4];
        numeros[0][0] = 1;
        numeros[1][1] = 1;

        
        System.out.println(Arrays.toString(numeros[0]));

        printMatriz(numeros);

        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros.length; j++){
                numeros[i][j] = j; 
            }
        }
                
        printMatriz(numeros);
        
        int[][] numeros2 = {{1,1,1,1},{2,2,2,2},{3,3,3},{4,4}};
        printMatriz(numeros2);

        int[][] numeros3 = new int[3][];

        numeros3[0] = new int[3];
        numeros3[1] = new int[2];
        numeros3[2] = new int[4];
        numeros3[0] = new int[4];
        

        for (int i = 0; i < numeros3.length; i++) {
            for (int j = 0; j < numeros3[i].length; j++) {
                numeros3[i][j] = j;
            }
        }
        printMatriz(numeros3);


        int[][][] matrix3d = new int[3][3][3];
        matrix3d[0][0][0] = 1 ;
        matrix3d[1][1][1] = 1 ;
        matrix3d[2][2][2] = 1 ;

        System.out.println("#############");

        for( int i= 0; i<matrix3d.length ; i++){
            printMatriz(matrix3d[i]);
        }
        



    }

    public static void printMatriz(int[][] matriz) {
        System.out.println("#############");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
