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
    private Integer idCliente;

    public PedidoVenta(Integer idPedido, Date fechaCreacion, Date fechaCancelacion, 
            Date fechaDePago, Double subtotal, TipoPedido tipoPedido, 
            EstadoPedido estadoPedido, double impuesto, Integer idTransaccion, 
            Integer idCliente, Integer idEmpleado, double total, ArrayList<LineaPedidoVenta> l) {
        super(idPedido, fechaCreacion, fechaCancelacion, fechaDePago, subtotal, tipoPedido, 
                estadoPedido, impuesto, total, idTransaccion, idEmpleado);
        this.lineasPedidoVentas = l;
        this.idCliente  = idCliente;
    }

    public PedidoVenta() {
        super();
        this.lineasPedidoVentas = null;
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
