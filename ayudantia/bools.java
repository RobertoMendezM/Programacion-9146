/**
 * files
 */
public class files {

    public static void main(String[] args) {
        int x = 1;
        System.out.println((x>1) & (x++ < 10));
        System.out.println((1>x) && (1 > x++));
        System.out.println((1 == x) | (10 > x++));
        System.out.println((1 == x) || (10 > x++));
        x = 1;
        //System.out.println((++x)+ x);
        
        x = 1;
        System.out.println(x++);
        System.out.println(x);
        
        x = 1;
        System.out.println(++x);
        System.out.println(x);
        
        x = 1;
        System.out.println((x +  (++x)));

        int a = 6; // 110
        int b = 4; // 100

        int c = a & b;
        // 110
        // & 100
        //------
        // 100
        
        int d = a | b;
        // 110
        // | 100
        //------
        // 110

        System.out.println(c);
        System.out.println(d);
        
        
        
        
        
        
        
    }
}