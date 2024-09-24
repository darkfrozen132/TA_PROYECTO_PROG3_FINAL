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
    private Double sueldo;

    public Empleado(String id, String doi, String tipo_de_doi, String nombre, String direccion, Integer telefono,Double sueldo) {
        super(id, doi, tipo_de_doi, nombre, direccion, telefono);
        this.sueldo = sueldo;
    }

    public Empleado() {
        super();
        sueldo = null;
    }
    
    
}
