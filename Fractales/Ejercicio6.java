
/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio6
{
    public  int  CalcularArbol ( int  nivel ) {
        if (nivel ==  1 ) {
            return  1 ;
        } else {
            return CalcularArbol (nivel - 1 ) + ( int ) ( Math . pow ( 2, nivel - 1 ));
        }
    }
}