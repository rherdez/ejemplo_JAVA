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
public class Empleado extends persona {
    String empresa;
    double sueldo;


    public Empleado(double x, int f,String d){
       super(f,d);
        sueldo=x;
         
    }
    
    public Empleado(){
   
    }
     
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
