
package com.ajrego.inventario.model.dao;

import com.ajrego.inventario.model.database.DatabaseSQLite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DetalleFactura_dao {
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    DatabaseSQLite connection = new DatabaseSQLite(); 
    
}
