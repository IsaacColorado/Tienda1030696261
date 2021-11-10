package com.mono.controlador.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CRUD {
    
     public static String DML(String sql, String msg) {
        
        
        Conexion conexion = new Conexion();
        try {
            Statement s = conexion.getConexion().createStatement();
            s.execute(sql);
            
        } catch (SQLException ex) {
            msg=ex.getMessage();
        }
        conexion.cerrar();

        return msg;
    }
    public static ResultSet select(String sql){
        ResultSet r=null;
        Conexion conexion = new Conexion();
        Statement s;
        try {
            s = conexion.getConexion().createStatement();
            r=s.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return r;
    }
    public static void insert(ArrayList<Object> o){
        String msg= "Se guardo los datos";
        
        System.err.println(gestionSQL(o));
        String m= DML("INSERT INTO" + gestionSQL(o), msg);
        Msg.msgDB(msg, m);
        
    }
    public static void update(ArrayList<Object> o, String where){
        String msg = "Se han actualizado los datos";
        String m= DML("UPDATE" + gestionSQL(o)+"WHERE "+where, msg);
        Msg.msgDB(msg, m);

    }

    private static String gestionSQL(ArrayList<Object> o) {
        String sql = o.toString();
        sql = sql.replace("[", "");
        sql = sql.replace("]", "");
        return sql;
    }
    
}
