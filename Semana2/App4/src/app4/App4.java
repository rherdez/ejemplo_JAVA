/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app4;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author rober
 */
public class App4 {

    /**
     * @param args the command line arguments
     */
    
    
      static ArrayList<persona> conjunto=new ArrayList();
      
      static void agregar(){
           Scanner sc=new Scanner(System.in);
           persona a =new persona();
           System.out.println("Ingrese Codigo");
           a.set_id(sc.nextInt());
           System.out.println("Nombre");
           a.setNombre(sc.next());
        
            conjunto.add(a);
      }
      
      static void presentar(){
          
          for(int i=0;i<conjunto.size();i++){
               ///presentar
               System.out.println(i+")=====================");
                System.out.println("ID: "+conjunto.get(i).get_id());
                System.out.println("Nombre:"+conjunto.get(i).getNombre());
          }
      }
      
       static int buscar(int b_id){
        
          for(int i=0;i<conjunto.size();i++){
               if(conjunto.get(i).get_id()==b_id ){
                    System.out.println("=========Registro Encontrado=============");
                    System.out.println("ID: "+conjunto.get(i).get_id());
                    System.out.println("Nombre:"+conjunto.get(i).getNombre());
                   
                    return i;
               }
          }
         
          return -1;
      }
         static void modificar(int pos){
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Ingrese Codigo Nuevo:");
           conjunto.get(pos).set_id(sc.nextInt());
           System.out.println("Ingrese Nombre Nuevo:");
           conjunto.get(pos).setNombre(sc.next());
        
            
      }
    public static void main(String[] args) {      
        Scanner sc=new Scanner(System.in);             
        int op;
        int id;        
        do{
            System.out.println("Menu");
            System.out.println("1) Agregar");
            System.out.println("2) Presentar");
            System.out.println("3) Buscar");
            System.out.println("4) Modificar");
            System.out.println("5) Eliminar");
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
                    System.out.println("Ingrese Codigo a Buscar");
                    id=sc.nextInt();
                    if(buscar(id)==-1){             
                         System.out.println("Registro No Encontrado!!!!");          
                    }
                    break;
                case 4:
                    System.out.println("Ingrese Codigo a Buscar");
                    id=sc.nextInt();
                    id=buscar(id);
                    if(id!=-1){             
                         modificar(id);
                    }
                    else{
                        System.out.println("Registro no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese Codigo a Eliminar");
                    id=sc.nextInt();
                    id=buscar(id);
                    if(id!=-1){             
                        conjunto.remove(id);
                    }
                    else{
                        System.out.println("Registro no encontrado");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion No valida!!!!!");
            }
            
        }while(op!=0);        
    }    
}
