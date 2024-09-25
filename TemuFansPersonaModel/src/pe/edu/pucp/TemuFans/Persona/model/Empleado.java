/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Persona.model;

/**
 *
 * @author usuario
 */
public class Empleado extends Usuario{

    /**
     * @return the idEmpleado
     */
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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
     * @return the sueldo
     */
    public Double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    private Integer idEmpleado;
    private Integer idUsuario;
    private Double sueldo;

    public Empleado(Integer id, String doi, String tipo_de_doi, String nombre, String correo, String direccion, Integer telefono, Double sueldo) {
        super(id, doi, tipo_de_doi, nombre, correo, direccion, telefono); // Llama al constructor de Usuario
        this.sueldo = sueldo; // Inicializa el sueldo
    }
    
    
}
