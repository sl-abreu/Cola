/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author robot
 */
public class Archivo {
    private double tamaño;
    private String nombre;
    private String dueño;
    private String fecha;
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(nombre+"\n");
        cad.append("Dueño:  "+dueño+"\n");
        cad.append("Fecha:  "+fecha+"\n");
        cad.append("Tamaño: "+tamaño+"\n");
        return cad.toString();
    }
}
