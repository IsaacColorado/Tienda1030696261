
package com.mono.modelo;

public class Empleados {
    private String clave;
    private int documento;

    public Empleados() {
    }

    public Empleados(String clave, int documento) {
        this.clave = clave;
        this.documento = documento;
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
        return "Empleados{" + "clave=" + clave + ", documento=" + documento + '}';
    }

    
    
}
