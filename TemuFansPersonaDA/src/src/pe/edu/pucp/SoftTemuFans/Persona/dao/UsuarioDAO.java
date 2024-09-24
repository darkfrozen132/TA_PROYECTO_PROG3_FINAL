/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.SoftTemuFans.Persona.dao;

import java.util.ArrayList;
import pe.edu.pucp.SoftTemuFans.Persona.model.Usuario;

/**
 *
 * @author usuario
 */
public interface UsuarioDAO {
    public Integer insertar(Usuario usuario);
    
    public Integer modificar(Usuario usuario);
    
    public Integer eliminar(Usuario usuario);
    
    public ArrayList<Usuario> listarTodos();
}
