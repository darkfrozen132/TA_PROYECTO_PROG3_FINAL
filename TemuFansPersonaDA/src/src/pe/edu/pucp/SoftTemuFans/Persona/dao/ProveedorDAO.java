/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.SoftTemuFans.Persona.dao;

import java.util.ArrayList;
import pe.edu.pucp.SoftTemuFans.Persona.model.Proveedor;

/**
 *
 * @author usuario
 */
public interface ProveedorDAO {
    public Integer insertar(Proveedor proveedor);
    
    public Integer modificar(Proveedor proveedor);
    
    public Integer eliminar(Proveedor proveedor);
    
    public ArrayList<Proveedor> listarTodos();
}
