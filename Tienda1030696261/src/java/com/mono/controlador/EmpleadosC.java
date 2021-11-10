
package com.mono.controlador;

import com.mono.controlador.util.CRUD;
import com.mono.controlador.util.Msg;
import com.mono.modelo.Empleados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class EmpleadosC extends Empleados {
    public void consultarPrimaria(){
        String sql="SELECT * FROM empleados WHEREdocumento='"+getDocumento()+"'";
        ResultSet r= CRUD.select(sql);
        try {
            if(r.next()){
                setClave(r.getString(2));

                
            }else{
               Msg.ad("El empleado no está registrado");
            }
        } catch (SQLException ex) {
            Msg.error(ex.getMessage());
        }
    }    
        
    public void eliminar(){
        String sql="DELETE FROM empleados WHERE documento='"+getDocumento()+"'";
        String m="Se ha eliminado el empleado";
        Msg.msgDB(m ,CRUD.DML(sql, m));
    }
    
    public void insertar(){
        CRUD.insert(crea0());
    }
    public void actualizar(){
        CRUD.update(crea0(), "documento='"+getDocumento()+"'");
    }

    private ArrayList<Object> crea0() {
        ArrayList<Object> o =new ArrayList<>();
        return o; 
    }
}
