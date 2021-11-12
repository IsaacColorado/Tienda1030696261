package com.mono.controlador;



import com.mono.controlador.util.CRUD;
import com.mono.controlador.util.Msg;
import com.mono.modelo.Productos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ProductosC extends Productos {
    private List<Productos> productos;
            
    @PostConstruct
    public void init(){
        llenarTable();
    }
    public void llenarTable(){
        productos=new ArrayList<>();
        String sql = "SELECT * FROM Productos";
        
        ResultSet r = CRUD.select(sql);
        try {
            while (r.next()) {
                Productos p=new Productos(r.getString(1), r.getString(2), r.getString(3));
                productos.add(p);
            }
        } catch (SQLException ex) {
            Msg.error(ex.getMessage());
        }
    }
    
    public void consultarPrimaria(){
        String sql = "SELECT * FROM Productos WHERE cb='" + getCb() + "'";
        System.err.println(sql);
        ResultSet r = CRUD.select(sql);
        try {
            if (r.next()) {
                setCb(r.getString(1));
                setNombre(r.getString(2));
                setDescripcion(r.getString(3));
            }else{
                Msg.ad("La factura no se encuentra registrado.");
            }
        } catch (SQLException ex) {
            Msg.error(ex.getMessage());
        }
    }
    
    public void eliminar(){
        String sql="DELETE FROM productos WHERE cb='"+getCb()+"'";
        String m="Se ha eliminado el producto";
        Msg.msgDB(m ,CRUD.DML(sql, m));
    }
    
     public void insertar(){
        CRUD.insert(crea0());
        llenarTable();
    }
    public void actualizar(){
        CRUD.update(crea0(), "cb='"+getCb()+"'");
        llenarTable();
    }

    private ArrayList<Object> crea0() {
        ArrayList<Object> o =new ArrayList<>();
        return o; 
    }
    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
}

    
   
    
    
    
