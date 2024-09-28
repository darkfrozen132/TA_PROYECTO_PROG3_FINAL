/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Paquete;
import pe.edu.pucp.TemuFans.Inventario.dao.PaqueteDAO;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class PaqueteDAOImpl extends DAOImpl implements PaqueteDAO{
    private Paquete paquete;

    public PaqueteDAOImpl() {
        super("Paquete");
        this.paquete = null;
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idPaquete, idProducto, cantidadProductos, peso";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql = sql.concat(this.paquete.getIdPaquete().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.paquete.getIdProducto().toString()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.paquete.getCantidadProductos().toString()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.paquete.getPeso().toString()+ "'");
        return sql;
    }

    @Override
    public Integer insertar(Paquete paquete) {
        this.paquete = paquete;
        return insertar();
    }

    @Override
    public Integer modificar(Paquete paquete) {
        this.paquete = paquete;
        return modificar();
    }

    @Override
    public Integer eliminar(Paquete paquete) {
        this.paquete = paquete;
        return eliminar();
    }

    @Override
    public ArrayList<Paquete> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql = sql.concat("idMarca = " + this.paquete.getIdPaquete().toString());
        sql = sql.concat(", ");
        sql = sql.concat("nombre = '" + this.paquete.getIdProducto().toString()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("descripcion = '" + this.paquete.getCantidadProductos().toString()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("descripcion = '" + this.paquete.getPeso().toString()+ "'");        
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "idPaquete="+paquete.getIdPaquete().toString();
    }
}
