/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Torre;
import pe.edu.pucp.TemuFans.Inventario.dao.TorreDAO;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class TorreDAOImpl extends DAOImpl implements TorreDAO{
    private Torre torre;

    public TorreDAOImpl() {
        super("Torre");
        this.torre = null;
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idAlmacen, nroTorre, pesoMaximo";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql = sql.concat(this.torre.getIdAlmacen().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.torre.getNroTorre().toString()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.torre.getPesomaximo().toString()+ "'");
        return sql;
    }

    @Override
    public Integer insertar(Torre torre) {
        this.torre = torre;
        return insertar();
    }

    @Override
    public Integer modificar(Torre torre) {
        this.torre = torre;
        return modificar();
    }

    @Override
    public Integer eliminar(Torre torre) {
        this.torre = torre;
        return eliminar();
    }

    @Override
    public ArrayList<Torre> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql = sql.concat("idAlmacen = " + this.torre.getIdAlmacen().toString());
        sql = sql.concat(", ");
        sql = sql.concat("nroTorre = '" + this.torre.getNroTorre().toString()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("pesoMaximo = '" + this.torre.getPesomaximo().toString()+ "'");        
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "nroTorre="+torre.getNroTorre().toString();
    }
}
