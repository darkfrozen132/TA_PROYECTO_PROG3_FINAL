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
    private Integer idAlmacen;
    private Integer nroTorre;
    private Double pesomaximo;

    public Torre(Integer idAlmacen, Integer nroTorre, Double pesomaximo) {
        this.nroTorre = nroTorre;
        this.idAlmacen = idAlmacen;
        this.pesomaximo = pesomaximo;
    }

    public Torre() {
        this.nroTorre = null;
        this.idAlmacen = null;
        this.pesomaximo = null;
    }

    /**
     * @return the nroTorre
     */
    public Integer getNroTorre() {
        return nroTorre;
    }

    /**
     * @param nroTorre the nroTorre to set
     */
    public void setNroTorre(Integer nroTorre) {
        this.nroTorre = nroTorre;
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
     * @return the pesomaximo
     */
    public Double getPesomaximo() {
        return pesomaximo;
    }

    /**
     * @param pesomaximo the pesomaximo to set
     */
    public void setPesomaximo(Double pesomaximo) {
        this.pesomaximo = pesomaximo;
    }
    
}
