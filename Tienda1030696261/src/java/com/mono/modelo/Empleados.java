
package com.mono.modelo;

public class Empleados {
    private int documento;
    private String clave;
    

    public Empleados() {
    }

    public Empleados(int documento, String clave) {
        this.documento = documento;
        this.clave = clave;
        
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Empleados set documento='" + documento + "', clave='" + clave + "'";
    }

    
    
}
