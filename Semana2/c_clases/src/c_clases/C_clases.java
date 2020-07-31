/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_clases;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class C_clases {

    /**
     * @param args the command line arguments
     */
    static mouse []klip=new mouse[4];
    static void ordenar(){
        mouse temp=new mouse();
        
        for(int i=0;i<4;i++){
            for(int x=1;x<4;x++){
                if(klip[x-1].N_botones>klip[x].N_botones){
                   
                    
                    temp.N_botones=klip[x].N_botones;
                    temp.color=klip[x].color;
                    
                    klip[x].N_botones=klip[x-1].N_botones;
                    klip[x].color=klip[x-1].color;
                    
                    klip[x-1].N_botones=temp.N_botones;
                    klip[x-1].color=temp.color;
                                                            
                }
                
            }
        }
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
     
        for(int i=0;i<4;i++){
            klip[i]=new mouse();
            System.out.println("Ingrese Color Mouse");
            klip[i].set_color(sc.next());
        
            System.out.println("Ingrese Botones");
            klip[i].set_Nbotones(sc.nextInt());
        }
        ////
      ordenar();
      ///prsentar
        
      for(int i=0;i<4;i++){
        System.out.println("El color es: "+ klip[i].get_color());
        System.out.println("El numero de botones es: "+klip[i].get_Nbotones());
      }
        
    }
    
}
