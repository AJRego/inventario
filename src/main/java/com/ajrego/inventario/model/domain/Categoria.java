package com.ajrego.inventario.model.domain;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Categoria {
    private final IntegerProperty ID;
    private final StringProperty Categoria;
    private final StringProperty Descripcion;
    
    public Categoria(){
        this.ID = new SimpleIntegerProperty();
        this.Categoria = new SimpleStringProperty();
        this.Descripcion = new SimpleStringProperty();
    }
    
    public Categoria(int ID, String Categoria, String Descripcion){
        this.ID = new SimpleIntegerProperty(ID);
        this.Categoria = new SimpleStringProperty(Categoria);
        this.Descripcion = new SimpleStringProperty(Descripcion);
    }
    
    public int getID(){
        return ID.get();
    }
    
    public void setID(int ID){
        this.ID.set(ID);
    }
    
    public IntegerProperty IDProperty(){
        return ID;
    }
    
    public String getCategoria(){
        return Categoria.get();
    }
    
    public void setCategoria(String Categoria){
        this.Categoria.set(Categoria);
    }
    
    public StringProperty CategoriaProperty(){
        return Categoria;
    }
    
    public String getDescripcion(){
        return Descripcion.get();
    }
    
    public void setDescripcion(String Descripcion){
        this.Descripcion.set(Descripcion);
    }
    
    public StringProperty DescripcionProperty(){
        return Descripcion;
    }
}
