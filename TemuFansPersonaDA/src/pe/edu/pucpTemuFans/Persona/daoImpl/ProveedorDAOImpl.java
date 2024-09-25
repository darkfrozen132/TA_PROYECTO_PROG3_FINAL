/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucpTemuFans.Persona.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Persona.dao.ProveedorDAO;
import pe.edu.pucp.TemuFans.Persona.model.Proveedor;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class ProveedorDAOImpl extends DAOImpl implements ProveedorDAO{
    private Proveedor proveedor;

    public ProveedorDAOImpl() {
        super("Proveedor");
        this.proveedor = null;
    }

    @Override
    protected  String obtenerListaDeAtributosParaInsert(){
        return "idProveedor,idUsuario,fecha_registro";
    }
    @Override
    protected  String obtenerListaDeValoresParaInsert(){
        String sql = "";
        sql = sql.concat(this.proveedor.getIdProveedor().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.proveedor.getIdUsuario() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.proveedor.getFecha_registro().toString()+ "'");        
        return sql;
    }
    @Override
    protected  String obtenerListaDeAtributosYValoresParaUpdate(){
        String sql = "";
        sql = sql.concat("idProveedor = " + this.proveedor.getIdProveedor().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idUsuario = '" + this.proveedor.getIdUsuario().toString() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("fecha_registro = '" + this.proveedor.getFecha_registro().toString() + "'");        
        return sql;
    }

    @Override
    public Integer insertar(Proveedor proveedor) {
        this.proveedor=proveedor;
        return this.insertar();
    }

    @Override
    public Integer modificar(Proveedor proveedor) {
        this.proveedor=proveedor;
        return this.modificar();
    }

    @Override
    public Integer eliminar(Proveedor proveedor) {
        this.proveedor=proveedor;
        return this.eliminar();
    }

    @Override
    public ArrayList<Proveedor> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    protected String obtenerCondicionWhereId(){
        return "idProveedor="+proveedor.getIdProveedor().toString(); 
    }
}
