
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.domain.DetalleFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleFactura_dao {
    
    private Connection con;
    
    public Connection getConnection(){        
        return con;
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public boolean insert(DetalleFactura Dfactura){
        
        String query = "INSERT INTO DETALLE_FACTURA(ProductoID, FacturaID, Cantidad) VALUES (?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, Dfactura.getProductoID());
            ps.setInt(2, Dfactura.getFacturaID());
            ps.setInt(3, Dfactura.getCantidad());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(DetalleFactura_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean update(DetalleFactura Dfactura){
        
        String query = "UPDATE DETALLE_FACTURA SET ProductoID=?, FActuraID=?, Cantidad=? WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, Dfactura.getProductoID());
            ps.setInt(2, Dfactura.getFacturaID());
            ps.setInt(3, Dfactura.getCantidad());
            ps.setInt(4, Dfactura.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(DetalleFactura_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
    }
     
    public boolean delete(DetalleFactura Dfactura){
        
        String query = "DELETE FROM DETALLE_FACTURA WHERE ID=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, Dfactura.getID());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            Logger.getLogger(DetalleFactura_dao.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        
    }
    
}
