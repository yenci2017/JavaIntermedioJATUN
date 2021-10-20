import java.util.*;
public class ArbolBin<T>{
    private T raiz;
    private ArbolBin<T> izq;
    private ArbolBin<T> der;
    public ArbolBin(){
        raiz = null;
        izq = null; 
        der = null;
    }

    public boolean estaVacio(){
        return raiz==null;
    }

    public void addAmplitud(T dato){
        Queue<ArbolBin<T>> cola = new LinkedList<>();
        cola.offer(this);
        addAmplitud(dato,cola);
    }

    private void addAmplitud(T dato, Queue<ArbolBin<T>> cola){
        ArbolBin<T> act = cola.poll(); 
        if(act.estaVacio()){
            act.raiz = dato;
            act.izq = new ArbolBin<T>();
            act.der = new ArbolBin<T>();
        }else{
            cola.add(act.izq);
            cola.add(act.der);
            addAmplitud(dato,cola);
        }
    }

    public void preOrden(){
        if(!estaVacio()){
            System.out.print(raiz+" ");
            izq.preOrden();
            der.preOrden();
        }
    }

    public void inOrden(){
        if(!estaVacio()){
            izq.inOrden();
            System.out.print(raiz+" ");
            der.inOrden();
        }
    }

    public void postOrden(){
        if(!estaVacio()){
            izq.postOrden();
            der.postOrden();
            System.out.print(raiz+" ");
        }
    }

    public void vizualizarRecorridosDFS(){
        System.out.print("PreOrden: "); preOrden(); System.out.println();
        System.out.print("InOrden: "); inOrden(); System.out.println();
        System.out.print("PostOrden: "); postOrden(); System.out.println();
    }
    //Tarea
    public int contarNodosHoja(){
        int res;
        if(!estaVacio()){
            if(esHoja()){
                res = 1;
            }else{
                res = izq.contarNodosHoja() + der.contarNodosHoja();
            }
        }else{
            res = 0;
        }
        return res;
    }

    private boolean esHoja(){
        return izq.estaVacio() && der.estaVacio();
    }

    public void mostrarNodosDelNivelN(int nivel){
        if(!estaVacio()){
            if(nivel==0){
                System.out.print(raiz+" ");
            }else{
                izq.mostrarNodosDelNivelN(nivel-1);
                der.mostrarNodosDelNivelN(nivel-1);
            }
        }
    }

    public boolean contains(T dato){
        boolean res = false;
        if(!estaVacio()){
            if(raiz == dato){
                res = true;
            }else{
                res = izq.contains(dato);
                if(res==false){
                    res = der.contains(dato);
                }
            }
        }
        return res;
    }

    public T eliminarHoja(T dato){
       T res = null;
        if(!estaVacio()){
            if(raiz.equals(dato)){
                if(raizHoja()){
                    res=raiz;
                    raiz=null;
                    izq=der=null;
                }
            }
            else{
                res=izq.eliminarHoja(dato);
                if(res==null){
                    res=der.eliminarHoja(dato);
                }
            }
       }
       return res;
    }
    private  boolean raizHoja(){
        return(izq.estaVacio()&&der.estaVacio());
    }
}

        