/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Producto;
import pe.edu.pucp.TemuFans.Inventario.dao.ProductoDAO;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author usuario
 */
public class ProductoDAOImpl extends DAOImpl implements ProductoDAO{
    private Producto producto;

    public ProductoDAOImpl() {
        super("Producto");
        this.producto = null;
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idProducto, idMarca, SKU, nombre, precioUnitario, tipo, estadoProducto";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql = sql.concat(this.producto.getIdProducto().toString());
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.producto.getIdMarca().toString()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.producto.getSKU()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.producto.getNombre()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.producto.getPrecioUnitario().toString()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.producto.getTipo()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("'" + this.producto.getEstadoProducto().toString()+ "'");
        return sql;
    }

    @Override
    public Integer insertar(Producto producto) {
        this.producto = producto;
        return insertar();
    }

    @Override
    public Integer modificar(Producto producto) {
        this.producto = producto;
        return modificar();
    }

    @Override
    public Integer eliminar(Producto producto) {
        this.producto = producto;
        return eliminar();
    }

    @Override
    public ArrayList<Producto> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql = sql.concat("idProducto = " + this.producto.getIdProducto().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idMarca = '" + this.producto.getIdMarca()+ "'");
        sql = sql.concat(", ");
        sql = sql.concat("SKU = '" + this.producto.getSKU()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("nombre = '" + this.producto.getNombre()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("precioUnitario = '" + this.producto.getPrecioUnitario().toString()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("tipo = '" + this.producto.getTipo()+ "'");        
        sql = sql.concat(", ");
        sql = sql.concat("estadoProducto = '" + this.producto.getEstadoProducto().toString()+ "'");        
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "idProducto="+producto.getIdProducto().toString();
    }
}
