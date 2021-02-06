/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021_tercero;

/**
 *
 * @author rober
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    static void menu(){
        System.out.println("Menu");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("0) Salir");
    }
    static void agregar(String titulo, int n){
        System.out.println(titulo);
        System.out.println("Ingrese n1: ");
        n1=sc.nextInt()+n;
        System.out.println("Ingrese n2: ");
        
        n2=sc.nextInt();
    }
    
    static void sumar(){
        System.out.println("La suma es: "+(n1+n2));
    }
    static void restar(){
        System.out.println("La resta es: "+(n1-n2));
    }
    
    static int multiplicar(){
        return n1*n2;
    }
    
    static int dividir(){
        return n1/n2;
    }
    static Scanner sc=new Scanner(System.in);
    static int n1;
    static int n2;
    public static void main(String[] args) {
        // TODO code application logic here
        int resp=0;
        
        do{
            menu();
            resp=sc.nextInt();
            
            switch(resp){
                case 1:
                    agregar("Suma",100);
                    sumar();
                    break;
                case 2:
                    agregar("Resta",0);
                    restar();
                    break;
                case 3:
                    agregar("Multiplicar",0);
                    System.out.println("El resultado es: "+multiplicar());
                    break;
                case 4:
                    agregar("Dividir",0);
                    System.out.println("El resultado es: "+dividir());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(resp!=0);
        
    }
    
}
