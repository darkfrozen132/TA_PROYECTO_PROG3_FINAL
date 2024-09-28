/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Marca;
import pe.edu.pucp.TemuFans.Inventario.dao.MarcaDAO;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class MarcaDAOImpl extends DAOImpl implements MarcaDAO{
    private Marca marca;

    public MarcaDAOImpl() {
        super("Marca");
        this.marca = null;
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idMarca, nombre, descripcion";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql = sql.concat(this.marca.getIdMarca().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.marca.getNombre()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.marca.getDescripcion()+ "'");
        return sql;
    }

    @Override
    public Integer insertar(Marca marca) {
        this.marca = marca;
        return insertar();
    }

    @Override
    public Integer modificar(Marca marca) {
        this.marca = marca;
        return modificar();
    }

    @Override
    public Integer eliminar(Marca marca) {
        this.marca = marca;
        return eliminar();
    }

    @Override
    public ArrayList<Marca> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql = sql.concat("idMarca = " + this.marca.getIdMarca().toString());
        sql = sql.concat(", ");
        sql = sql.concat("nombre = '" + this.marca.getNombre()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("descripcion = '" + this.marca.getDescripcion()+ "'");        
        return sql;

    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "idMarca="+marca.getIdMarca().toString(); 
    }
}
