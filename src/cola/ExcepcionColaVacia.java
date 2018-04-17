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
public class ExcepcionColaVacia extends RuntimeException {

    public ExcepcionColaVacia() {
        super("Cola vacía");
    }
    
}
