/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_app2;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class C_app2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
            Scanner ct= new Scanner (System.in);
            char letra;

            System.out.println("Ingrese una letra");
            letra=ct.next().charAt(0);

            switch(letra)
            {
                case 'a':                            
                case 'e':                
                case 'i':               
                case 'o':               
                case 'u':
                   System.out.println("Es vocal");
                   break;
                default: 
                   System.out.println("Es una consonante");
            }   
                    
    }
    
}
