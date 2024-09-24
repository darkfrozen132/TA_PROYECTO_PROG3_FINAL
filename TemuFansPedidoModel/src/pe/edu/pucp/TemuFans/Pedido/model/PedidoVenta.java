/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Pedido.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class PedidoVenta extends Pedido {
    ArrayList<LineaPedidoVenta> lineasPedidoVentas;

    public PedidoVenta(Integer idPedido, Date fechaCreacion, Date fechaCancelacion, Date fechaDePago, Double subtotal, TipoPedido tipoPedido, EstadoPedido estadoPedido, ArrayList<LineaPedidoVenta> l) {
        super(idPedido, fechaCreacion, fechaCancelacion, fechaDePago, subtotal, tipoPedido, estadoPedido);
        this.lineasPedidoVentas = l;
    }

    public PedidoVenta() {
        super();
        this.lineasPedidoVentas = null;
    }
    
    
}
