/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_sql;

/**
 *
 * @author rober
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clase_sql {

 String url;
 Connection conector;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        
        this.url = "jdbc:sqlite:"+url;
    }
   
    public void conectar(){
        
         try {
             conector=DriverManager.getConnection(url);
             System.out.println("Conectado");
         // JOptionPane.showMessageDialog(null, "Conectado");
         } catch (SQLException ex) {
         //  Logger.getLogger(Clase_sql.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }         
    }
    public void desconectar(){
        try {
            conector.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    
    public void seleccionar(String sql, JTable tabla){
        ResultSet resul=null;
        DefaultTableModel model;
        model=(DefaultTableModel)tabla.getModel();
        model.setRowCount(0);
     try {
         PreparedStatement st=conector.prepareStatement(sql);
         resul=st.executeQuery();
         
         while(resul.next()){
             Object linea[]=new Object[tabla.getColumnCount()];
             for(int i=0;i<tabla.getColumnCount();i++){
                 linea[i]=resul.getString(i+1);
             }
             model.addRow(linea);
         }
         
         
     } catch (SQLException ex) {
         Logger.getLogger(Clase_sql.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
    }
    public void actoins(String sql){
        
       
     try {
          PreparedStatement st;
         st = conector.prepareStatement(sql);
         st.execute();
     } catch (SQLException ex) {
         Logger.getLogger(Clase_sql.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
    }
}
