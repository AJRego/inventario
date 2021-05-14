package com.ajrego.inventario.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseSQLite implements Database {

    private Connection connection;

    @Override
    public Connection connect(String database) {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + database);
        } catch (SQLException se) {
            Logger.getLogger(DatabaseSQLite.class.getName()).log(Level.SEVERE, null, se);
        }
        return connection;
    }

    @Override
    public void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException se) {
            Logger.getLogger(DatabaseSQLite.class.getName()).log(Level.SEVERE, null, se);
        }
    }

}
