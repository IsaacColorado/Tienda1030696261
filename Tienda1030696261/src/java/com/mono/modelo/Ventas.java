
package com.mono.modelo;


public class Ventas {
    private int numerof;
    private String cb;
    private int cantidad;

    public Ventas() {
    }

    public Ventas(int numerof, String cb, int cantidad) {
        this.numerof = numerof;
        this.cb = cb;
        this.cantidad = cantidad;
    }

    public int getNumerof() {
        return numerof;
    }

    public void setNumerof(int numerof) {
        this.numerof = numerof;
    }

    public String getCb() {
        return cb;
    }

    public void setCb(String cb) {
        this.cb = cb;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ventas set numerof='" + numerof + "', cb='" + cb + "', cantidad='" + cantidad + "'";
    }

    
}
