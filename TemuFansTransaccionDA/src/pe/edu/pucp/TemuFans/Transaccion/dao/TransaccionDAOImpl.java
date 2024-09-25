/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Transaccion.dao;

import java.util.ArrayList;
import pe.du.pucp.TemuFans.Transaccion.daoImpl.TransaccionDAO;
import pe.edu.pucp.TemuFans.Transaccion.model.Transaccion;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/**
 *
 * @author Leoncio
 */

public class TransaccionDAOImpl extends DAOImpl implements TransaccionDAO{
     private Transaccion transaccion;
    
    public TransaccionDAOImpl() {
        super("Transaccion");
        this.transaccion = null;
    }
    @Override
    protected  String obtenerListaDeAtributosParaInsert(){
        return "idTransaccion, idCBancaria_Empresa, idCBancaria_Contraria, idPedidoCompra, " +
           "idPedidoVenta, fecha_emision, subtotal, impuesto, total, tipo";
    }
    @Override
protected String obtenerListaDeValoresParaInsert() {
    String sql = "";
    sql = sql.concat(this.transaccion.getId_transaccion().toString());
    sql = sql.concat(", ");
    sql = sql.concat("'"+this.transaccion.getIdCBancaria_Empresa().toString());
    sql = sql.concat(", ");
    sql = sql.concat("'"+this.transaccion.getIdCBancaria_Contraria().toString());
    sql = sql.concat(", ");
    sql = sql.concat("'"+this.transaccion.getIdPedidoCompra().toString());
    sql = sql.concat(", ");
    sql = sql.concat("'"+this.transaccion.getIdPedidoVenta().toString());
    sql = sql.concat(", ");
    sql = sql.concat("'" + this.transaccion.getFecha_emision().toString() );
    sql = sql.concat(", ");
     sql = sql.concat(String.valueOf(this.transaccion.getSubtotal()));
    sql = sql.concat(", ");
      sql = sql.concat(String.valueOf(this.transaccion.getImpuestos())); 
    sql = sql.concat(", ");
        sql = sql.concat(String.valueOf(this.transaccion.getTotal()));
    sql = sql.concat(", ");
    sql = sql.concat("'" + this.transaccion.getTipoTransaccion() + "'"); // Asumimos que tipo es un ENUM o cadena

    return sql;
}
    @Override
   
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";

        // Actualizar los valores de la tabla transaccion
        sql = sql.concat("idCBancaria_Empresa = " + this.transaccion.getIdCBancaria_Empresa().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idCBancaria_Contraria = " + this.transaccion.getIdCBancaria_Contraria().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idPedidoCompra = " + this.transaccion.getIdPedidoCompra().toString());
        sql = sql.concat(", ");
        sql = sql.concat("idPedidoVenta = " + this.transaccion.getIdPedidoVenta().toString());
        sql = sql.concat(", ");
        sql = sql.concat("fecha_emision = '" + this.transaccion.getFecha_emision().toString() + "'");
        sql = sql.concat(", ");
        sql = sql.concat("subtotal = " + String.valueOf(this.transaccion.getSubtotal()));
        sql = sql.concat(", ");
        sql = sql.concat("impuesto = " + String.valueOf(this.transaccion.getImpuestos()));
        sql = sql.concat(", ");
        sql = sql.concat("total = " + String.valueOf(this.transaccion.getTotal()));
        sql = sql.concat(", ");
        sql = sql.concat("tipo = '" + this.transaccion.getTipoTransaccion() + "'");

        return sql;
    }

    @Override
    public Integer insertar(Transaccion transaccion) {
        this.transaccion=transaccion;
        return this.insertar();
    }

    @Override
    public Integer modificar(Transaccion transaccion) {
        this.transaccion=transaccion;
        return this.modificar();
    }

    @Override
    public Integer eliminar(Transaccion transaccion) {
        this.transaccion=transaccion;
        return this.eliminar();
    }    
    @Override
    protected String obtenerCondicionWhereId(){
        return "idCliente="+transaccion.getId_transaccion().toString(); 
    }

    @Override
    public ArrayList<Transaccion> listartodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
}

