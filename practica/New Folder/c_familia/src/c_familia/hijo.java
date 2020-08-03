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
public class hijo extends padre {
    
    public hijo(String k, String x ){
        super(k,x);
        
    }
    void herramienta_padre(){
        System.out.println(" Esta herramienta es del hijo ");
    }
}
