/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_clases;

/**
 *
 * @author rober
 */
public class mouse {
    String color;
    int N_botones;
    
    public    mouse(String c, int n){
        color=c;
        N_botones=n;
    }
    
     public    mouse(int c, int n){
        color=String.valueOf(c);
        N_botones=n;
    }
     
    
    public  mouse(){
        color="";
        N_botones=0;
    }
    
    public void set_color(String c){
        color=c;
    }
    
    public String get_color(){
        return color;
    }
    
    public void set_Nbotones(int x){
        N_botones=x;
    }
    
    public int get_Nbotones(){
        return N_botones;
    }   
    
   
    
}
