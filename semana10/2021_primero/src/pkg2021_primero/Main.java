/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021_primero;

/**
 *
 * @author rober
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String x="";
        
        System.out.println("Ingrese una letra");
        x=sc.next();
       /* String s="";
        System.out.println("Ingrese su edad");
        x=sc.nextInt();
        System.out.println("Su edad es: "+x);
        System.out.println("Tiene Cedula");
        s=sc.next();
        
               
        if( x>=18  && s.equals("s") ){
            System.out.println("Usted es Ciudadano");
        }
        else{
            System.out.println("Usted es un niño");
        }
        */
       switch(x){
           case "a":
           case "e":
           case "i":
           case "o":
           case "u":
               System.out.println("Vocal");
               break;
           default:
             System.out.println("Consonante");
       }
                       
    }
    
}
