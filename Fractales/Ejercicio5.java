
/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio5
{

    public  int  calcularCruzViseck ( int  nivel ) {
        if (nivel ==  1) {
            return  4 ;
        } else{
            if (nivel ==  1 ) {
                return (calcularCruzViseck (nivel - 1 ) + 3) ;
            } else {
                return calcularCruzViseck (nivel - 1 ) + ( int ) ( Math . pow ( 2,3)* ( int ) ( Math . pow ( 5,( nivel - 1 )-1)));
            }
        }
    }
}

 