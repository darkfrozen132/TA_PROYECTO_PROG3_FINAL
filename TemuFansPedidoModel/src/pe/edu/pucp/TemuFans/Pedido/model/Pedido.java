/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Pedido.model;

import java.util.Date;

/**
 *
 * @author usuario
 */
public abstract class Pedido {
    private Integer idPedido;
    private Date fechaCreacion;
    private Date fechaCancelacion;
    private Date fechaDePago;
    private Double subtotal;
    private TipoPedido tipoPedido;
    private EstadoPedido estadoPedido;

    public Pedido(Integer idPedido, Date fechaCreacion, Date fechaCancelacion, Date fechaDePago, Double subtotal, TipoPedido tipoPedido, EstadoPedido estadoPedido) {
        this.idPedido = idPedido;
        this.fechaCreacion = fechaCreacion;
        this.fechaCancelacion = fechaCancelacion;
        this.fechaDePago = fechaDePago;
        this.subtotal = subtotal;
        this.tipoPedido = tipoPedido;
        this.estadoPedido = estadoPedido;
    }

    public Pedido() {
        this.idPedido = null;
        this.fechaCreacion = null;
        this.fechaCancelacion = null;
        this.fechaDePago = null;
        this.subtotal = null;
        this.tipoPedido = null;
        this.estadoPedido = null;
    }

    /**
     * @return the idPedido
     */
    public Integer getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the fechaCancelacion
     */
    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    /**
     * @param fechaCancelacion the fechaCancelacion to set
     */
    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    /**
     * @return the fechaDePago
     */
    public Date getFechaDePago() {
        return fechaDePago;
    }

    /**
     * @param fechaDePago the fechaDePago to set
     */
    public void setFechaDePago(Date fechaDePago) {
        this.fechaDePago = fechaDePago;
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
     * @return the tipoPedido
     */
    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    /**
     * @param tipoPedido the tipoPedido to set
     */
    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    /**
     * @return the estadoPedido
     */
    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    /**
     * @param estadoPedido the estadoPedido to set
     */
    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    
    
}
