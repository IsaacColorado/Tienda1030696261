
package com.mono.controlador;

import com.mono.controlador.util.CRUD;
import com.mono.controlador.util.Msg;
import com.mono.modelo.Precios;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PreciosC extends Precios {
    
    @PostConstruct
    public void init(){
        setFechafin(new Date());
        setFechaini(new Date());
        
        
     
    }
    
    public void consultarPrimaria(){}
    
    public void eliminar(){
        String sql="DELETE FROM precios WHERE cb='"+getCb()+"' and fechaini='"+getFechaini()+"'";
        String m="Se ha eliminado el precio";
        Msg.msgDB(m ,CRUD.DML(sql, m));
    }
     public void insertar(){
         System.err.println(getFechafin());
        CRUD.insert(crea0());
    }
    public void actualizar(){
        CRUD.update(crea0(), "cb='"+getCb()+"' and fechaini='"+getFechaini()+"'");
    }

    private ArrayList<Object> crea0() {
        ArrayList<Object> o =new ArrayList<>();
        return o; 
    } 
}
