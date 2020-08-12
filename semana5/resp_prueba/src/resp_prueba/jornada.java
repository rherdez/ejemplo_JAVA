/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resp_prueba;

/**
 *
 * @author rober
 */
public class jornada {
    String nombre_jornada;

    public String getNombre_jornada() {
        return nombre_jornada;
    }

    public void setNombre_jornada(String nombre_jornada) {
        this.nombre_jornada = nombre_jornada;
    }
    
    public jornada(String n){
        nombre_jornada=n;
    }
}
