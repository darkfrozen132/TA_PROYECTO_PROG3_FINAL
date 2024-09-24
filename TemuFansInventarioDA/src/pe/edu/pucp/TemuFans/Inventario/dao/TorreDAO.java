/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Torre;

/**
 *
 * @author usuario
 */
public interface TorreDAO {
    public Integer insertar(Torre torre);
    
    public Integer modificar(Torre torre);
    
    public Integer eliminar(Torre torre);
    
    public ArrayList<Torre> listarTodos();
}
