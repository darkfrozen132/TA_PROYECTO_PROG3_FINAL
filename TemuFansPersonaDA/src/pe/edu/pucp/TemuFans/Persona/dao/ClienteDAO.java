/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.TemuFans.Persona.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Persona.model.Cliente;
/**
 *
 * @author usuario
 */
public interface ClienteDAO {
    public Integer insertar(Cliente cliente);
    
    public Integer modificar(Cliente cliente);
    
    public Integer eliminar(Cliente cliente);
    
    public ArrayList<Cliente> listarTodos();
}
