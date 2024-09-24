/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Almacen;

/**
 *
 * @author usuario
 */
public interface AlmacenDAO {
    public Integer insertar(Almacen almacen);
    
    public Integer modificar(Almacen almacen);
    
    public Integer eliminar(Almacen almacen);
    
    public ArrayList<Almacen> listarTodos();
}
