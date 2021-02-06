/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021_4to;

/**
 *
 * @author rober
 */
public class persona {
    private String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public void set_nombre(String x){
        nombre=x;
    }
    public String get_nombre(){
        return nombre;
    }
}
