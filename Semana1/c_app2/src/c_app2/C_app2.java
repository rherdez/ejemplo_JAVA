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
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.println("Ingrese un numero 1-7");
        n=sc.nextInt();
        
        switch(n){
            case 1:
                    System.out.println("Domingo");
                    break;
            case 2: 
                    System.out.println("Lunes");
                    break;
            case 3:
                    System.out.println("Martes");
                    break;
            case 4:
                    System.out.println("Miercoles");
                    break;
            case 5:
                    System.out.println("Jueves");
                    break;
            case 6:
                    System.out.println("Viernes");
                    break;
            case 7:
                   System.out.println("Sabado");     
                   break;
            default:
                System.out.println("opcion no valida");
                  
        }   
    }
    
}
