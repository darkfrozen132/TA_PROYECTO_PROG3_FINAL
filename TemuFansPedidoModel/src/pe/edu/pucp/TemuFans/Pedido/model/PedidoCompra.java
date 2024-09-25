/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.TemuFans.Pedido.model;

import java.util.ArrayList;
import java.util.Date;

/*
 *
 * @author Alvaro P.
 *
 */
public class PedidoCompra extends Pedido {
    ArrayList<LineaPedidoCompra> lineasPedidoCompra;
    private Integer idProveedor;
    
    public PedidoCompra(Integer idPedido, Date fechaCreacion, Date fechaCancelacion, 
            Date fechaDePago, Double subtotal, TipoPedido tipoPedido, 
            EstadoPedido estadoPedido, double impuesto, Integer idTransaccion, 
            Integer idProveedor, Integer idEmpleado, double total, 
            ArrayList<LineaPedidoCompra> l) {
        super(idPedido, fechaCreacion, fechaCancelacion, fechaDePago, subtotal, tipoPedido, 
                estadoPedido, impuesto, total, idTransaccion, idEmpleado);
        this.idProveedor = idProveedor;
        this.lineasPedidoCompra = l;
    }
    
    public Integer getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    
}
