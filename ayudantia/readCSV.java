import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;


public class readCSV {
    
    
    
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
     
        try{
           BufferedReader reader = new BufferedReader(new FileReader("texto.csv"));
           while ((line = reader.readLine()) != null){
                String[] dato = line.split(splitBy);
                System.out.println("nombre " + dato[0] + " edad " + dato[1] );
           }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(".--.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        String a = "jorge,23,0";
        String[] b = a.split(splitBy);
        //System.out.println(Arrays.toString(b));
        System.out.println();


    }

    
}
