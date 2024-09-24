/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Producto;

/**
 *
 * @author usuario
 */
public interface ProductoDAO {
    public Integer insertar(Producto producto);
    
    public Integer modificar(Producto producto);
    
    public Integer eliminar(Producto producto);
    
    public ArrayList<Producto> listarTodos();
}
