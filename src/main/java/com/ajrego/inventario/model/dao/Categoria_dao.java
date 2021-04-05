
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.domain.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Categoria_dao {
    
    private Connection con;
    
    public Connection getConnection(){        
        return con;
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public boolean insert(Categoria categoria){
        
        String query = "INSERT INTO CATEGORIA (Categoria, Descripcion) VALUES (?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, categoria.getCategoria());
            ps.setString(2, categoria.getDescripcion());
            ps.execute();
            return true;         
            
        } catch (Exception e) {
            Logger.getLogger(Categoria_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
        
    }
    
    public boolean update(Categoria categoria){
        
        String query = "UPDATE CATEGORIA SET Categoria=?, Descripcion=? WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, categoria.getCategoria());
            ps.setString(2, categoria.getDescripcion());
            ps.setInt(3, categoria.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {           
            Logger.getLogger(Categoria_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
    }
    
    public boolean detele(Categoria categoria){
        
        String query = "DELETE FROM CATEGORIA WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, categoria.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Categoria_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }
    }
    
}
