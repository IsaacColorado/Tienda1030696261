package com.mono.controlador;



import com.mono.controlador.util.CRUD;
import com.mono.controlador.util.Msg;
import com.mono.modelo.Productos;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ProductosC extends Productos {
    public void consultarPrimaria(){}
    
    public void eliminar(){
        String sql="DELETE FROM productos WHERE cb='"+getCb()+"'";
        String m="Se ha eliminado el producto";
        Msg.msgDB(m ,CRUD.DML(sql, m));
    }
    
     public void insertar(){
        CRUD.insert(crea0());
    }
    public void actualizar(){
        CRUD.update(crea0(), "cb='"+getCb()+"'");
    }

    private ArrayList<Object> crea0() {
        ArrayList<Object> o =new ArrayList<>();
        return o; 
    }
    }

    
   
    
    
    
