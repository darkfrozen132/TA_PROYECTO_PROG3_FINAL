/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.TemuFans.Empresa.dao;

import java.util.ArrayList;
import pe.edu.pucp.TemuFans.Empresa.model.CuentaBancaria;

/**
 *
 * @author Ricardo
 */
public interface CuentaBancariaDAO {
    public Integer insertar(CuentaBancaria cuentaBancaria);
    
    public Integer modificar(CuentaBancaria cuentaBancaria);
    
    public Integer eliminar(CuentaBancaria cuentaBancaria);
    
    public ArrayList<CuentaBancaria> listarTodos();
}
