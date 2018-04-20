/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import cola.ColaA;
import cola.ColaADT;
import cola.ExcepcionColaVacia;
import pila.*;

/**
 *
 * @author robot
 */
public class EjerciciosColas {
    
    public static <T> void invierte(ColaADT<T> cola){
        if(cola!=null && !cola.isEmpty()){
            PilaADT<T> aux=new PilaA();
            
            while(!cola.isEmpty())
                aux.push(cola.pop());
            while(!aux.isEmpty())
                cola.push(aux.pop());
        }
    }
    public static <T> void eliminaRepetidos(ColaADT<T> cola){
        if(cola!=null && !cola.isEmpty()){
            ColaADT<T> aux=new ColaA();
            T temp=cola.pop();
            
            aux.push(temp);
            while(!cola.isEmpty())
                if(!cola.peek().equals(temp)){
                    temp=cola.pop();
                    aux.push(temp);
                }
                else
                    cola.pop();
            while(!aux.isEmpty())
                cola.push(aux.pop());
        }
    }
    public static <T> int eliminaOcurrencias(ColaADT<T> cola, T dato){
        if(cola!=null && !cola.isEmpty()){
            ColaADT<T> aux=new ColaA();
            int cont=0;
            
            while(!cola.isEmpty())
                if(!cola.peek().equals(dato)){
                    cont++;
                    aux.push(cola.pop());
                }
                else
                    cola.pop();
            while(!aux.isEmpty())
                cola.push(aux.pop());
            return cont;
        }
        throw new ExcepcionColaVacia();
    }
    public static <T> String asString(ColaADT<T> cola){
        if(cola!=null && !cola.isEmpty()){
            ColaADT<T> aux=new ColaA();
            StringBuilder cad=new StringBuilder();
            
            while(!cola.isEmpty()){
                cad.append(cola.peek().toString()+"\t");
                aux.push(cola.pop());
            }
            while(!aux.isEmpty())
                cola.push(aux.pop());
            return cad.toString();
        }
        throw new ExcepcionColaVacia();
    }
    
    public static void main(String[] args) {
        ColaADT<Double> cola=new ColaA();
        
        for(double i=0;i<15;i++){
            cola.push(i);
            cola.push(i+1);
        }
        
        System.out.println(asString(cola));
        invierte(cola);
        System.out.println(asString(cola));
        eliminaRepetidos(cola);
        System.out.println(asString(cola));
    }
}
