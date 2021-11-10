
package com.mono.controlador;

import com.mono.controlador.util.CRUD;
import com.mono.controlador.util.Msg;
import com.mono.modelo.Ventas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class VentasC extends Ventas{
    List<Ventas> ventas;
    
    @PostConstruct
    public void init(){
        ventas=new ArrayList<>();
        String sql ="SELECT * FROM ventas";
        
        ResultSet    r = CRUD.select(sql);
        try {
            while (r.next()){
                
            }
        }catch (SQLException ex){
            Msg.error(ex.getMessage());
        }
    }
    
    public void consultarPrimaria(){}
    
    public void eliminar(){
        String sql="DELETE FROM ventas WHERE numerof='"+getNumerof()+"'and cb='"+getCb()+"'";
        String m="Se ha eliminado la venta";
        Msg.msgDB(m ,CRUD.DML(sql, m));
    }
    
     public void insertar(){
        CRUD.insert(crea0());
    }
    public void actualizar(){
        CRUD.update(crea0(), "numerof='"+getNumerof()+"'and cb='"+getCb()+"'");
    }

    private ArrayList<Object> crea0() {
        ArrayList<Object> o =new ArrayList<>();
        return o; 
    }
}
