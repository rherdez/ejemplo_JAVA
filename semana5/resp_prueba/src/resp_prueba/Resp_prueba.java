/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resp_prueba;
import java.util.Scanner;
/**
 *
 * @author rober
 */
public class Resp_prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        actividad ac[]=new actividad[10];
        
        actividad temp=new actividad("");
        
        int pos=0;
        int op;
        
        do{
            System.out.println("Menu");
            System.out.println("1) Agregar");
            System.out.println("2) Presentar");
            System.out.println("3) Ordenar");
            System.out.println("0) Salir");
            op=sc.nextInt();
        
            switch(op){
                case 1:
                    ac[pos]=new actividad("");
                    System.out.println("Ingrese Jornada");
                    ac[pos].setNombre_jornada(sc.next());
                    System.out.println("Ingrese Tarea");
                    ac[pos].setTarea(sc.next());
                    System.out.println("Ingrese Prioridad");
                    ac[pos].setPrioridad(sc.nextInt());
                    pos++;
                    break;
                case 2:
                    for(int i=0;i<pos;i++){
                        System.out.println("Jornada: "+ac[i].getNombre_jornada());
                        System.out.println("Tarea: "+ac[i].getTarea());
                        System.out.println("Prioridad: "+ac[i].getPrioridad());
                        System.out.println("===============================");
                    }
                    break;
                case 3:
                     for(int x=0;x<pos;x++){
                         for(int y=1;y<pos;y++){
                             if(ac[y-1].getPrioridad()>ac[y].getPrioridad()){
                                 temp.setNombre_jornada(ac[y-1].getNombre_jornada());
                                 temp.setTarea(ac[y-1].getTarea());
                                 temp.setPrioridad(ac[y-1].getPrioridad());
                                 
                                 
                                 ac[y-1].setNombre_jornada(ac[y].getNombre_jornada());
                                 ac[y-1].setTarea(ac[y].getTarea());
                                 ac[y-1].setPrioridad(ac[y].getPrioridad());
                                 
                                 ac[y].setNombre_jornada(temp.getNombre_jornada());
                                 ac[y].setTarea(temp.getTarea());
                                 ac[y].setPrioridad(temp.getPrioridad());                                                                                                   
                                 
                             }
                             
                         }
                     }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            
        }while(op!=0);
        
    }
    
}
