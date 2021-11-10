package com.mono.controlador;

import com.mono.controlador.util.CRUD;
import com.mono.controlador.util.Msg;
import com.mono.modelo.Personas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
        
public class PersonasC extends Personas {
    public void consultarPrimaria(){
        String sql="SELECT * FROM personas WHERE documento='"+getDocumento()+"'";
        System.err.println(sql);
        ResultSet r=CRUD.select(sql);
        try {
            if (r.next()) {
                setPnombre(r.getString(2));
                setSnombre(r.getString(3));
                setPapellido(r.getString(4));
                setSapellido(r.getString(5));
                setEmail(r.getString(6));
                
                
            }else{
                Msg.ad("El useario no se encuentra registrado");
            }
        } catch (SQLException ex) {
            Msg.error(ex.getMessage());
        }
    }
    
    public void eliminar(){
        String sql="DELETE FROM personas WHERE documento='"+getDocumento()+"'";
        String m="Se ha eliminado la persona";
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
