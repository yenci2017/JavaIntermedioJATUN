
/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio5
{
   
    public  int  multiplicar ( int  m , int  n ) {
        int res;
        if (n ==  1 ) {
            res = m;
        } else {
            res = m + multiplicar (m, n - 1 );
        }
        return res;
    }
    public  int  multiplicar2 ( int  m , int  n ) {
        if (n ==  1 ) {
            return m;
        } else {
            return m + multiplicar2 (m, n - 1 );
        }
    }
}