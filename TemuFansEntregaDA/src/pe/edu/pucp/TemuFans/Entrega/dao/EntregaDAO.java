/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Entrega.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Entrega.model.Entrega;

/**
 *
 * @author usuario
 */
public interface EntregaDAO {
    public Integer insertar(Entrega entrega);
    
    public Integer modificar(Entrega entrega);
    
    public Integer eliminar(Entrega entrega);
    
    public ArrayList<Entrega> listarTodos();
}
