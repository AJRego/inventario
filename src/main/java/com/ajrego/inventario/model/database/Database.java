package com.ajrego.inventario.model.database;

import java.sql.Connection;

public interface Database {

    public Connection connect(String database);

    public void close(Connection connection);
}
