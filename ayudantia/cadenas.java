import java.util.Scanner;
public class cadenas {
    public static void main(String[] args) {
        String palindromo = "sometemos"; 
        int tamanio = palindromo.length();
        
        String resultado = "El palindromo "+ palindromo ;
        String resultado2 = " mide " + tamanio;
        
        System.out.println(resultado.concat(resultado2));

        String foo = resultado.concat(resultado2);
        // .-.-.-.-.-.-.-.-.-.-.-.-.

        System.out.println(foo.charAt(foo.length()-1));
       
       // .-.-.-.-.-.-.-.-.-.-.-.-.
       Scanner reader = new Scanner(System.in);
       String cadena = "";
       cadena = reader.nextLine();
       
       String var1 = "reconocer" ;
       String var2 = "reconocer";
       
       System.out.println(var1.equals(cadena));
       // .-.-.-.-.-.-.-.-.-.-.-.-.
    
       System.out.println(var1.endsWith("ar"));

       // .-.-.-.-.-.-.-.-.-.-.-.-.
       
       System.out.println(var1.indexOf("ec"));
       
       // .-.-.-.-.-.-.-.-.-.-.-.-.
       
       System.out.println(var1.substring(1));
       
       // .-.-.-.-.-.-.-.-.-.-.-.-.
       String foo2 = "        Hola Mundo";
       System.out.println(foo2.toLowerCase().toUpperCase());
       
       System.out.println(foo2.trim());
       // .-.-.-.-.-.-.-.-.-.-.-.-.

       String s1 = "Baby, baby, baby, ooh, like Baby, baby, baby, no, like Baby, baby, baby, ooh Thought you'd always be mine, mine Oh, for you, I would have done whatever And I just can't believe we ain't together And I wanna play it cool, but I'm losing you I'll buy you anything, I'll buy you any ring And I'm in pieces, baby, fix me And just shake me till you wake me from this bad dream I'm going down, down, down, down And I just can't believe my first love won't be around And I'm like";
        //System.out.println(s1);
        System.out.println(s1.replace("baby", "girl"));
        System.out.println(s1.replaceFirst("baby", "girl"));




    }
}
