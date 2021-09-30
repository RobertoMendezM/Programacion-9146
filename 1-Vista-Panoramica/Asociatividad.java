
/**
 * Write a description of class Asociatividad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Asociatividad
{
    public static void main(String [] args){
    double a = 1;
    double b = .0000000000000001;
    double w = 10E-16;
    double c = -1;
    double d = (a + b) + c;
    double e = a + (b + c);
    System.out.println(d + " = " + e);
    System.out.println(w);
    }
}
