/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author robot
 */
public class ColaA<T> implements ColaADT<T> {
    private T[] cola;
    private int inicio,fin;
    private final int MAX_COLA=20;
    
    public ColaA(){
        cola=(T[]) new Object[MAX_COLA];
        inicio=-1;
        fin=-1;
    }
    public ColaA(int max){
        cola=(T[]) new Object[max];
        inicio=-1;
        fin=-1;
    }
    
    @Override
    public boolean isEmpty(){
        return inicio==-1;
    }
    @Override
    public T peek(){
        if(!isEmpty())
            return cola[inicio];
        throw new ExcepcionColaVacia();
    }
    @Override
    public void push(T dato){
        if(inicio==-1)
            inicio=0;
        if((fin+1)%cola.length==inicio)
            expandCapacity();
        fin=(fin+1)%cola.length;
        cola[fin]=dato;
    }
    @Override
    public T pop(){
        if(isEmpty())
            throw new ExcepcionColaVacia();
        T res=cola[inicio];
        cola[inicio]=null;
        if(inicio==fin){
            inicio=-1;
            fin=-1;
        }
        else
            inicio=(inicio+1)%cola.length;
        return res;
    }
    private void expandCapacity(){
        T[] nuevo= (T[]) new Object[cola.length*2];
        
        for(int i=0;i<cola.length;i++)
            nuevo[i]=cola[(i+inicio)%cola.length];
        inicio=0;
        fin=cola.length-1;
        cola=nuevo;
    }
}
