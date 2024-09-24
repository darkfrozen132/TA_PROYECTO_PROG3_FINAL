/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Dimension;

/**
 *
 * @author usuario
 */
public interface DimensionDAO {
    public Integer insertar(Dimension dimension);
    
    public Integer modificar(Dimension dimension);
    
    public Integer eliminar(Dimension dimension);
    
    public ArrayList<Dimension> listarTodos();
}
