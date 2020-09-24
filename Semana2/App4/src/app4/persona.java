/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app4;

/**
 *
 * @author rober
 */
public class persona {
    int id;
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void set_id(int ids){
        id=ids;
    }
    
    public int get_id(){
        return id;
    }
}
