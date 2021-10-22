import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;


public class readCSV {
    
    
    
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
     
        try{
           BufferedReader reader = new BufferedReader(new FileReader("precios.csv"));
           while ((line = reader.readLine()) != null){
                String[] dato = line.split(splitBy);
                //precio_final = dato[0] + dato[1];
                //lista.add(dato[0],dato[1],dato[2],x);
                System.out.println("precio " + dato[0] + " ganancias " + dato[1] );



           }
           reader.close();
           // escribir lista a un archivo. 
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(".--.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        String a = "george,23,0";
        String[] b = a.split(splitBy);
        System.out.println(Arrays.toString(b));

        try{
            FileWriter writer = new FileWriter("output.txt");
            
            writer.write(Arrays.toString(b) + System.lineSeparator());
            //writer.write("hola como estas" + System.lineSeparator());

        
            writer.close();  
        } catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println(b);


    }

    
}
