/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.model;


/**
 *
 * @author usuario
 */
public class Torre {
    private String idTorre;
    private Integer footprint; // es la cantidad de paquetes en la base
    private Integer cantidadFilas;
    private Integer cantidadCima;
    private Double peso;
    private Integer cantidadPaquetes; // Solo necesitamos la cantidad de paquetes
    private Paquete paquete; // para saber que tipo de paquetes tiene la torre
    private Dimension dimension;
    private Almacen almacen;

    public Torre(String idTorre, Integer footprint, Integer cantidadFilas, Integer cantidadCima, Double peso, Integer cantidadPaquetes, Paquete paquete, Dimension dimension, Almacen almacen) {
        this.idTorre = idTorre;
        this.footprint = footprint;
        this.cantidadFilas = cantidadFilas;
        this.cantidadCima = cantidadCima;
        this.peso = peso;
        this.cantidadPaquetes = cantidadPaquetes;
        this.paquete = paquete;
        this.dimension = dimension;
        this.almacen = almacen;
    }
    
    public Torre() {
        this.idTorre = null;
        this.footprint = null;
        this.cantidadFilas = null;
        this.cantidadCima = null;
        this.peso = null;
        this.cantidadPaquetes = null;
        this.paquete = null;
        this.dimension = null;
        this.almacen = null;
    }

    /**
     * @return the idTorre
     */
    public String getIdTorre() {
        return idTorre;
    }

    /**
     * @param idTorre the idTorre to set
     */
    public void setIdTorre(String idTorre) {
        this.idTorre = idTorre;
    }

    /**
     * @return the footprint
     */
    public Integer getFootprint() {
        return footprint;
    }

    /**
     * @param footprint the footprint to set
     */
    public void setFootprint(Integer footprint) {
        this.footprint = footprint;
    }

    /**
     * @return the cantidadFilas
     */
    public Integer getCantidadFilas() {
        return cantidadFilas;
    }

    /**
     * @param cantidadFilas the cantidadFilas to set
     */
    public void setCantidadFilas(Integer cantidadFilas) {
        this.cantidadFilas = cantidadFilas;
    }

    /**
     * @return the cantidadCima
     */
    public Integer getCantidadCima() {
        return cantidadCima;
    }

    /**
     * @param cantidadCima the cantidadCima to set
     */
    public void setCantidadCima(Integer cantidadCima) {
        this.cantidadCima = cantidadCima;
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

    /**
     * @return the cantidadPaquetes
     */
    public Integer getCantidadPaquetes() {
        return cantidadPaquetes;
    }

    /**
     * @param cantidadPaquetes the cantidadPaquetes to set
     */
    public void setCantidadPaquetes(Integer cantidadPaquetes) {
        this.cantidadPaquetes = cantidadPaquetes;
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

    /**
     * @return the dimension
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimension to set
     */
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    /**
     * @return the almacen
     */
    public Almacen getAlmacen() {
        return almacen;
    }

    /**
     * @param almacen the almacen to set
     */
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
}
