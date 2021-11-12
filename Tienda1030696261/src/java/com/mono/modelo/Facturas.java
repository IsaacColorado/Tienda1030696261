package com.mono.modelo;

import java.time.LocalDateTime;

public class Facturas {
    private int numero;
    private LocalDateTime fecha;
    private int personasdocumento;
    private int empleadodocumento;

    public Facturas() {
    }

    public Facturas(int numero, LocalDateTime fecha, int personasdocumento) {
        this.numero = numero;
        this.fecha = fecha;
        this.personasdocumento = personasdocumento;
    }

    public Facturas(int numero, LocalDateTime fecha, int personasdocumento, int empleadodocumento) {
        this.numero = numero;
        this.fecha = fecha;
        this.personasdocumento = personasdocumento;
        this.empleadodocumento = empleadodocumento;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getPersonasdocumento() {
        return personasdocumento;
    }

    public void setPersonasdocumento(int personasdocumento) {
        this.personasdocumento = personasdocumento;
    }

    public int getEmpleadodocumento() {
        return empleadodocumento;
    }

    public void setEmpleadodocumento(int empleadodocumento) {
        this.empleadodocumento = empleadodocumento;
    }

    @Override
     public String toString() {
        return "Facturas set numero='" + numero + "', fecha='" + fecha + "', personasdocumento='" + personasdocumento + "', empleadodocumento='" + empleadodocumento + "'";
    }

    
    
    
}
