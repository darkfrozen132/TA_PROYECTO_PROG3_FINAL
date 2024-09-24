/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.model;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Almacen {
    private String idAlmacen;
    private String direccion;
    private Integer cantidadTorres;
    private ArrayList<Torre> torres;
    private Dimension dimension;

    public Almacen(String idAlmacen, String direccion, Integer cantidadTorres, ArrayList<Torre> torres, Dimension dimension) {
        this.idAlmacen = idAlmacen;
        this.direccion = direccion;
        this.cantidadTorres = cantidadTorres;
        this.torres = torres;
        this.dimension = dimension;
    }

    public Almacen() {
        this.idAlmacen = null;
        this.direccion = null;
        this.cantidadTorres = null;
        this.torres = null;
        this.dimension = null;
    }

    /**
     * @return the idAlmacen
     */
    public String getIdAlmacen() {
        return idAlmacen;
    }

    /**
     * @param idAlmacen the idAlmacen to set
     */
    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cantidadTorres
     */
    public Integer getCantidadTorres() {
        return cantidadTorres;
    }

    /**
     * @param cantidadTorres the cantidadTorres to set
     */
    public void setCantidadTorres(Integer cantidadTorres) {
        this.cantidadTorres = cantidadTorres;
    }

    /**
     * @return the torres
     */
    public ArrayList<Torre> getTorres() {
        return torres;
    }

    /**
     * @param torres the torres to set
     */
    public void setTorres(ArrayList<Torre> torres) {
        this.torres = torres;
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
    
}
