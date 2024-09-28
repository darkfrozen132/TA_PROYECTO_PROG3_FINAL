/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.model;


/**
 *
 * @author usuario
 */
public class Almacen {
    private Integer idAlmacen;
    private String direccion;
    private Integer cantidadTorres;

    public Almacen(Integer idAlmacen, String direccion, Integer cantidadTorres) {
        this.idAlmacen = idAlmacen;
        this.direccion = direccion;
        this.cantidadTorres = cantidadTorres;
    }

    public Almacen() {
        this.idAlmacen = null;
        this.direccion = null;
        this.cantidadTorres = null;
    }

    /**
     * @return the idAlmacen
     */
    public Integer getIdAlmacen() {
        return idAlmacen;
    }

    /**
     * @param idAlmacen the idAlmacen to set
     */
    public void setIdAlmacen(Integer idAlmacen) {
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
    
}
