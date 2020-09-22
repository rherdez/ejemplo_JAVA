/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app3;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class App3 {

    /**
     * @param args the command line arguments
     */
    static void suma(){
        System.out.println("La Suma es :"+(n1+n2));
    }
    static void resta(){
        System.out.println("La Resta es :"+(n1-n2));
    }
    static void ingresar(){
        System.out.println("Ingres N1");
        n1=sc.nextInt();
        System.out.println("Ingres N2");
        n2=sc.nextInt();
    }
    static int n1,n2;
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        do{
            System.out.println("Menu");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("0) Salir");
            op=sc.nextInt();
            
            switch(op){
                case 1:
                        ingresar();
                        suma();
                        break;
                case 2:
                        ingresar();
                        resta();
                        break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
        }while(op!=0);              
    }    
}
