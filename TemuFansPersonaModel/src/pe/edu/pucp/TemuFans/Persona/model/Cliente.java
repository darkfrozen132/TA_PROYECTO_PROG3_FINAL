/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Persona.model;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cliente extends Usuario{
    private ArrayList<String> historial_pedidos;

    public Cliente(String id, String doi, String tipo_de_doi, String nombre, String direccion, Integer telefono) {
        super(id, doi, tipo_de_doi, nombre, direccion, telefono);
    }

    public Cliente() {
        super();
    }
    
    
}
