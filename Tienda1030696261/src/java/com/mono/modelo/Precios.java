
package com.mono.modelo;


import java.time.LocalDate;


public class Precios {
    private String cb;
    private LocalDate fechaini;
    private LocalDate fechafin;
    private Double precio;

    public Precios() {
    }

    public Precios(String cb, LocalDate fechaini, Double precio) {
        this.cb = cb;
        this.fechaini = fechaini;
        this.precio = precio;
    }

    public Precios(String cb, LocalDate fechaini, LocalDate fechafin, Double precio) {
        this.cb = cb;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.precio = precio;
    }

    public String getCb() {
        return cb;
    }

    public void setCb(String cb) {
        this.cb = cb;
    }

    public LocalDate getFechaini() {
        return fechaini;
    }

    public void setFechaini(LocalDate fechaini) {
        this.fechaini = fechaini;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Precios set cb='" + cb + "', fechaini='" + fechaini + "', fechafin='" + fechafin + "', precio='" + precio + "'";
    }
      
      
}
