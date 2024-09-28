/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.model;

/**
 *
 * @author usuario
 */
public class Producto {
    private Integer idProducto;
    private Integer idMarca;
    private String SKU;
    private String nombre;
    private Double precioUnitario;
    private String tipo;
    private EstadoProducto estadoProducto;

    public Producto(Integer idProducto, Integer idMarca, String SKU, String nombre, Double precioUnitario, String tipo, EstadoProducto estadoProducto) {
        this.idProducto = idProducto;
        this.idMarca = idMarca;
        this.SKU = SKU;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.tipo = tipo;
        this.estadoProducto = estadoProducto;
    }
    
    public Producto() {
        this.idProducto = null;
        this.idMarca = null;
        this.SKU = null;
        this.nombre = null;
        this.precioUnitario = null;
        this.tipo = null;
        this.estadoProducto = null;
    }


    /**
     * @return the SKU
     */
    public String getSKU() {
        return SKU;
    }

    /**
     * @param SKU the SKU to set
     */
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precioUnitario
     */
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
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
     * @return the idMarca
     */
    public Integer getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the estadoProducto
     */
    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    /**
     * @param estadoProducto the estadoProducto to set
     */
    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    
    
}
