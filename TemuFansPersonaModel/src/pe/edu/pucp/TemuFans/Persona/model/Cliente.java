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
public class Cliente extends Usuario {

    private Integer idCliente;
    private Integer idUsuario;
    private Date fecha_registro;
    private ArrayList<String> historial_pedidos;

    // Getters y Setters
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public ArrayList<String> getHistorial_pedidos() {
        return historial_pedidos;
    }

    public void setHistorial_pedidos(ArrayList<String> historial_pedidos) {
        this.historial_pedidos = historial_pedidos;
    }

    // Constructor con parámetros
     public Cliente(Integer idCliente, Integer idUsuario, Date fecha_registro, ArrayList<String> historial_pedidos, 
                   Integer id, String doi, String tipo_de_doi, String nombre, String correo, String direccion, Integer telefono) {
        super(id, doi, tipo_de_doi, nombre, correo, direccion, telefono);  // Llama al constructor de la clase base Usuario
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.fecha_registro = fecha_registro;
        this.historial_pedidos = historial_pedidos != null ? historial_pedidos : new ArrayList<>(); // Inicializa la lista si no está vacía
    }

    
}