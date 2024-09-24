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
    
    public PedidoCompra(Integer idPedido, Date fechaCreacion, Date fechaCancelacion, Date fechaDePago, Double subtotal, TipoPedido tipoPedido, EstadoPedido estadoPedido, ArrayList<LineaPedidoCompra> l) {
        super(idPedido, fechaCreacion, fechaCancelacion, fechaDePago, subtotal, tipoPedido, estadoPedido);
        this.lineasPedidoCompra = l;
    }
}
