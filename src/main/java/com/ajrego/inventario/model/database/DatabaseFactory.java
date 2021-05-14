package com.ajrego.inventario.model.database;

public class DatabaseFactory {

    public static Database getDatabase(String name) {
        if (name.equals("sqlite")) {
            return new DatabaseSQLite();
        }
        return null;
    }
}
