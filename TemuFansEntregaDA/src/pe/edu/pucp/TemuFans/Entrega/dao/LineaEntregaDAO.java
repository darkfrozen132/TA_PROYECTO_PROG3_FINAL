/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Entrega.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Entrega.model.LineaEntrega;

/**
 *
 * @author usuario
 */
public interface LineaEntregaDAO {
    public Integer insertar(LineaEntrega lineaEntrega);
    
    public Integer modificar(LineaEntrega lineaEntrega);
    
    public Integer eliminar(LineaEntrega lineaEntrega);
    
    public ArrayList<LineaEntrega> listarTodos();
}
