/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Empresa.model.Banco;

/**
 *
 * @author Ricardo
 */
public interface BancoDAO {
    public Integer insertar(Banco banco);
    
    public Integer modificar(Banco banco);
    
    public Integer eliminar(Banco banco);
    
    public ArrayList<Banco> listarTodos();
}
