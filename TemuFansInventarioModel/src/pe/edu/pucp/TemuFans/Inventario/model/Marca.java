/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.model;

import java.util.ArrayList;

//Hola como estas
/**
 *
 * @author usuario
 */
public class Marca {
    private Integer idMarca;
    private String nombre;
    private String descripcion;
    

    public Marca(Integer idMarca, String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idMarca = idMarca;
    }
    
    public Marca() {
        this.nombre = null;
        this.descripcion = null;
        this.idMarca = null;
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

    
}
