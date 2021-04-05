
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.domain.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factura_dao {
    
    private Connection con;
    
    public Connection getConnection(){        
        return con;
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public boolean insert(Factura factura){
        
        String query = "INSERT INTO FACTURA(Fecha, ClienteID, Total, Estado, QR) VALUES (?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, factura.getFecha().toString());
            ps.setInt(2, factura.getClienteID());
            ps.setDouble(3, factura.getTotal());
            ps.setString(4, factura.getEstado());
            ps.setString(5, factura.getQR());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Factura_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean update(Factura factura){
        
        String query = "UPDATE FACTURA SET Fecha=?, ClienteID=?, Total=?, Estado=?, QR=? WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, factura.getFecha().toString());
            ps.setInt(2, factura.getClienteID());
            ps.setDouble(3, factura.getTotal());
            ps.setString(4, factura.getEstado());
            ps.setString(5, factura.getQR());
            ps.setInt(6, factura.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Factura_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
    }
     
    public boolean delete(Factura factura){
        
        String query = "DELETE FROM FACTURA WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, factura.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(Factura_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
    }
    
}
