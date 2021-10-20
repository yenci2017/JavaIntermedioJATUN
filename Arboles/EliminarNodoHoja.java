
/**
 * Write a description of class EliminarNodoHoja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EliminarNodoHoja
{
    public T eliminar(T dato){
        T res=null;
        if(!estaVacia()){
            if(raiz.equals(d)){
                if(raizHoja()){
                    res=raiz;
                    raiz=null;
                    izq=der=null;
                }
                else{
                    res=izq.eliminar(d);
                    if(res==null){
                        res=der.eliminar(d);
                    }
                }
            }
            else{
                res=izq.eliminar(d);
                if(res==null){
                    res=der.eliminar(d);
                }
            }
        }
        return res;
    }
}