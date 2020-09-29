/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app5;

/**
 *
 * @author rober
 */
public class persona {
    int id;
    String Nombre;

    public persona(int z,String n){
        id=z;
        Nombre=n;
    }
    public persona(){
      
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
