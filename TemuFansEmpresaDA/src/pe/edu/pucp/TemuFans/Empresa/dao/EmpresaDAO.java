/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Empresa.model.Empresa;

/**
 *
 * @author Ricardo
 */
public interface EmpresaDAO {
    public Integer insertar(Empresa empresa);
    
    public Integer modificar(Empresa empresa);
    
    public Integer eliminar(Empresa empresa);
    
    public ArrayList<Empresa> listarTodos();
}
