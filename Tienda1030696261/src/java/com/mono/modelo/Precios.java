
package com.mono.modelo;


import java.util.Date;


public class Precios {
    private String cb;
    private Date fechaini;
    private Date fechafin;
    private Double precio;

    public Precios() {
    }

    public Precios(String cb, Date fechaini, Double precio) {
        this.cb = cb;
        this.fechaini = fechaini;
        this.precio = precio;
    }

    public Precios(String cb, Date fechaini, Date fechafin, Double precio) {
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

    public Date getFechaini() {
        return fechaini;
    }

    public void setFechaini(Date fechaini) {
        this.fechaini = fechaini;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
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
        return "Precios{" + "cb=" + cb + ", fechaini=" + fechaini + ", fechafin=" + fechafin + ", precio=" + precio + '}';
    }
      
      
}
