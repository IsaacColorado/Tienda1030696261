package com.mono.modelo;


public class Fotos {
    private int id;
    private String descripcion;
    private String foto;
    private String productoscb;

    public Fotos() {
    }

    public Fotos(int id, String descripcion, String foto, String productoscb) {
        this.id = id;
        this.descripcion = descripcion;
        this.foto = foto;
        this.productoscb = productoscb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getProductoscb() {
        return productoscb;
    }

    public void setProductoscb(String productoscb) {
        this.productoscb = productoscb;
    }

    @Override
    public String toString() {
        return "Fotos set id='" + id + ", descripcion=" + descripcion + ", foto=" + foto + ", productoscb=" + productoscb + '}';
    }
    
    
}
