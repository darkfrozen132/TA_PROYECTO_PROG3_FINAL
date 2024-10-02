/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Persona.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Persona.model.Empleado;

/**
 *
 * @author usuario
 */
public interface EmpleadoDAO {
    public Integer insertar(Empleado empleado);
    
    public Integer modificar(Empleado empleado);
    
    public Integer eliminar(Empleado empleado);
    
    public ArrayList<Empleado> listarTodos();
}
