/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecto_sql;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rober
 */
public class Conecto_sql {
    
    public  Conecto_sql(){
    
        URL="jdbc:sqlite:C:/data/escueladb.db";
    }
   public  Connection con;
    DefaultTableModel model;
    
    String URL;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = "jdbc:sqlite:"+URL;
    }
    
    public void Abrir(){
         try {           
            con =DriverManager.getConnection(URL);
                       
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }
    }
    
    public void Cerrar(){
          try {          
            con.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }
    }
    
    public ResultSet Seleccionar(String sql){
         ResultSet rs=null;
       // String sql="select cuenta,nombre,edad from alumnos";
        //model.setRowCount(0);
        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            rs=st.executeQuery();
            
          /*  while(rs.next()){
                
                model.addRow(new Object[]{rs.getString("cuenta"),rs.getString("nombre"),rs.getString("edad")});
                
            }*/
              
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }
      
      return rs;  
    }
     public void Seleccionar(String sql, JTable tabla){
           ResultSet rs=null;
      DefaultTableModel model=(DefaultTableModel)tabla.getModel();
      
       model.setRowCount(0);
        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            rs=st.executeQuery();
            
            while(rs.next()){
            Object d[]=new Object[tabla.getColumnCount()];
            for(int i=0;i<tabla.getColumnCount();i++){
                d[i]=rs.getString(i+1);
            }
            
                model.addRow(d);
                
            }
              
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }
      
         
     }
    
    public void actoins(String sql){       
        try {
            PreparedStatement st=con.prepareStatement(sql);
            st.execute();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage().toString());
        }
    }
}
