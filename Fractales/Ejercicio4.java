
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio4
{
    public  int  CalcularTriánguloSierpinski  ( int  nivel ) {
        if (nivel ==  1 ) {
            return  1 ;
        } else {
            return CalcularTriánguloSierpinski (nivel - 1 ) + 4 *( int ) ( Math . pow ( 3, (nivel - 1 )-1));
        }
    }
}
