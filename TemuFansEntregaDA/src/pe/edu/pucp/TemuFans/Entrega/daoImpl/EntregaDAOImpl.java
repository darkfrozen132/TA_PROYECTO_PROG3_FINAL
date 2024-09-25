/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Entrega.daoImpl;

import pe.edu.pucp.TemuFans.Entrega.dao.EntregaDAO;
import pe.edu.pucp.TemuFans.db.DAOImpl;


import pe.edu.pucp.TemuFans.Entrega.model.Entrega;

import java.util.ArrayList;

public class EntregaDAOImpl extends DAOImpl implements EntregaDAO{

    private Entrega entrega;

    
    public EntregaDAOImpl() {
        super("Entrega");  
    }

    
    @Override
    public Integer insertar(Entrega entrega) {
        this.entrega = entrega;
        return insertar();  
    }

    
    @Override
    public Integer modificar(Entrega entrega) {
        this.entrega = entrega;
        return modificar();  
    }

    
    @Override
    public Integer eliminar(Entrega entrega) {
        this.entrega = entrega;
        return eliminar();  
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
      
        return "idPedido, fechaEntrega";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        
        String sql = "";
        sql = sql.concat(this.entrega.getPedido().getIdPedido().toString()); 
        sql = sql.concat(", ");
        sql = sql.concat("'").concat(this.entrega.getFechaEntrega().toString()).concat("'");  
        return sql;
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        
        String sql = "";
        sql = sql.concat("fechaEntrega = '").concat(this.entrega.getFechaEntrega().toString()).concat("'");
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
       
        return "idPedido = " + this.entrega.getPedido().getIdPedido();
    }

    @Override
    public ArrayList<Entrega> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
