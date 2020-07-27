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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        mouse klip=new mouse();
        
        System.out.println("Ingrese Color Mouse");
        klip.set_color(sc.next());
        System.out.println("Ingrese Botones");
        klip.set_Nbotones(sc.nextInt());
        ////
        System.out.println("El color es: "+ klip.get_color());
        System.out.println("El numero de botones es: "+klip.get_Nbotones());
                     
        
    }
    
}
