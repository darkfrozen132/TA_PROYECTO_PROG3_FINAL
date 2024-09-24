/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Marca;

/**
 *
 * @author usuario
 */
public interface MarcaDAO {
    public Integer insertar(Marca marca);
    
    public Integer modificar(Marca marca);
    
    public Integer eliminar(Marca marca);
    
    public ArrayList<Marca> listarTodos();    
}
