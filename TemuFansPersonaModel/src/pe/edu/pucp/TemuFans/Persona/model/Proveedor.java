/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Persona.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Proveedor extends Usuario{

    /**
     * @return the idProveedor
     */
    public Integer getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the fecha_registro
     */
    public Date getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    private Integer idProveedor;
    private Integer idUsuario;
    private Date fecha_registro;
    private ArrayList<String> productos;

    public Proveedor(Integer id, String tipo_de_doi, String doi, String nombre, String correo, String direccion, Integer telefono) {
    super(id, tipo_de_doi, doi, nombre, correo, direccion, telefono);  // Llama al constructor de la clase base (Usuario)
    this.productos = new ArrayList<>();  // Inicializa la lista de productos
}

    
    
    
}
