/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.TemuFans.Pedido.daoImpl;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Pedido.dao.PedidoVentaDAO;
import pe.edu.pucp.TemuFans.Pedido.model.PedidoVenta;
import pe.edu.pucp.TemuFans.db.DAOImpl;

/*
 *
 * @author Alvaro P.
 *
 */
public class PedidoVentaDAOImpl extends DAOImpl implements PedidoVentaDAO {
    
    private PedidoVenta pedidoVenta;
    
    public PedidoVentaDAOImpl() {
        super("Pedido_Venta");
        this.pedidoVenta = null;
    }

    @Override
    protected String obtenerListaDeAtributosParaInsert() {
        return "idPedidoVenta, idTransaccion, idCliente, idEmpleado, estado, "
                + "fechaCreacion, fechaCancelacion, fechaPago, subtotal, impuesto, total";
    }

    @Override
    protected String obtenerListaDeValoresParaInsert() {
        String sql = "";
        sql += pedidoVenta.getIdPedido().toString() + ", "
                + pedidoVenta.getIdTransaccion().toString() + ", "
                + pedidoVenta.getIdCliente().toString() + ", "
                + pedidoVenta.getIdEmpleado().toString() + ", "
                + pedidoVenta.getEstadoPedido().toString() + ", "
                + pedidoVenta.getFechaCreacion().toString() + ", "
                + pedidoVenta.getFechaCancelacion().toString() + ", "
                + pedidoVenta.getFechaDePago().toString() + ", "
                + pedidoVenta.getSubtotal().toString() + ", "
                + pedidoVenta.getImpuesto() + ", "
                + pedidoVenta.getTotal();
        
        return sql;
    }

    @Override
    protected String obtenerListaDeAtributosYValoresParaUpdate() {
        String sql = "";
        sql += "idPedidoVenta = " + pedidoVenta.getIdPedido().toString() + ", "
                + "idTransaccion = " + pedidoVenta.getIdTransaccion().toString() + ", "
                + "idCliente = " + pedidoVenta.getIdCliente().toString() + ", "
                + "idEmpleado = " + pedidoVenta.getIdEmpleado().toString() + ", "
                + "estado = " + pedidoVenta.getEstadoPedido().toString() + ", "
                + "fechaCreacion = " + pedidoVenta.getFechaCreacion().toString() + ", "
                + "fechaCancelacion = " + pedidoVenta.getFechaCancelacion().toString() + ", "
                + "fechaPago = " + pedidoVenta.getFechaDePago().toString() + ", "
                + "subtotal = " + pedidoVenta.getSubtotal().toString() + ", "
                + "impuesto = " + pedidoVenta.getImpuesto() + ", "
                + "total = " + pedidoVenta.getTotal();
        return sql;
    }

    @Override
    protected String obtenerCondicionWhereId() {
        return "idPedidoVenta=" + pedidoVenta.getIdPedido().toString();
    }

    @Override
    public Integer insertar(PedidoVenta pedidoVenta) {
        this.pedidoVenta=pedidoVenta;
        return this.insertar();
    }

    @Override
    public Integer modificar(PedidoVenta pedidoVenta) {
        this.pedidoVenta=pedidoVenta;
        return this.modificar();
    }

    @Override
    public Integer eliminar(PedidoVenta pedidoVenta) {
        this.pedidoVenta = pedidoVenta;
        return this.eliminar();
    }

    @Override
    public ArrayList<PedidoVenta> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
