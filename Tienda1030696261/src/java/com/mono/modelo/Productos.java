package com.mono.modelo;

public class Productos {
    private String cb;
    private String nombre;
    private String descripcion;
    
    public Productos(){}

    public Productos(String cb, String nombre) {
        this.cb = cb;
        this.nombre = nombre;
    }

    public Productos(String cb, String nombre, String descripcion) {
        this.cb = cb;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCb() {
        return cb;
    }

    public void setCb(String cb) {
        this.cb = cb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Productos{" + "cb=" + cb + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
   
}
