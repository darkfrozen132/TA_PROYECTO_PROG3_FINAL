/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.TemuFans.Pedido.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Pedido.model.PedidoCompra;
import pe.edu.pucp.TemuFans.db.DAOImpl;
import pe.edu.pucp.TemuFans.Pedido.dao.PedidoCompraDAO;

/*
 *
 * @author Alvaro P.
 *
 */
public class PedidoCompraDAOImpl extends DAOImpl implements PedidoCompraDAO {
    
    private PedidoCompra pedidoCompra;
    
    public PedidoCompraDAOImpl() {
        super("Pedido_Compra");
        this.pedidoCompra = null;
    }

    @Override
    public Integer insertar(PedidoCompra pedidoCompra) {
        this.pedidoCompra=pedidoCompra;
        return this.insertar();
    }

    @Override
    public Integer modificar(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
        return this.modificar();
    }

    @Override
    public Integer eliminar(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
        return this.eliminar();
    }

    @Override
    public ArrayList<PedidoCompra> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idPedidoCompra, idTransaccion, idProveedor, idEmpleado, estado, "
                + "fechaCreacion, fechaCancelacion, fechaPago, subtotal, impuesto, total";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql += pedidoCompra.getIdPedido().toString() + ", "
                + pedidoCompra.getIdTransaccion().toString() + ", "
                + pedidoCompra.getIdProveedor().toString() + ", "
                + pedidoCompra.getIdEmpleado().toString() + ", "
                + pedidoCompra.getEstadoPedido().toString() + ", "
                + pedidoCompra.getFechaCreacion().toString() + ", "
                + pedidoCompra.getFechaCancelacion().toString() + ", "
                + pedidoCompra.getFechaDePago().toString() + ", "
                + pedidoCompra.getSubtotal().toString() + ", "
                + pedidoCompra.getImpuesto() + ", "
                + pedidoCompra.getTotal();
        
        return sql;
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql += "idPedidoCompra = " + pedidoCompra.getIdPedido().toString() + ", "
                + "idTransaccion = " + pedidoCompra.getIdTransaccion().toString() + ", "
                + "idProveedor = " + pedidoCompra.getIdProveedor().toString() + ", "
                + "idEmpleado = " + pedidoCompra.getIdEmpleado().toString() + ", "
                + "estado = " + pedidoCompra.getEstadoPedido().toString() + ", "
                + "fechaCreacion = " + pedidoCompra.getFechaCreacion().toString() + ", "
                + "fechaCancelacion = " + pedidoCompra.getFechaCancelacion().toString() + ", "
                + "fechaPago = " + pedidoCompra.getFechaDePago().toString() + ", "
                + "subtotal = " + pedidoCompra.getSubtotal().toString() + ", "
                + "impuesto = " + pedidoCompra.getImpuesto() + ", "
                + "total = " + pedidoCompra.getTotal();
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "idPedidoCompra=" + pedidoCompra.getIdPedido().toString();
    }

}
