/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_familia;

/**
 *
 * @author rober
 */
public class padre extends abuelo  {
    int edad_padre;
    String nombre_padre;

    public int getEdad_padre() {
        return edad_padre;
    }

    public void setEdad_padre(int edad_padre) {
        this.edad_padre = edad_padre;
    }

    public String getNombre_padre() {
        return nombre_padre;
    }

    public void setNombre_padre(String nombre_padre) {
        this.nombre_padre = nombre_padre;
    }
    
    void herramienta_padre(){
        System.out.println("Esta Herramienta es del padre");
    }
    
}
