/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Inventario.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Inventario.model.Paquete;

/**
 *
 * @author usuario
 */
public interface PaqueteDAO {
    public Integer insertar(Paquete paquete);
    
    public Integer modificar(Paquete paquete);
    
    public Integer eliminar(Paquete paquete);
    
    public ArrayList<Paquete> listarTodos();
}
