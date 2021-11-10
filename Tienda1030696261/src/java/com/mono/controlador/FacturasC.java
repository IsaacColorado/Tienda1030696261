
package com.mono.controlador;

import com.mono.controlador.util.CRUD;
import com.mono.controlador.util.Msg;
import com.mono.modelo.Facturas;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FacturasC extends Facturas {
    public void consultarPrimaria(){}
    
    public void eliminar(){
        String sql="DELETE FROM facturas WHERE numero='"+getNumero()+"'";
        String m="Se ha eliminado la factura";
        Msg.msgDB(m ,CRUD.DML(sql, m));
    }
    
    public void insertar(){
        CRUD.insert(crea0());
    }
    public void actualizar(){
        CRUD.update(crea0(), "numero='"+getNumero()+"'");
    }

    private ArrayList<Object> crea0() {
        ArrayList<Object> o =new ArrayList<>();
        return o; 
    }
}
