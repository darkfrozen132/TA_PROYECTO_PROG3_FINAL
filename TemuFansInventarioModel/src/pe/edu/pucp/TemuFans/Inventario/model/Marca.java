/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.model;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Persona.model.Proveedor;

/**
 *
 * @author usuario
 */
public class Marca {
    private String nombre;
    private String descripcion;
    private Proveedor proveedor; 
    private ArrayList<Producto> productos;
    

    public Marca(String nombre, String descripcion, Proveedor proveedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
    }
    
    public Marca() {
        this.nombre = null;
        this.descripcion = null;
        this.proveedor = null;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
