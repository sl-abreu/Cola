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
public interface ColaADT<T> {
    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();
}
