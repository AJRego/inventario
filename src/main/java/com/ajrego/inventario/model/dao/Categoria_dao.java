
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.database.DatabaseSQLite;
import com.ajrego.inventario.model.domain.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Categoria_dao {
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    DatabaseSQLite connection = new DatabaseSQLite();
    
    public boolean insert(Categoria categoria){
        
        String query = "INSERT INTO CATEGORIA (ID, Categoria, Descripcion) VALUES (?,?,?)";
        
        try {
            
            ps = (PreparedStatement) connection.connect(query);
            ps.setInt(1, categoria.getID());
            ps.setString(2, categoria.getCategoria());
            ps.setString(3, categoria.getDescripcion());
            ps.execute();
            return true;         
            
        } catch (Exception e) {
            Logger.getLogger(Categoria_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }finally{
            connection.close((Connection) connection);
        }
        
    }
    
    public boolean update(Categoria categoria){
        
        String query = "UPDATE CATEGORIA SET Categoria=?, Descripcion=? WHERE ID=?";
        
        try {
            
            ps = (PreparedStatement) connection.connect(query);
            ps.setString(1, categoria.getCategoria());
            ps.setString(2, categoria.getDescripcion());
            ps.setInt(3, categoria.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {           
            Logger.getLogger(Categoria_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }finally{            
            connection.close((Connection) connection);
        }
    }
    
    public boolean detele(Categoria categoria){
        
        String query = "DELETE FROM CATEGORIA WHERE ID=?";
        
        try {
            
            ps = (PreparedStatement) connection.connect(query);
            ps.setInt(1, categoria.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Categoria_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
            
        }finally{
            connection.close((Connection) connection);
        }
    }
    
}
