/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Transaccion.model;

import java.util.Date;

/**
 *
 * @author Leoncio
 */
public class Transaccion {

    /**
     * @return the id_transaccion
     */
    public Integer getId_transaccion() {
        return id_transaccion;
    }

    /**
     * @param id_transaccion the id_transaccion to set
     */
    public void setId_transaccion(Integer id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    /**
     * @return the idCBancaria_Empresa
     */
    public Integer getIdCBancaria_Empresa() {
        return idCBancaria_Empresa;
    }

    /**
     * @param idCBancaria_Empresa the idCBancaria_Empresa to set
     */
    public void setIdCBancaria_Empresa(Integer idCBancaria_Empresa) {
        this.idCBancaria_Empresa = idCBancaria_Empresa;
    }

    /**
     * @return the idCBancaria_Contraria
     */
    public Integer getIdCBancaria_Contraria() {
        return idCBancaria_Contraria;
    }

    /**
     * @param idCBancaria_Contraria the idCBancaria_Contraria to set
     */
    public void setIdCBancaria_Contraria(Integer idCBancaria_Contraria) {
        this.idCBancaria_Contraria = idCBancaria_Contraria;
    }

    /**
     * @return the idPedidoCompra
     */
    public Integer getIdPedidoCompra() {
        return idPedidoCompra;
    }

    /**
     * @param idPedidoCompra the idPedidoCompra to set
     */
    public void setIdPedidoCompra(Integer idPedidoCompra) {
        this.idPedidoCompra = idPedidoCompra;
    }

    /**
     * @return the idPedidoVenta
     */
    public Integer getIdPedidoVenta() {
        return idPedidoVenta;
    }

    /**
     * @param idPedidoVenta the idPedidoVenta to set
     */
    public void setIdPedidoVenta(Integer idPedidoVenta) {
        this.idPedidoVenta = idPedidoVenta;
    }

    /**
     * @return the fecha_emision
     */
    public Date getFecha_emision() {
        return fecha_emision;
    }

    /**
     * @param fecha_emision the fecha_emision to set
     */
    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the impuestos
     */
    public double getImpuestos() {
        return impuestos;
    }

    /**
     * @param impuestos the impuestos to set
     */
    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the tipoTransaccion
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * @param tipoTransaccion the tipoTransaccion to set
     */
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
   
    private Integer id_transaccion;
    private Integer idCBancaria_Empresa;
    private Integer idCBancaria_Contraria;
    private Integer idPedidoCompra;
    private Integer idPedidoVenta;
    private Date fecha_emision;
    private double subtotal;
    private double impuestos;
    private double total;
    private String tipoTransaccion;
    
    public Transaccion(Integer id_transaccion, Integer idCBancaria_Empresa, Integer idCBancaria_Contraria, 
               Integer idPedidoCompra, Integer idPedidoVenta, Date fecha_emision, 
               double subtotal, double impuestos, double total, String tipoTransaccion) {
    this.id_transaccion = id_transaccion;
    this.idCBancaria_Empresa = idCBancaria_Empresa;
    this.idCBancaria_Contraria = idCBancaria_Contraria;
    this.idPedidoCompra = idPedidoCompra;
    this.idPedidoVenta = idPedidoVenta;
    this.fecha_emision = fecha_emision;
    this.subtotal = subtotal;
    this.impuestos = impuestos;
    this.total = total;
    this.tipoTransaccion = tipoTransaccion;
}

           
}
