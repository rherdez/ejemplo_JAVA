/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rober
 */
public class Ejemplo_texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int op;
        Scanner sc=new Scanner (System.in);
        do{
            System.out.println("1) Leer Archivo");
            System.out.println("2) scribir Archivo");
            op=sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Leer");
                    File archivo= new File ("c:/texto/prueba.txt");
                    FileReader fr=new FileReader (archivo);
                    BufferedReader br=new BufferedReader(fr);

                    String linea;
                {
                    try {
                        while((linea=br.readLine())!=null)
                            System.out.println(linea);
                        
                        fr.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Ejemplo_texto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                 break;
                case 2:
                     FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/texto/prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
        
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
                    
            }
            
        }while(op!=0);
    }
    
}
