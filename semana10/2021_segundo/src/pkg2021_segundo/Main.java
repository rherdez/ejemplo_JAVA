/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021_segundo;

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
        int respuesta=0;
        int []arr=new int[10];
        int temp=0;
        
        do{
            System.out.println("Menu");
            System.out.println("1) Agregar");
            System.out.println("2) ordenar");
            System.out.println("3) Presentar 4 mejores");
            System.out.println("4) Presentar 4 NO mejores");
            System.out.println("5) Presentar");
            System.out.println("6) Promedio");
            System.out.println("0) Salir");
            respuesta=sc.nextInt();
            
            switch(respuesta){
                case 1:
                    for(int i=0;i<10;i++){
                        System.out.println("Ingrese no"+(i+1)+": ");
                        arr[i]=sc.nextInt();
                        
                    }
                    break;
                case 2:
                    for( int x=0;x<10;x++){
                        for(int j=1;j<10;j++){
                            if(arr[j-1]<arr[j]){
                                temp=arr[j];
                                arr[j]=arr[j-1];
                                arr[j-1]=temp;
                            }                            
                        }
                    }
                    System.out.println("Ordenado");
                    break;
                case 3:
                    System.out.println("4 mejores");
                    for(int i=0;i<4;i++){
                        System.out.println("Ingrese no"+(i+1)+": "+arr[i]);                                            
                    }
                    break;
                 case 4:
                    System.out.println("4 NO mejores");
                    for(int i=9;i>5;i--){
                        System.out.println("Ingrese no"+(i+1)+": "+arr[i]);                                            
                    }
                    break;

                case 5:
                    for(int i=0;i<10;i++){
                        System.out.println("Ingrese no"+(i+1)+": "+arr[i]);                                            
                    }
                    break;
                case 6:
                    double suma=0;
                    for(int i=0;i<10;i++){
                        suma+=arr[i];
                    }
                    System.out.println("Suma:"+suma);
                    System.out.println("Promedio: "+(suma/10.00));
            }
                    
        }while(respuesta!=0);                     
    }
    
}
