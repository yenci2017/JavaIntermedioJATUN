
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlfombraSierpinski
{
    public  int  calcularCuadradosBlancoscalcularCuadradosBlancos ( int  nivel ) {
        if (nivel ==  1 ) {
            return  1 ;
        } else {
            return (calcularCuadradosBlancos (nivel - 1 ) * 8 ) + 1 ;
        }
    }
}
