/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Pedido.model;

import pe.edu.pucp.TemuFans.Inventario.model.Paquete;

/**
 *
 * @author usuario
 */
public class LineaPedidoVenta {
    private Integer cantidad;
    private Double subtotal;
    private Paquete paquete;

    public LineaPedidoVenta(Integer cantidad, Double subtotal, Paquete paquete) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.paquete = paquete;
    }

    public LineaPedidoVenta() {
        this.cantidad = null;
        this.subtotal = null;
        this.paquete = null;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the paquete
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    
    
}
