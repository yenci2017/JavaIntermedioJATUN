
/**
 * Write a description of class Ejercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class  CurvaKcoth {
    public  int  calcularTriangulos ( int  nivel ) {
        if (nivel ==  1 ) {
            return  1 ;
        } else {
            return calcularTriangulos (nivel - 1 ) + ( int ) ( Math . pow ( 4 , nivel - 1 ));
        }
    }
}