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
    private Integer idPaquete;
    private Integer idProducto;
    private Integer cantidadProductos;
    private Double peso;

    public Paquete(Integer idPaquete, Integer idProducto, Integer cantidadProductos, Double peso) {
        this.idPaquete = idPaquete;
        this.idProducto = idProducto;
        this.cantidadProductos = cantidadProductos;
        this.peso = peso;
    }

    public Paquete() {
        this.idPaquete = null;
        this.idProducto = null;
        this.cantidadProductos = null;
        this.peso = null;
    }

    /**
     * @return the idPaquete
     */
    public Integer getIdPaquete() {
        return idPaquete;
    }

    /**
     * @param idPaquete the idPaquete to set
     */
    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
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
     * @return the idProducto
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    
}
