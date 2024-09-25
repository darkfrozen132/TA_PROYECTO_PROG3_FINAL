/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.model;

/**
 *
 * @author usuario
 */
public class Paquete {
    private String idPaquete;
    private Double pesoMaximoApilado;
    private Integer cantidadProductos;
    private Producto producto;
    private Torre torre;

    public Paquete(String idPaquete, Double pesoMaximoApilado, Integer cantidadProductos, Producto producto, Torre torre) {
        this.idPaquete = idPaquete;
        this.pesoMaximoApilado = pesoMaximoApilado;
        this.cantidadProductos = cantidadProductos;
        this.producto = producto;
        this.torre = torre;
    }

    public Paquete() {
        this.idPaquete = null;
        this.pesoMaximoApilado = null;
        this.cantidadProductos = null;
        this.producto = null;
        this.torre = null;
    }

    /**
     * @return the idPaquete
     */
    public String getIdPaquete() {
        return idPaquete;
    }

    /**
     * @param idPaquete the idPaquete to set
     */
    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    /**
     * @return the pesoMaximoApilado
     */
    public Double getPesoMaximoApilado() {
        return pesoMaximoApilado;
    }

    /**
     * @param pesoMaximoApilado the pesoMaximoApilado to set
     */
    public void setPesoMaximoApilado(Double pesoMaximoApilado) {
        this.pesoMaximoApilado = pesoMaximoApilado;
    }

    /**
     * @return the cantidadProductos
     */
    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    /**
     * @param cantidadProductos the cantidadProductos to set
     */
    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the torre
     */
    public Torre getTorre() {
        return torre;
    }

    /**
     * @param torre the torre to set
     */
    public void setTorre(Torre torre) {
        this.torre = torre;
    }
    
}
