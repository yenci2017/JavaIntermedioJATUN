

public class ContadorDigitosNatural{
    
    public int contadorDigitos(int numero){
        int contador =0;
        while(numero>0){
            numero = numero/10;
            contador++;
        }
        return contador;
   
    }
    
    public int contadorDigitosRec(int numero){
        int contador =0;
        if(numero>0){
            numero = numero/10;
            contador = 1+ contadorDigitosRec(numero);
        }else{
            contador = 0;
        }
        return contador;
}
}
