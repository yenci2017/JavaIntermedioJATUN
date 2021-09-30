
/**
 * Write a description of class Ejercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio3
{

    public int verificar(int n){
        int contador;
        int aux= n/10;
        if(n>0){
            if((n%10)%2 == 0){
                contador =1+verificar(aux);

            }else{
               contador=verificar(aux);
            }
        }else{
            contador =0;

        }
        return contador;
    }
}

