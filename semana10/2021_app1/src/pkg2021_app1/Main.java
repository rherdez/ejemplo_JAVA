/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021_app1;

/**
 *
 * @author rober
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static void saludo(){
        int local=0;
        System.out.println("Hola Mundo");
    }
    static void  menu(){
        System.out.println("Menu");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Presentar numeros");
        System.out.println("5) Ingresar arreglo");
        System.out.println("0) Salir");
    }
    static void ingresar(){
        System.out.println("Ingrese Numero 1");
        n1=sc.nextInt();
        System.out.println("Ingrese Numero 2");
        n2=sc.nextInt();
    }
    static void sumar(){
        System.out.println("El resultado de la suma es: "+(n1+n2));
    }
    static void restar(){
        System.out.println("El resultado de la resta es: "+ (n1-n2) );
    }
    
    static int multiplicar(){
        return n1*n2;
    }
    static void pedir_numero(){
        int []arreglo=new int[5];
        
        for(int i=0;i<5;i++){
            System.out.println("Ingrese numero"+(i+1)+": ");
            arreglo[i]=sc.nextInt();
        }
        
        for(int i=0;i<5;i++){
            System.out.println("No "+(i+1)+": "+arreglo[i]);
        }
    }
    
    static int presentar(int n){
        if(n<=0){
            return 0;
        }
        else
        {
            presentar(n-1);
            System.out.println("No:"+n);
    
        }
        return 0;
    }
    
    
    static int n1=0;
    static int n2=0;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
       int res=0;
       do{
          menu();
          res=sc.nextInt();
          
          switch(res){
              case 1:
                  ingresar();
                  sumar();
                  break;
              case 2:
                  ingresar();
                  restar();
                  break;
              case 3:
                  ingresar();
                  System.out.println("El resultado de l a multiplicacion es :"+multiplicar());
                  break;
              case 4:
                  presentar(10);
                  break;
              case 5:
                  pedir_numero();
                  break;
              case 0:
                  break;
              default:
                  System.out.println("Opcion no valida");                                                      
          }
                     
       }while(res!=0);
    }
    
}
