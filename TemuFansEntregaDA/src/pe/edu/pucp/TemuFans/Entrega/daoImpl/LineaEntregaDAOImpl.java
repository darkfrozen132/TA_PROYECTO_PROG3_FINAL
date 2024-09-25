/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Entrega.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Entrega.dao.LineaEntregaDAO;
import pe.edu.pucp.TemuFans.Entrega.model.LineaEntrega;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */

public class LineaEntregaDAOImpl extends DAOImpl implements LineaEntregaDAO{
    private LineaEntrega lineaEntrega;

    
    public LineaEntregaDAOImpl() {
        super("LineaEntrega");  
    }

    
    @Override
    public Integer insertar(LineaEntrega lineaEntrega) {
        this.lineaEntrega = lineaEntrega;
        return insertar(); 
    }

   
    @Override
    public Integer modificar(LineaEntrega lineaEntrega) {
        this.lineaEntrega = lineaEntrega;
        return modificar();  
    }

    
    @Override
    public Integer eliminar(LineaEntrega lineaEntrega) {
        this.lineaEntrega = lineaEntrega;
        return eliminar();  
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        
        return "idPaquete, idTorre";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        
        String sql = "";
        sql = sql.concat(this.lineaEntrega.getPaquete().getIdPaquete()); 
        sql = sql.concat(", ");
        sql = sql.concat(this.lineaEntrega.getTorre().getIdTorre());  
        return sql;
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
       
        String sql = "";
        sql = sql.concat("idPaquete = " + this.lineaEntrega.getPaquete().getIdPaquete());
        sql = sql.concat(", ");
        sql = sql.concat("idTorre = " + this.lineaEntrega.getTorre().getIdTorre());
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        
        return "idPaquete = " + this.lineaEntrega.getPaquete().getIdPaquete() + " AND idTorre = " + this.lineaEntrega.getTorre().getIdTorre();
    }

    @Override
    public ArrayList<LineaEntrega> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
