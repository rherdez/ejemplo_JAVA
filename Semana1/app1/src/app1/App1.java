/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
      /*  int n1,n2,n3;
        System.out.println("Ingrese N1");
        n1=sc.nextInt();
        System.out.println("Ingrese N2");
        n2=sc.nextInt();
        n3=n1+n2;
        System.out.println("El resultado de la suma es : "+n3);
        */
        int edad;
        System.out.println("Ingrese su Edad");
        edad=sc.nextInt();
        if(edad>=21){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
        
        
    }
    
}
