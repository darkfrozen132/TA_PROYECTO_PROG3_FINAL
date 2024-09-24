/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Persona.model;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Producto;

/**
 *
 * @author usuario
 */
public class Proveedor extends Usuario{
    private ArrayList<Producto> productos;

    public Proveedor(String id, String doi, String tipo_de_doi, String nombre, String direccion, Integer telefono, ArrayList<String> productos) {
        super(id, doi, tipo_de_doi, nombre, direccion, telefono);
       
    }

    public Proveedor() {
        super();
        productos = null;
    }
    
    
}
