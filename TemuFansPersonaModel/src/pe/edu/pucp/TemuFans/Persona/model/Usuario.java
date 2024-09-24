/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Persona.model;

/**
 *
 * @author usuario
 */
public abstract class Usuario {
    protected String id; //primary key
    private String doi;
    private String tipo_de_doi;
    private String nombre;
    private String direccion;
    private Integer telefono;

    public Usuario(String id, String doi, String tipo_de_doi, String nombre, String direccion, Integer telefono) {
        this.id = id;
        this.doi = doi;
        this.tipo_de_doi = tipo_de_doi;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public Usuario() {
        this.id = null;
        this.doi = null;
        this.tipo_de_doi = null;
        this.nombre = null;
        this.direccion = null;
        this.telefono = null;
    }
    
}
