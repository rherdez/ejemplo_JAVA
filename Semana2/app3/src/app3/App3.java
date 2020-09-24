/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author rober
 */
public class App3 {

    /**
     * @param args the command line arguments
     */
    static void suma(  ){
        System.out.println("La Suma es :"+(n1+n2));
    }
    static void resta(){
        System.out.println("La Resta es :"+(n1-n2));
    }
    static void multipicar(int x,int y){
        System.out.println("La Multiplicacion es :"+(n1*n2));
    }
    static int di(int x,int y){
        //System.out.println("El Resultado es :"+(n1/n2));
        return (n1/n2);
    }
    static void ingresar(){
        System.out.println("Ingres N1");
        n1=sc.nextInt();
        System.out.println("Ingres N2");
        n2=sc.nextInt();
    }
    
    static int sumar(int x){
        if(x<=0){
            return 0;
        }
        else
            return x+sumar(x-1);
    }
    static void agregar(){
        for(int i=0;i<5;i++){
            System.out.println("Ingrese un numero "+i+": ");
            Arreglo[i]=sc.nextInt();
        }
    }
    static void presentar(){
        for(int i=0;i<5;i++){
            System.out.println("Ingrese un numero "+i+": "+Arreglo[i]);
            
        }
    }
    static void ordenar(){
        int temp;
        for(int x=0;x<5;x++){
            for(int y=1;y<5;y++){
                if(Arreglo[y-1]<Arreglo[y]){
                    temp=Arreglo[y];
                    Arreglo[y]=Arreglo[y-1];
                    Arreglo[y-1]=temp;
                }
            }
        }
    }
    static int n1,n2;
    static int[] Arreglo=new int[5];
    //static ArrayList te=new ArrayList();
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        do{
            System.out.println("Menu");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Sumatoria");
            System.out.println("6) Ingresar Numeros");
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
                case 3:
                        ingresar();
                        multipicar(n1,n2);
                        break;
                case 4:
                        ingresar();
                        System.out.println("El Resultado es: "+di(n1,n2));
                        break;
                case 5:
                        System.out.println("Ingres N1");
                         n1=sc.nextInt();
                        System.out.println("El Resultado es: "+sumar(n1));
                       
                        break;
                case 6:
                    agregar();
                    ordenar();
                    presentar();
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
