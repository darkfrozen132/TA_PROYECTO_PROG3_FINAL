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
    private String idProducto;
    private String SKU;
    private String nombre;
    private Double precioUnitario;
    private Double precioVenta;
    private TipoProducto tipoProducto;
    private Marca marca;

    public Producto(String idProducto, String SKU, String nombre, Double precioUnitario, Double precioVenta, TipoProducto tipoProducto, Marca marca) {
        this.idProducto = idProducto;
        this.SKU = SKU;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.precioVenta = precioVenta;
        this.tipoProducto = tipoProducto;
        this.marca = marca;
    }
    
    public Producto() {
        this.idProducto = null;
        this.SKU = null;
        this.nombre = null;
        this.precioUnitario = null;
        this.precioVenta = null;
        this.tipoProducto = null;
        this.marca = null;
    }

    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
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
     * @return the precioVenta
     */
    public Double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the tipoProducto
     */
    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    /**
     * @param tipoProducto the tipoProducto to set
     */
    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
}
