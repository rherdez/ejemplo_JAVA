/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021_4to;

/**
 *
 * @author rober
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    static ArrayList<persona> grupo=new ArrayList<persona>();
    static Scanner sc=new Scanner(System.in);
  
    static void agregar(){
         persona p=new persona();
        System.out.println("Ingrese Nombre: ");
        p.set_nombre(sc.next());
        System.out.println("Ingrese Edad: ");
        p.setEdad(sc.nextInt());
        
        grupo.add(p);
        
    }
    static void presentar(){
        for(int i=0;i<grupo.size();i++){
            System.out.println((i+1)+")====================================");
            System.out.println("Nombre: "+grupo.get(i).get_nombre());
            System.out.println("Edad: "+grupo.get(i).getEdad());
            
        }        
    }
    
    static void eliminar(){
        String nombre;
        boolean encontrado=false;
        System.out.println("Nombre que desea Eliminiar?");
        nombre=sc.next();
        
        for(int i=0;i<grupo.size();i++){
            if(grupo.get(i).get_nombre().equals(nombre)){
                grupo.remove(i);
                System.out.println("Dato Eliminado");
                encontrado=true;
                i=grupo.size();
            }
        }
        
        if(!encontrado){
            System.out.println("Nombre no Existe en el grupo");
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
      
       
       int op=0;
       
       do{
           System.out.println("Menu");
           System.out.println("1) Agregar");
           System.out.println("2) Presentar");
           System.out.println("3) Eliminar");
           System.out.println("0) Salir");
           op=sc.nextInt();
           
           switch(op){
               case 1:
                   agregar();
                   break;
               case 2:
                   presentar();
                   break;
               case 3:
                   eliminar();
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Opcion no valida");
           }
           
       }while(op!=0);                    
    }    
}
