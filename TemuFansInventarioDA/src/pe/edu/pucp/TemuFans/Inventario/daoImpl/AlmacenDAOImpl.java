/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.dao.AlmacenDAO;
import pe.edu.pucp.TemuFans.Inventario.model.Almacen;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class AlmacenDAOImpl extends DAOImpl implements AlmacenDAO{
    private Almacen almacen;

    public AlmacenDAOImpl() {
        super("Almacen");
        this.almacen = null;
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idAlmacen, direccion, cantidadTorres";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql = sql.concat(this.almacen.getIdAlmacen().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.almacen.getDireccion()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.almacen.getCantidadTorres().toString()+ "'");
        return sql;
    }

    @Override
    public Integer insertar(Almacen almacen) {
        this.almacen = almacen;
        return insertar();
    }

    @Override
    public Integer modificar(Almacen almacen) {
        this.almacen = almacen;
        return modificar();
    }

    @Override
    public Integer eliminar(Almacen almacen) {
        this.almacen = almacen;
        return eliminar();
    }

    @Override
    public ArrayList<Almacen> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql = sql.concat("idAlmacen = " + this.almacen.getIdAlmacen().toString());
        sql = sql.concat(", ");
        sql = sql.concat("direccion = '" + this.almacen.getDireccion()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("cantidadTorres = '" + this.almacen.getCantidadTorres().toString()+ "'");        
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "idTorre="+almacen.getIdAlmacen().toString();
    }
}
